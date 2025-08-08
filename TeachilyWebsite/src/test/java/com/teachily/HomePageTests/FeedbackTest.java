package com.teachily.HomePageTests;

import org.testng.annotations.Test;

import com.teachily.pages.BasePage;
import com.teachily.pages.FeedbackPage;

public class FeedbackTest extends BasePage{
	FeedbackPage feedbackPage;
	
	@Test
	public void sendAFeedback() throws InterruptedException {
		feedbackPage = new FeedbackPage(driver);
		feedbackPage.clickFeedbackLink();
		feedbackPage.enterName();
		feedbackPage.enterEmail();
		feedbackPage.enterComments();
		feedbackPage.giveRatings();
		feedbackPage.clickOnSubmitButton();
		feedbackPage.checkSuccessmessage();
	}
}
