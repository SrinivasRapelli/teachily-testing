package com.teachily.SchoolAdminTests;

import org.testng.annotations.Test;

import com.teachily.HomePageTests.LoginTest;
import com.teachily.SchoolAdminPages.CalendarPage;
import com.teachily.pages.BasePage;

public class CalendarTest extends BasePage{
	LoginTest loginTest;
	CalendarPage calendarPage;
	
	@Test
	public void addATask() throws InterruptedException {
		loginTest = new LoginTest();
		loginTest.loginAsAdmin();
		
		calendarPage = new CalendarPage(driver);
		calendarPage.clickOnCalendarMenu();
		calendarPage.clickOnAddIcon();
		calendarPage.enterTitleOfTheTask();
		calendarPage.addDescription();
		calendarPage.clickOnAddButton();
	}
}
