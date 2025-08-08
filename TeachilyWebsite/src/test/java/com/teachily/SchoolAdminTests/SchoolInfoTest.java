package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.SchoolAdminPages.SchoolInfoPage;
import com.teachily.pages.BasePage;

public class SchoolInfoTest extends BasePage {
	
	LoginTest loginTest;
	SchoolInfoPage schoolInfoPage;
	
	@Test
	public void updateSchoolInformation() throws InterruptedException {
		loginTest = new LoginTest();
		schoolInfoPage = new SchoolInfoPage(driver);
		
		loginTest.loginAsAdmin();
		schoolInfoPage.clickOnSchoolInfoMenu();
		schoolInfoPage.clickOnUpdateButton();
		schoolInfoPage.updateNumberOfBranches();
		schoolInfoPage.updateNumberOfStudents();
		schoolInfoPage.updateNumberOfTeachers();
		schoolInfoPage.clickOnSaveButton();
		schoolInfoPage.verifySchoolInfomationUpdate();
		
	}
}
