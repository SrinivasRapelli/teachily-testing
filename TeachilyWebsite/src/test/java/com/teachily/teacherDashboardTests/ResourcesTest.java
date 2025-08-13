package com.teachily.teacherDashboardTests;

import org.testng.annotations.Test;

import com.teachily.HomePageTests.LoginTest;
import com.teachily.pages.BasePage;
import com.teachily.teacherDashboardPages.ResourcesPage;

public class ResourcesTest extends BasePage {
	LoginTest loginTest;
	ResourcesPage resourcesPage;
	
	@Test
	public void testTheResourcePage() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsTeacher();
		
		resourcesPage = new ResourcesPage(driver);
		resourcesPage.clickonResourceMenu();
		resourcesPage.clickonAResource();
		resourcesPage.verifyTheResourceTitle();
		resourcesPage.verifyResourceDescription();
	}
}
