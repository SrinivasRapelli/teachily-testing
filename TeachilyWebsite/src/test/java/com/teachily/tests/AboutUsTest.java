package com.teachily.tests;

import org.testng.annotations.Test;

import com.teachily.pages.AboutUsPage;
import com.teachily.pages.BasePage;

public class AboutUsTest extends BasePage{
	AboutUsPage aboutUsPage;
	
	@Test
	public void checkAboutUsPage() {
		aboutUsPage = new AboutUsPage(driver);
		aboutUsPage.clickOnAbooutUs();
		aboutUsPage.readTheHeader();
	}
}
