package com.acorr.stockPositions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang.StringUtils;
import org.milyn.Smooks;
import org.milyn.payload.JavaResult;
import org.xml.sax.SAXException;

import com.acorr.stockPositions.queryResultMessage.Query;
import com.acorr.stockPositions.queryResultMessage.Quotes;

public class YahooStockQuoteQueryEngine {

	private static final String URL_BASE = "http://query.yahooapis.com/v1/public/yql?q=%0Aselect%20Ask,%20AverageDailyVolume,%20Bid,%20AskRealtime,%20BidRealtime,%20BookValue,%20Change_PercentChange,%20Change,%20ChangeRealtime,%20LastTradeDate,%20EarningsShare,%20DaysLow,%20DaysHigh,%20YearLow,%20YearHigh,%20OrderBookRealtimeg,%20MarketCapitalization,%20MarketCapRealtimeg,%20ChangeFromYearLow,%20PercentChangeFromYearLow,%20ChangePercentRealtime,%20ChangeFromYearHigh,%20PercebtChangeFromYearHigh,%20LastTradePriceOnly,%20HighLimit,%20LowLimit,%20DaysRange,%20DaysRangeRealtime,%20FiftydayMovingAverage,%20TwoHundreddayMovingAverage,%20ChangeFromTwoHundreddayMovingAverage,%20PercentChangeFromTwoHundreddayMovingAverage,%20ChangeFromFiftydayMovingAverage,%20PercentChangeFromFiftydayMovingAverage,%20Name,%20Open,%20PreviousClose,%20PricePaid,%20ChangeinPercent,%20PriceSales,%20PriceBook,%20Symbol,%20ShortRatio,%20LastTradeTime,%20OneyrTargetPrice,%20Volume,%20YearRange,%20DaysValueChange,%20DaysValueChangeRealtime,%20StockExchange,%20PercentChange%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(";
	private static final String URL_END = ")&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
	
	public void getQuotes(String symbols) throws IOException, SAXException {
		URL queryUrl = getUrlForSymbols(symbols);
		String queryResult = executeQuery(queryUrl);
		List<Quotes> quotes = buildStockQuoteRecord(queryResult);
		StockQuoteWriter.writeQuote(quotes);
	}
	
	public String executeQuery(URL queryUrl) throws IOException {
		StringBuilder stockQuote = new StringBuilder();
		InputStream is = queryUrl.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String queryResultLine;

		while ((queryResultLine = br.readLine()) != null) {
			stockQuote.append(queryResultLine);
		}
		return stockQuote.toString();
	}
	
	private String getSymbolStringForQuery(String symbols) {
		String[] symbolArray = StringUtils.split(symbols, ',');
		List<String> symbolList = new ArrayList<String>();
		StringBuilder symbolStringForQuery = new StringBuilder();
		
		for (String singleSymbol : symbolArray) {
			StringBuilder symbolWithQuotes = new StringBuilder();
			symbolWithQuotes.append("%22" + singleSymbol + "%22");
			symbolList.add(symbolWithQuotes.toString());
		}
		
		for (String symbolInList : symbolList) {
			symbolStringForQuery.append(symbolInList);
			if (!symbolInList.equals(symbolList.get(symbolList.size() - 1))) {
				symbolStringForQuery.append(",");
			}
		}
		return symbolStringForQuery.toString();
	}
	
	public URL getUrlForSymbols(String symbols) throws MalformedURLException {
		return new URL(URL_BASE + getSymbolStringForQuery(symbols) + URL_END);
	}
	
	public List<Quotes> buildStockQuoteRecord(String stockQuote) throws IOException, SAXException {
		Smooks smooks = new Smooks("smooks-config/smooks-config.xml");
		ByteArrayInputStream inputStream = new ByteArrayInputStream(stockQuote.getBytes());
		List<Quotes> quoteList = new ArrayList<Quotes>();
		try {
			JavaResult javaResult = new JavaResult();
			smooks.filterSource(new StreamSource(inputStream), javaResult);
			Query query = (Query) javaResult.getBean("query");
			for (Quotes quote : query.getResults().getQuotes()) {
				quoteList.add(quote);
			}
		} finally {
			smooks.close();
		}
		return quoteList;
	}

}
