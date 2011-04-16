package com.acorr.stockPositionsAcceptance.marketDataQuery;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.domain.QuoteData;
import org.hibernate.util.DatabaseCleaner;
import org.hibernate.util.DatabaseReader;
import org.xml.sax.SAXException;

import com.acorr.stockPositions.YahooStockQuoteQueryEngine;
import com.acorr.stockPositionsAcceptance.StockPositionTestFixture;

public class RequestMarketDataTest extends StockPositionTestFixture {

	YahooStockQuoteQueryEngine queryEngine;
	
	public void initialise() {
		System.out.println(this.getName());
		DatabaseCleaner.cleanTable(QuoteData.class);
		queryEngine = new YahooStockQuoteQueryEngine();
	}
	
	public void getAllMarketDataForSymbols(String symbols) throws IOException, SAXException {
		queryEngine.getQuotes(symbols);
	}
	
	public Iterable<QuoteData> getAllPersistedMarketData() throws Exception {
		DatabaseReader dbReader = new DatabaseReader();
		List<QuoteData> storedQuotes = dbReader.readTable(QuoteData.class);
		Collections.sort(storedQuotes, new QuoteDataComparator());
		return storedQuotes;
	}
	
	private class QuoteDataComparator implements Comparator<QuoteData> {

		@Override
		public int compare(QuoteData thisQuote, QuoteData thatQuote) {
			int thisQuoteId = thisQuote.getQuoteId();
			int thatQuoteId = thatQuote.getQuoteId();
			if (thisQuoteId > thatQuoteId) {
				return 1;
			} else if (thisQuoteId < thatQuoteId) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}

}
