//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.10 at 12:08:13 PM BST 
//


package com.acorr.stockPositions.queryResultMessage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ChangeRealtime"/>
 *         &lt;element ref="{}LastTradeDate"/>
 *         &lt;element ref="{}EarningsShare"/>
 *         &lt;element ref="{}DaysLow"/>
 *         &lt;element ref="{}DaysHigh"/>
 *         &lt;element ref="{}YearLow"/>
 *         &lt;element ref="{}YearHigh"/>
 *         &lt;element ref="{}MarketCapitalization"/>
 *         &lt;element ref="{}ChangeFromYearLow"/>
 *         &lt;element ref="{}PercentChangeFromYearLow"/>
 *         &lt;element ref="{}ChangePercentRealtime"/>
 *         &lt;element ref="{}ChangeFromYearHigh"/>
 *         &lt;element ref="{}PercebtChangeFromYearHigh"/>
 *         &lt;element ref="{}LastTradePriceOnly"/>
 *         &lt;element ref="{}HighLimit"/>
 *         &lt;element ref="{}LowLimit"/>
 *         &lt;element ref="{}DaysRange"/>
 *         &lt;element ref="{}DaysRangeRealtime"/>
 *         &lt;element ref="{}FiftydayMovingAverage"/>
 *         &lt;element ref="{}TwoHundreddayMovingAverage"/>
 *         &lt;element ref="{}ChangeFromTwoHundreddayMovingAverage"/>
 *         &lt;element ref="{}PercentChangeFromTwoHundreddayMovingAverage"/>
 *         &lt;element ref="{}ChangeFromFiftydayMovingAverage"/>
 *         &lt;element ref="{}PercentChangeFromFiftydayMovingAverage"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Open"/>
 *         &lt;element ref="{}PreviousClose"/>
 *         &lt;element ref="{}PricePaid"/>
 *         &lt;element ref="{}ChangeinPercent"/>
 *         &lt;element ref="{}PriceSales"/>
 *         &lt;element ref="{}PriceBook"/>
 *         &lt;element ref="{}Symbol"/>
 *         &lt;element ref="{}ShortRatio"/>
 *         &lt;element ref="{}LastTradeTime"/>
 *         &lt;element ref="{}OneyrTargetPrice"/>
 *         &lt;element ref="{}Volume"/>
 *         &lt;element ref="{}YearRange"/>
 *         &lt;element ref="{}DaysValueChange"/>
 *         &lt;element ref="{}DaysValueChangeRealtime"/>
 *         &lt;element ref="{}StockExchange"/>
 *         &lt;element ref="{}PercentChange"/>
 *         &lt;element ref="{}Ask"/>
 *         &lt;element ref="{}AverageDailyVolume"/>
 *         &lt;element ref="{}Bid"/>
 *         &lt;element ref="{}AskRealtime"/>
 *         &lt;element ref="{}BidRealtime"/>
 *         &lt;element ref="{}BookValue"/>
 *         &lt;element ref="{}Change_PercentChange"/>
 *         &lt;element ref="{}Change"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeRealtime",
    "lastTradeDate",
    "earningsShare",
    "daysLow",
    "daysHigh",
    "yearLow",
    "yearHigh",
    "marketCapitalization",
    "changeFromYearLow",
    "percentChangeFromYearLow",
    "changePercentRealtime",
    "changeFromYearHigh",
    "percebtChangeFromYearHigh",
    "lastTradePriceOnly",
    "highLimit",
    "lowLimit",
    "daysRange",
    "daysRangeRealtime",
    "fiftydayMovingAverage",
    "twoHundreddayMovingAverage",
    "changeFromTwoHundreddayMovingAverage",
    "percentChangeFromTwoHundreddayMovingAverage",
    "changeFromFiftydayMovingAverage",
    "percentChangeFromFiftydayMovingAverage",
    "name",
    "open",
    "previousClose",
    "pricePaid",
    "changeinPercent",
    "priceSales",
    "priceBook",
    "symbol",
    "shortRatio",
    "lastTradeTime",
    "oneyrTargetPrice",
    "volume",
    "yearRange",
    "daysValueChange",
    "daysValueChangeRealtime",
    "stockExchange",
    "percentChange",
    "ask",
    "averageDailyVolume",
    "bid",
    "askRealtime",
    "bidRealtime",
    "bookValue",
    "changePercentChange",
    "change"
})
@XmlRootElement(name = "quote")
public class Quotes {

