package com.acorr.stockPositionsAcceptance;

import org.concordion.integration.junit3.ConcordionTestCase;
import org.junit.BeforeClass;

public class StockPositionTestFixture extends ConcordionTestCase {
	
	@BeforeClass
	public static void addExtensions() {
	    System.setProperty("concordion.extensions", "org.concordion.ext.Extensions");
	}
	

}
