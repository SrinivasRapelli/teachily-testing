package com.teachily.tests;

import org.testng.annotations.Test;

import com.teachily.pages.BasePage;
import com.teachily.pages.LoginPage;

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
