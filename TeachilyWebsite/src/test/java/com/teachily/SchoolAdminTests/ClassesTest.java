package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.HomePageTests.LoginTest;
import com.teachily.SchoolAdminPages.ClassesPage;
import com.teachily.pages.BasePage;

public class ClassesTest extends BasePage {
	LoginTest loginTest;
	ClassesPage classesPage;
	
	@Test
	public void creatingANewClass() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsAdmin();
		
		classesPage = new ClassesPage(driver);
		classesPage.clickOnClassMenu();
		classesPage.clickOnNewClassButton();
		classesPage.selectKeyStage();
		classesPage.selectYear();
		classesPage.selectSubject();
		classesPage.enterClassName();
		classesPage.enterSection();
		classesPage.clickOnNextButton();
		classesPage.addTeacherToTheClass();
		classesPage.clickOnNextButton();
		classesPage.clickOnCreateClassBtn();
		classesPage.verifyClassCreation();
		
	}
}
