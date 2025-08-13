package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPage {
	WebDriver driver;
	public CalendarPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By calendarMenu = By.xpath("//*[text()=\"Calendar\"]");
	By addIcon = By.xpath("(//button)[8]");
	By title = By.id("title");
	By description = By.id("description");
	By addButton = By.xpath("//button[text()=\"Add\"]");
	
	
	public void clickOnCalendarMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(calendarMenu));
		element.click();
	}
	
	public void clickOnAddIcon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addIcon));
		element.click();
	}
	
	
	public void enterTitleOfTheTask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
		element.sendKeys("Task 1");
	}
	
	public void addDescription() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(description));
		element.sendKeys("Hello");
	}
	
	public void clickOnAddButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addButton));
		element.click();
	}
}
