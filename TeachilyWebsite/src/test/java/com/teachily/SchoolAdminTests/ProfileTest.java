package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.SchoolAdminPages.ProfilePage;
import com.teachily.pages.BasePage;

public class ProfileTest extends BasePage{
	ProfilePage profilePage;
	LoginTest loginTest;
	
	@Test
	public void testProfilePage() throws InterruptedException {
		loginTest = new LoginTest();
		profilePage = new ProfilePage(driver);
		
		loginTest.loginAsAdmin();
		profilePage.clickOnProfile();
		profilePage.checkProfilePage();
		
	}
}
