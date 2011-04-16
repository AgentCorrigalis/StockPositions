package com.acorr.stockPositions;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.domain.QuoteData;
import org.hibernate.util.HIbernateUtil;

import com.acorr.stockPositions.queryResultMessage.Quotes;

public class StockQuoteWriter {

	public static void writeQuote(List<Quotes> stockQuotes) {

		for (Quotes quote : stockQuotes) {
			Session session = HIbernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			QuoteData quoteData = new QuoteData();
			quoteData.setChangeRealtime(quote.getChangeRealtime());
			quoteData.setLastTradeDate(quote.getLastTradeDate());
			quoteData.setEarningsShare(quote.getEarningsShare());
			quoteData.setDaysLow(quote.getDaysLow());
			quoteData.setDaysHigh(quote.getDaysHigh());
			quoteData.setYearLow(quote.getYearLow());
			quoteData.setYearHigh(quote.getYearHigh());
			quoteData.setMarketCapitalization(quote.getMarketCapitalization());
			quoteData.setChangeFromYearLow(quote.getChangeFromYearLow());
			quoteData.setPercentChangeFromYearLow(quote.getPercentChangeFromYearLow());
			quoteData.setChangePercentRealtime(quote.getChangePercentRealtime());
			quoteData.setChangeFromYearHigh(quote.getChangeFromYearHigh());
			quoteData.setPercebtChangeFromYearHigh(quote.getPercebtChangeFromYearHigh());
			quoteData.setLastTradePriceOnly(quote.getLastTradePriceOnly());
			quoteData.setHighLimit(quote.getHighLimit());
			quoteData.setLowLimit(quote.getLowLimit());
			quoteData.setDaysRange(quote.getDaysRange());
			quoteData.setDaysRangeRealtime(quote.getDaysRangeRealtime());
			quoteData.setFiftydayMovingAverage(quote.getFiftydayMovingAverage());
			quoteData.setTwoHundreddayMovingAverage(quote.getTwoHundreddayMovingAverage());
			quoteData.setChangeFromTwoHundreddayMovingAverage(quote.getChangeFromTwoHundreddayMovingAverage());
			quoteData.setPercentChangeFromTwoHundreddayMovingAverage(quote.getPercentChangeFromTwoHundreddayMovingAverage());
			quoteData.setChangeFromFiftydayMovingAverage(quote.getChangeFromFiftydayMovingAverage());
			quoteData.setPercentChangeFromFiftydayMovingAverage(quote.getPercentChangeFromFiftydayMovingAverage());
			quoteData.setName(quote.getName());
			quoteData.setOpen(quote.getOpen());
			quoteData.setPreviousClose(quote.getPreviousClose());
			quoteData.setPricePaid(quote.getPricePaid());
			quoteData.setChangeinPercent(quote.getChangeinPercent());
			quoteData.setPriceSales(quote.getPriceSales());
			quoteData.setPriceBook(quote.getPriceBook());
			quoteData.setSymbol(quote.getSymbol());
			quoteData.setShortRatio(quote.getShortRatio());
			quoteData.setLastTradeTime(quote.getLastTradeTime());
			quoteData.setOneyrTargetPrice(quote.getOneyrTargetPrice());
			quoteData.setVolume(quote.getVolume());
			quoteData.setYearRange(quote.getYearRange());
			quoteData.setDaysValueChange(quote.getDaysValueChange());
			quoteData.setDaysValueChangeRealtime(quote.getDaysValueChangeRealtime());
			quoteData.setStockExchange(quote.getStockExchange());
			quoteData.setPercentChange(quote.getPercentChange());
			quoteData.setAsk(quote.getAsk());
			quoteData.setAverageDailyVolume(quote.getAverageDailyVolume());
			quoteData.setBid(quote.getBid());
			quoteData.setAskRealtime(quote.getAskRealtime());
			quoteData.setBidRealtime(quote.getBidRealtime());
			quoteData.setBookValue(quote.getBookValue());
			quoteData.setChange_PercentChange(quote.getChangePercentChange());
			quoteData.setActualChange(quote.getChange());
			session.save(quoteData);
			session.getTransaction().commit();
		}
	}

}
