package com.acorr.stockPositions.marketDataQuery;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import junit.framework.TestCase;

import org.apache.commons.lang.StringUtils;

import com.acorr.stockPositions.YahooStockQuoteQueryEngine;

public class MarketDataQueryTest extends TestCase {
	
	YahooStockQuoteQueryEngine queryEngine;
	
	public void setUp() {
		queryEngine = new YahooStockQuoteQueryEngine();
	}
	
	public void testQueryUrlBuilderForOneSymbol() throws MalformedURLException {
		URL expectedUrlForOneSymbol = new URL("http://query.yahooapis.com/v1/public/yql?q=%0Aselect%20Ask,%20AverageDailyVolume,%20Bid,%20AskRealtime,%20BidRealtime,%20BookValue,%20Change_PercentChange,%20Change,%20ChangeRealtime,%20LastTradeDate,%20EarningsShare,%20DaysLow,%20DaysHigh,%20YearLow,%20YearHigh,%20OrderBookRealtimeg,%20MarketCapitalization,%20MarketCapRealtimeg,%20ChangeFromYearLow,%20PercentChangeFromYearLow,%20ChangePercentRealtime,%20ChangeFromYearHigh,%20PercebtChangeFromYearHigh,%20LastTradePriceOnly,%20HighLimit,%20LowLimit,%20DaysRange,%20DaysRangeRealtime,%20FiftydayMovingAverage,%20TwoHundreddayMovingAverage,%20ChangeFromTwoHundreddayMovingAverage,%20PercentChangeFromTwoHundreddayMovingAverage,%20ChangeFromFiftydayMovingAverage,%20PercentChangeFromFiftydayMovingAverage,%20Name,%20Open,%20PreviousClose,%20PricePaid,%20ChangeinPercent,%20PriceSales,%20PriceBook,%20Symbol,%20ShortRatio,%20LastTradeTime,%20OneyrTargetPrice,%20Volume,%20YearRange,%20DaysValueChange,%20DaysValueChangeRealtime,%20StockExchange,%20PercentChange%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22VOD%22)&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
		String symbols = "VOD";
		assertUrl(expectedUrlForOneSymbol, symbols);
	}
	
	public void testQueryUrlBuilderForTwoSymbols() throws MalformedURLException {
		URL expectedUrlForOneSymbol = new URL("http://query.yahooapis.com/v1/public/yql?q=%0Aselect%20Ask,%20AverageDailyVolume,%20Bid,%20AskRealtime,%20BidRealtime,%20BookValue,%20Change_PercentChange,%20Change,%20ChangeRealtime,%20LastTradeDate,%20EarningsShare,%20DaysLow,%20DaysHigh,%20YearLow,%20YearHigh,%20OrderBookRealtimeg,%20MarketCapitalization,%20MarketCapRealtimeg,%20ChangeFromYearLow,%20PercentChangeFromYearLow,%20ChangePercentRealtime,%20ChangeFromYearHigh,%20PercebtChangeFromYearHigh,%20LastTradePriceOnly,%20HighLimit,%20LowLimit,%20DaysRange,%20DaysRangeRealtime,%20FiftydayMovingAverage,%20TwoHundreddayMovingAverage,%20ChangeFromTwoHundreddayMovingAverage,%20PercentChangeFromTwoHundreddayMovingAverage,%20ChangeFromFiftydayMovingAverage,%20PercentChangeFromFiftydayMovingAverage,%20Name,%20Open,%20PreviousClose,%20PricePaid,%20ChangeinPercent,%20PriceSales,%20PriceBook,%20Symbol,%20ShortRatio,%20LastTradeTime,%20OneyrTargetPrice,%20Volume,%20YearRange,%20DaysValueChange,%20DaysValueChangeRealtime,%20StockExchange,%20PercentChange%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22VOD%22,%22RBS%22)&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
		String symbols = "VOD,RBS";
		assertUrl(expectedUrlForOneSymbol, symbols);
	}

	public void testQueryGetsQuote() throws IOException {
		String symbols = "VOD,RBS";
		URL queryUrl = queryEngine.getUrlForSymbols(symbols);
		assertSymbolsInStockQuote(symbols, queryEngine.executeQuery(queryUrl));
	}
	
	private void assertUrl(URL expectedUrl, String symbols) throws MalformedURLException {
		assertEquals(expectedUrl, queryEngine.getUrlForSymbols(symbols));		
	}
	
	private void assertSymbolsInStockQuote(String symbols, String stockQuote) {
		String[] symbolArray = StringUtils.split(symbols, ',');
		for (String symbol : symbolArray) {
			assertTrue("No stock quote was returned that contained " + symbol, stockQuote.contains(symbol));
		}
	}

}