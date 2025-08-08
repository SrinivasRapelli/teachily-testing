package com.teachily.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FeedbackPage {
	WebDriver driver;
	
	public FeedbackPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By feedback = By.xpath("//a[text()='Feedback']");
	By name = By.xpath("//*[@id='name']");
	By email = By.xpath("//*[@id='email']");
	By comment = By.xpath("//*[@id='feedback']");
	By starRating = By.xpath("//span[@aria-label='Rate 5 stars']");
	By submitBtn = By.xpath("//button[text()='Submit']");
	By successmessage = By.xpath("//*[text()='Thank you for your feedback!']");
	
	
			
	public void clickFeedbackLink() throws InterruptedException {
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(feedback));
		Actions actions  = new Actions(driver);
		actions.moveToElement(element);
		Thread.sleep(3000);
		element.click();
	}
	
	public void enterName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(name));
		element.sendKeys("Srini");
		
	}
	
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("sreenmaahi@gmail.com");
	}
	
	public void enterComments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(comment));
		element.sendKeys("Excellent website for Schools");
	}
	
	public void giveRatings() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(starRating));
		element.click();
	}

	public void clickOnSubmitButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
		element.click();
	}
	public void checkSuccessmessage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(successmessage));
		String successmsg= element.getText();
		Assert.assertEquals(successmsg,"Thank you for your feedback!");
		System.out.println(successmsg);
		
	}

	
}
