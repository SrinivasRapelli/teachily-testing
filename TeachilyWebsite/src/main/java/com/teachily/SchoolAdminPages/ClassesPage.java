package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ClassesPage {
	WebDriver driver;
	
	public ClassesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By classesmenu = By.xpath("//*[text()=\"Classes\"]");
	By newClassBtn = By.xpath("//*[text()=\"New Class\"]");
	
	By selectStage = By.id("stage");
	By ks = By.xpath("//*[text()='Key Stage 3']");	

	By selectyear = By.id("year");
	By year = By.xpath("//*[text()='Year 8']");
	
	By selectSubject = By.id("subject");
	By subject = By.xpath("//*[text()='Geography']");
	
	By className = By.xpath("(//input)[5]");
	By section = By.xpath("(//input)[6]");
	By nextBtn = By.xpath("//button[contains(text(),\"Next\")]");
	By teacher = By.xpath("//span[text()=\"srini@gmail.com\"]");
	By createClassBtn  = By.xpath("//button[text()=\"Create Class\"]");
	By verifyclass = By.xpath("//h3[text()=\"Class 1\"]");
	
	public void clickOnClassMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(classesmenu));
		element.click();
	}
	
	public void clickOnNewClassButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(newClassBtn));
		element.click();
	}
	
	public void selectKeyStage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectStage));
		element.click();
		Thread.sleep(3000);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(ks));
		element1.click();

	}
	
	public void selectYear() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectyear));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(year));
		element1.click();
	}
	
	public void selectSubject() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectSubject));
		element.click();
		Thread.sleep(3000);
//		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(subject));
//		element1.click();
		
		WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Geography')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element1);
	}
	
	public void enterClassName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(className));
		element.sendKeys("Class 1");
	}
	
	public void enterSection() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(section));
		element.sendKeys("B");
	}
	
	public void clickOnNextButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
		element.click();
	}
	
	public void addTeacherToTheClass() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(teacher));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(ks));
		element1.click();
	}
	
	public void clickOnCreateClassBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(createClassBtn));
		element.click();
	}
	
	public void verifyClassCreation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(verifyclass));
		String verifyTheClass = element.getText();
		Assert.assertEquals(verifyTheClass, "Class 1");
		System.out.println(verifyTheClass);
	}
	
}