    @XmlElement(name = "ChangeRealtime", required = true)
    protected String changeRealtime;
    @XmlElement(name = "LastTradeDate", required = true)
    protected String lastTradeDate;
    @XmlElement(name = "EarningsShare", required = true)
    protected String earningsShare;
    @XmlElement(name = "DaysLow", required = true)
    protected String daysLow;
    @XmlElement(name = "DaysHigh", required = true)
    protected String daysHigh;
    @XmlElement(name = "YearLow", required = true)
    protected String yearLow;
    @XmlElement(name = "YearHigh", required = true)
    protected String yearHigh;
    @XmlElement(name = "MarketCapitalization", required = true)
    protected String marketCapitalization;
    @XmlElement(name = "ChangeFromYearLow", required = true)
    protected String changeFromYearLow;
    @XmlElement(name = "PercentChangeFromYearLow", required = true)
    protected String percentChangeFromYearLow;
    @XmlElement(name = "ChangePercentRealtime", required = true)
    protected String changePercentRealtime;
    @XmlElement(name = "ChangeFromYearHigh", required = true)
    protected String changeFromYearHigh;
    @XmlElement(name = "PercebtChangeFromYearHigh", required = true)
    protected String percebtChangeFromYearHigh;
    @XmlElement(name = "LastTradePriceOnly", required = true)
    protected String lastTradePriceOnly;
    @XmlElement(name = "HighLimit", required = true)
    protected String highLimit;
    @XmlElement(name = "LowLimit", required = true)
    protected String lowLimit;
    @XmlElement(name = "DaysRange", required = true)
    protected String daysRange;
    @XmlElement(name = "DaysRangeRealtime", required = true)
    protected String daysRangeRealtime;
    @XmlElement(name = "FiftydayMovingAverage", required = true)
    protected String fiftydayMovingAverage;
    @XmlElement(name = "TwoHundreddayMovingAverage", required = true)
    protected String twoHundreddayMovingAverage;
    @XmlElement(name = "ChangeFromTwoHundreddayMovingAverage", required = true)
    protected String changeFromTwoHundreddayMovingAverage;
    @XmlElement(name = "PercentChangeFromTwoHundreddayMovingAverage", required = true)
    protected String percentChangeFromTwoHundreddayMovingAverage;
    @XmlElement(name = "ChangeFromFiftydayMovingAverage", required = true)
    protected String changeFromFiftydayMovingAverage;
    @XmlElement(name = "PercentChangeFromFiftydayMovingAverage", required = true)
    protected String percentChangeFromFiftydayMovingAverage;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Open", required = true)
    protected String open;
    @XmlElement(name = "PreviousClose", required = true)
    protected String previousClose;
    @XmlElement(name = "PricePaid", required = true)
    protected String pricePaid;
    @XmlElement(name = "ChangeinPercent", required = true)
    protected String changeinPercent;
    @XmlElement(name = "PriceSales", required = true)
    protected String priceSales;
    @XmlElement(name = "PriceBook", required = true)
    protected String priceBook;
    @XmlElement(name = "Symbol", required = true)
    protected String symbol;
    @XmlElement(name = "ShortRatio", required = true)
    protected String shortRatio;
    @XmlElement(name = "LastTradeTime", required = true)
    protected String lastTradeTime;
    @XmlElement(name = "OneyrTargetPrice", required = true)
    protected String oneyrTargetPrice;
    @XmlElement(name = "Volume", required = true)
    protected String volume;
    @XmlElement(name = "YearRange", required = true)
    protected String yearRange;
    @XmlElement(name = "DaysValueChange", required = true)
    protected String daysValueChange;
    @XmlElement(name = "DaysValueChangeRealtime", required = true)
    protected String daysValueChangeRealtime;
    @XmlElement(name = "StockExchange", required = true)
    protected String stockExchange;
    @XmlElement(name = "PercentChange", required = true)
    protected String percentChange;
    @XmlElement(name = "Ask", required = true)
    protected String ask;
    @XmlElement(name = "AverageDailyVolume", required = true)
    protected String averageDailyVolume;
    @XmlElement(name = "Bid", required = true)
    protected String bid;
    @XmlElement(name = "AskRealtime", required = true)
    protected String askRealtime;
    @XmlElement(name = "BidRealtime", required = true)
    protected String bidRealtime;
    @XmlElement(name = "BookValue", required = true)
    protected String bookValue;
    @XmlElement(name = "Change_PercentChange", required = true)
    protected String changePercentChange;
    @XmlElement(name = "Change", required = true)
    protected String change;

