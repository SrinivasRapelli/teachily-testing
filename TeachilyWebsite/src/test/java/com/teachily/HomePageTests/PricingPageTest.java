package com.teachily.HomePageTests;

import org.testng.annotations.Test;

import com.teachily.pages.BasePage;
import com.teachily.pages.PricingPage;

public class PricingPageTest extends BasePage {
	PricingPage pricingPage;
	
	@Test
	public void testPricingPage() {
		pricingPage = new PricingPage(driver);
		pricingPage.clickOnPricing();
		pricingPage.readPlan();
		pricingPage.clickOnChoosePlan();
		pricingPage.acceptThecheckbox();
		pricingPage.clickOnProceedToPayments();
	}
	
	
}
