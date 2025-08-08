package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.SchoolAdminPages.StudentsPage;
import com.teachily.pages.BasePage;

public class StudentsTest extends BasePage{
	LoginTest loginTest;
	StudentsPage  studentsPage;
	
	@Test
	public void addANewStudent() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsAdmin();
		
		studentsPage = new StudentsPage(driver);
		studentsPage.clickOnStudentsMenu();
		studentsPage.clickOnNewStudentButton();
		studentsPage.ChooseAddManuallyOption();
		studentsPage.selectKeystage();
		studentsPage.selectYear();
		studentsPage.enterFname();
		studentsPage.enterLname();
		studentsPage.enterEmail();
		studentsPage.clickOnSaveStudentButton();
		studentsPage.verfiyStudentCreation();
	}
}
