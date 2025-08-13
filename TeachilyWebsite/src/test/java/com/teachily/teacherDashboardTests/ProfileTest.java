package com.teachily.teacherDashboardTests;

import org.testng.annotations.Test;

import com.teachily.HomePageTests.LoginTest;
import com.teachily.pages.BasePage;
import com.teachily.teacherDashboardPages.ProfilePage;

public class ProfileTest extends BasePage{
	LoginTest loginTest;
	ProfilePage profilePage;
	
	@Test
	public void verifyTheTeacherProfilePage() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsTeacher();
		
		profilePage = new ProfilePage(driver);
		profilePage.clickOnProfileIcon();
		profilePage.verifyTheProfilePage();
	}
}
