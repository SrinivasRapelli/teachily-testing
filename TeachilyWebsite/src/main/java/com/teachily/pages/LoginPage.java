package com.teachily.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginLink = By.xpath("//*[text()='Log in']");
	By loginasSchoolmember = By.xpath("//*[@class = 'block']");
	By selectRole = By.xpath("//*[@name=\"role\"]");
	By accesscode = By.xpath("//*[@placeholder=\"School Access Code\"]");
	By email = By.xpath("//*[@placeholder=\"Email\"]");
	By password = By.xpath("//*[@placeholder=\"Password\"]");
	By loginButton = By.xpath("//button[text()='Login']");
	
	
	public void navigateToLoginPage()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(loginasSchoolmember));
		element1.click();
	}
	
	public void selectTheRoleAsAdmin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectRole));
		Select select = new Select(element);
		select.selectByVisibleText("Admin");
	}
	
	public void enterAdminEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("srinivasrapelli888@gmail.com");
	}
	
	public void enterAdminPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		element.sendKeys("Sr@12345");
	}
	
	public void enterAccessCode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(accesscode));
		element.sendKeys("9da2");
	}
	

	
	public void enterTeacherEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("srini@gmail.com");
	}
	
	
	public void selectTheRoleAsTeacher() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectRole));
		Select select = new Select(element);
		select.selectByVisibleText("Teacher");
	}
	
	public void selectTheRoleAsStudent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectRole));
		Select select = new Select(element);
		select.selectByVisibleText("Student");
	}

	public void enterStudentEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("ab@gmail.com");
	}
	
	
	public void enterTeacherPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		element.sendKeys("gBFxYGUi");
	}
	
	public void enterStudentPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		element.sendKeys("bHaMRP7P");
	}
	
	public void clickOnLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
		element.click();
	}
	
}
