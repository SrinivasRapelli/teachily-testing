package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.HomePageTests.LoginTest;
import com.teachily.SchoolAdminPages.FeaturesPage;
import com.teachily.pages.BasePage;

public class FeaturesTest extends BasePage {
	LoginTest loginTest;
	FeaturesPage featuresPage;
	
	@Test
	public void selfEnrolmentAsAStudent() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsAdmin();
		featuresPage = new FeaturesPage(driver);
		featuresPage.clickOnFeaturesMenu();
		featuresPage.copyTheLink();
		featuresPage.openTheLinkInNewPage();
		featuresPage.enterFirstName();
		featuresPage.enterLastName();
		featuresPage.enterEmailName();
		featuresPage.enterPassword();
		featuresPage.clickNextButton();
		featuresPage.selectAClass();
		featuresPage.clickOnDoneButton();
	}
}
