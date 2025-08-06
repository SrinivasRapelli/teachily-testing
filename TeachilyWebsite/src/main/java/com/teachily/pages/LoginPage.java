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
	
	
	public void navigateToLoginPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(loginasSchoolmember));
		element1.click();
	}
	
	public void selectTheRole() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectRole));
		Select select = new Select(element);
		select.selectByVisibleText("Admin");
	}
	
	public void enterAccessCode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(accesscode));
		element.sendKeys("0000");
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("sreenmaahi@gmail.com");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		element.sendKeys("Sr@12345");
	}
	
	public void clickOnLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
		element.click();
	}
	
}
