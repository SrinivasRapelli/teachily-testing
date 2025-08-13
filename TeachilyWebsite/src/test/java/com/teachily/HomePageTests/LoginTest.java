package com.teachily.HomePageTests;

import org.testng.annotations.Test;

import com.teachily.pages.BasePage;
import com.teachily.pages.LoginPage;

public class LoginTest extends BasePage{

	LoginPage loginPage;
	
	@Test(priority = 0)
	public void loginAsAdmin()  {
		loginPage = new LoginPage(driver);
		loginPage.navigateToLoginPage();
		loginPage.selectTheRoleAsAdmin();
		loginPage.enterAdminEmail();
		loginPage.enterAdminPassword();
		loginPage.clickOnLoginButton();	
	}
	
	
	public void loginAsTeacher() {
		loginPage = new LoginPage(driver);
		loginPage.navigateToLoginPage();
		loginPage.selectTheRoleAsTeacher();
		loginPage.enterAccessCode();
		loginPage.enterTeacherEmail();
		loginPage.enterTeacherPassword();
		loginPage.clickOnLoginButton();	
	}
	
	
	public void loginAsStudent(){
		loginPage = new LoginPage(driver);
		loginPage.navigateToLoginPage();
		loginPage.selectTheRoleAsStudent();
		loginPage.enterAccessCode();
		loginPage.enterStudentEmail();
		loginPage.enterStudentPassword();
		loginPage.clickOnLoginButton();	
	}
	
}