    /**
     * Gets the value of the changeRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeRealtime() {
        return changeRealtime;
    }

    /**
     * Sets the value of the changeRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeRealtime(String value) {
        this.changeRealtime = value;
    }

    /**
     * Gets the value of the lastTradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTradeDate() {
        return lastTradeDate;
    }

    /**
     * Sets the value of the lastTradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTradeDate(String value) {
        this.lastTradeDate = value;
    }

    /**
     * Gets the value of the earningsShare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarningsShare() {
        return earningsShare;
    }

    /**
     * Sets the value of the earningsShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarningsShare(String value) {
        this.earningsShare = value;
    }

    /**
     * Gets the value of the daysLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysLow() {
        return daysLow;
    }

    /**
     * Sets the value of the daysLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysLow(String value) {
        this.daysLow = value;
    }

    /**
     * Gets the value of the daysHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysHigh() {
        return daysHigh;
    }

    /**
     * Sets the value of the daysHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysHigh(String value) {
        this.daysHigh = value;
    }

    /**
     * Gets the value of the yearLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearLow() {
        return yearLow;
    }

    /**
     * Sets the value of the yearLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearLow(String value) {
        this.yearLow = value;
    }

    /**
     * Gets the value of the yearHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearHigh() {
        return yearHigh;
    }

    /**
     * Sets the value of the yearHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearHigh(String value) {
        this.yearHigh = value;
    }

    /**
     * Gets the value of the marketCapitalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    /**
     * Sets the value of the marketCapitalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCapitalization(String value) {
        this.marketCapitalization = value;
    }

    /**
     * Gets the value of the changeFromYearLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFromYearLow() {
        return changeFromYearLow;
    }

    /**
     * Sets the value of the changeFromYearLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFromYearLow(String value) {
        this.changeFromYearLow = value;
    }

    /**
     * Gets the value of the percentChangeFromYearLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentChangeFromYearLow() {
        return percentChangeFromYearLow;
    }

    /**
     * Sets the value of the percentChangeFromYearLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentChangeFromYearLow(String value) {
        this.percentChangeFromYearLow = value;
    }

    /**
     * Gets the value of the changePercentRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePercentRealtime() {
        return changePercentRealtime;
    }

    /**
     * Sets the value of the changePercentRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePercentRealtime(String value) {
        this.changePercentRealtime = value;
    }

    /**
     * Gets the value of the changeFromYearHigh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public String getChangeFromYearHigh() {
        return changeFromYearHigh;
    }

    /**
     * Sets the value of the changeFromYearHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeFromYearHigh(String value) {
        this.changeFromYearHigh = value;
    }

    /**
     * Gets the value of the percebtChangeFromYearHigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercebtChangeFromYearHigh() {
        return percebtChangeFromYearHigh;
    }

    /**
     * Sets the value of the percebtChangeFromYearHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercebtChangeFromYearHigh(String value) {
        this.percebtChangeFromYearHigh = value;
    }

    /**
     * Gets the value of the lastTradePriceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }

    /**
     * Sets the value of the lastTradePriceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTradePriceOnly(String value) {
        this.lastTradePriceOnly = value;
    }

    /**
     * Gets the value of the highLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighLimit() {
        return highLimit;
    }

    /**
     * Sets the value of the highLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighLimit(String value) {
        this.highLimit = value;
    }

    /**
     * Gets the value of the lowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowLimit() {
        return lowLimit;
    }

    /**
     * Sets the value of the lowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowLimit(String value) {
        this.lowLimit = value;
    }

    /**
     * Gets the value of the daysRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysRange() {
        return daysRange;
    }

    /**
     * Sets the value of the daysRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysRange(String value) {
        this.daysRange = value;
    }

    /**
     * Gets the value of the daysRangeRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysRangeRealtime() {
        return daysRangeRealtime;
    }

    /**
     * Sets the value of the daysRangeRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysRangeRealtime(String value) {
        this.daysRangeRealtime = value;
    }

    /**
     * Gets the value of the fiftydayMovingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiftydayMovingAverage() {
        return fiftydayMovingAverage;
    }

    /**
     * Sets the value of the fiftydayMovingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiftydayMovingAverage(String value) {
        this.fiftydayMovingAverage = value;
    }

    /**
     * Gets the value of the twoHundreddayMovingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwoHundreddayMovingAverage() {
        return twoHundreddayMovingAverage;
    }

    /**
     * Sets the value of the twoHundreddayMovingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwoHundreddayMovingAverage(String value) {
        this.twoHundreddayMovingAverage = value;
    }

    /**
     * Gets the value of the changeFromTwoHundreddayMovingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFromTwoHundreddayMovingAverage() {
        return changeFromTwoHundreddayMovingAverage;
    }

    /**
     * Sets the value of the changeFromTwoHundreddayMovingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFromTwoHundreddayMovingAverage(String value) {
        this.changeFromTwoHundreddayMovingAverage = value;
    }

    /**
     * Gets the value of the percentChangeFromTwoHundreddayMovingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentChangeFromTwoHundreddayMovingAverage() {
        return percentChangeFromTwoHundreddayMovingAverage;
    }

    /**
     * Sets the value of the percentChangeFromTwoHundreddayMovingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentChangeFromTwoHundreddayMovingAverage(String value) {
        this.percentChangeFromTwoHundreddayMovingAverage = value;
    }

    /**
     * Gets the value of the changeFromFiftydayMovingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFromFiftydayMovingAverage() {
        return changeFromFiftydayMovingAverage;
    }

    /**
     * Sets the value of the changeFromFiftydayMovingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFromFiftydayMovingAverage(String value) {
        this.changeFromFiftydayMovingAverage = value;
    }

    /**
     * Gets the value of the percentChangeFromFiftydayMovingAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentChangeFromFiftydayMovingAverage() {
        return percentChangeFromFiftydayMovingAverage;
    }

    /**
     * Sets the value of the percentChangeFromFiftydayMovingAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentChangeFromFiftydayMovingAverage(String value) {
        this.percentChangeFromFiftydayMovingAverage = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpen(String value) {
        this.open = value;
    }

    /**
     * Gets the value of the previousClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousClose() {
        return previousClose;
    }

    /**
     * Sets the value of the previousClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousClose(String value) {
        this.previousClose = value;
    }

    /**
     * Gets the value of the pricePaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePaid() {
        return pricePaid;
    }

    /**
     * Sets the value of the pricePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePaid(String value) {
        this.pricePaid = value;
    }

    /**
     * Gets the value of the changeinPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeinPercent() {
        return changeinPercent;
    }

    /**
     * Sets the value of the changeinPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeinPercent(String value) {
        this.changeinPercent = value;
    }

    /**
     * Gets the value of the priceSales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSales() {
        return priceSales;
    }

    /**
     * Sets the value of the priceSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSales(String value) {
        this.priceSales = value;
    }

    /**
     * Gets the value of the priceBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceBook() {
        return priceBook;
    }

    /**
     * Sets the value of the priceBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceBook(String value) {
        this.priceBook = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the shortRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortRatio() {
        return shortRatio;
    }

    /**
     * Sets the value of the shortRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortRatio(String value) {
        this.shortRatio = value;
    }

    /**
     * Gets the value of the lastTradeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTradeTime() {
        return lastTradeTime;
    }

    /**
     * Sets the value of the lastTradeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTradeTime(String value) {
        this.lastTradeTime = value;
    }

    /**
     * Gets the value of the oneyrTargetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneyrTargetPrice() {
        return oneyrTargetPrice;
    }

    /**
     * Sets the value of the oneyrTargetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneyrTargetPrice(String value) {
        this.oneyrTargetPrice = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the yearRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearRange() {
        return yearRange;
    }

    /**
     * Sets the value of the yearRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearRange(String value) {
        this.yearRange = value;
    }

    /**
     * Gets the value of the daysValueChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysValueChange() {
        return daysValueChange;
    }

    /**
     * Sets the value of the daysValueChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysValueChange(String value) {
        this.daysValueChange = value;
    }

    /**
     * Gets the value of the daysValueChangeRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysValueChangeRealtime() {
        return daysValueChangeRealtime;
    }

    /**
     * Sets the value of the daysValueChangeRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysValueChangeRealtime(String value) {
        this.daysValueChangeRealtime = value;
    }

    /**
     * Gets the value of the stockExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockExchange() {
        return stockExchange;
    }

    /**
     * Sets the value of the stockExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockExchange(String value) {
        this.stockExchange = value;
    }

    /**
     * Gets the value of the percentChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentChange() {
        return percentChange;
    }

    /**
     * Sets the value of the percentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentChange(String value) {
        this.percentChange = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsk(String value) {
        this.ask = value;
    }

    /**
     * Gets the value of the averageDailyVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageDailyVolume() {
        return averageDailyVolume;
    }

    /**
     * Sets the value of the averageDailyVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageDailyVolume(String value) {
        this.averageDailyVolume = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBid(String value) {
        this.bid = value;
    }

    /**
     * Gets the value of the askRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAskRealtime() {
        return askRealtime;
    }

    /**
     * Sets the value of the askRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAskRealtime(String value) {
        this.askRealtime = value;
    }

    /**
     * Gets the value of the bidRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidRealtime() {
        return bidRealtime;
    }

    /**
     * Sets the value of the bidRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidRealtime(String value) {
        this.bidRealtime = value;
    }

    /**
     * Gets the value of the bookValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookValue() {
        return bookValue;
    }

    /**
     * Sets the value of the bookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookValue(String value) {
        this.bookValue = value;
    }

    /**
     * Gets the value of the changePercentChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePercentChange() {
        return changePercentChange;
    }

    /**
     * Sets the value of the changePercentChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePercentChange(String value) {
        this.changePercentChange = value;
    }

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChange(String value) {
        this.change = value;
    }

}