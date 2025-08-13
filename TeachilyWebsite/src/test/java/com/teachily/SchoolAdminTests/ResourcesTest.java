package com.teachily.SchoolAdminTests;

import com.teachily.pages.BasePage;

import org.testng.annotations.Test;

import com.teachily.HomePageTests.LoginTest;
import com.teachily.SchoolAdminPages.*;

public class ResourcesTest extends BasePage{
	LoginTest loginTest;
	ResourcesPage resourcesPage;
	
	@Test
	public void testTheResourcePage() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsAdmin();
		resourcesPage = new ResourcesPage(driver);
		
		resourcesPage.clickOnResourcesmenu();
		resourcesPage.clickTheResourceCard();
		resourcesPage.verifyTheResourcePage();
	}
}
