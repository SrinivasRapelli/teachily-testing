package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.SchoolAdminPages.TeachersPage;
import com.teachily.pages.BasePage;

public class TeachersTest extends BasePage{
	LoginTest loginTest;
	TeachersPage teachersPage;
	
	@Test
	public void addANewTeacher() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsAdmin();
		
		teachersPage = new TeachersPage(driver);
		teachersPage.clickOnTeachersMenu();
		teachersPage.clickOnNewTecherButton();
		teachersPage.ChooseAddManuallyOption();
		teachersPage.selectKeystage();
		teachersPage.selectYear();
		teachersPage.selectSubject();
		teachersPage.enterFname();
		teachersPage.enterLname();
		teachersPage.enterEmail();
		teachersPage.clickOnSaveTeacherButton();
		//teachersPage.verfiyTeacherCreation();
	}
}
