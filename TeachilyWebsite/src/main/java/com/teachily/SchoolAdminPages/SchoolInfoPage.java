package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SchoolInfoPage {
	
	WebDriver driver;
	public SchoolInfoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By schoolInfo = By.xpath("//*[span = \"School Information\"]");
	By updateBtn = By.xpath("//button[text()='Update']");
	By branch = By.id("branches");
	By students = By.id("students");
	By teachers = By.id("teachers");
	By saveBtn = By.xpath("//button[text()='Save Changes']");
	By schoolname = By.xpath("//h1[text()='IMPERIAL SCHOOL']");
	
	
	public void clickOnSchoolInfoMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(schoolInfo));
		element.click();
	}
	
	public void clickOnUpdateButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(updateBtn));
		element.click();
	}
	
	public void updateNumberOfBranches() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(branch));
		element.clear();
		element.sendKeys("10");
	}
	
	public void updateNumberOfTeachers() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(teachers));
		element.clear();
		element.sendKeys("50");
	}
	
	public void updateNumberOfStudents() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(students));
		element.clear();
		element.sendKeys("500");
	}
	
	public void clickOnSaveButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(saveBtn));
		element.click();
	}
	
	public void verifySchoolInfomationUpdate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(schoolname));
		String schoolName = element.getText();
		Assert.assertEquals(schoolName, "IMPERIAL SCHOOL");
		System.out.println(schoolName);
	}
	
	
}
