package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.SchoolAdminPages.LoginPage;
import com.teachily.pages.BasePage;

public class LoginTest extends BasePage{

	LoginPage loginPage;
	
	@Test
	public void loginAsAdmin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.navigateToLoginPage();
		loginPage.selectTheRole();
		//loginPage.enterAccessCode();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.clickOnLoginButton();	
	}
	
	
}
