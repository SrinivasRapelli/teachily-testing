package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TeachersPage {
	WebDriver driver;
	
	public TeachersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By teachersmenu = By.xpath("//span[text()='Teachers']");
	By newTeacher = By.xpath("//button[text()=' New Teacher']");
	By addmanually = By.xpath("//button[text()='Add manually']");
	
	By selectStage = By.xpath("//*[@id=\"stage\"]");
	By ks = By.xpath("//*[text()='Key Stage 3']");
	
	By selectYear = By.id("year");
	By year = By.xpath("//*[text()='Year 8']");
	
	By selectSubject = By.id("subject");
	By subject = By.xpath("//*[text()='Geography']");
	
	By fname = By.id("first_name");
	By lname = By.id("last_name");
	By email = By.id("email");
	By saveTeacherBtn = By.xpath("//button[text()='Save Teacher']");
	By verifyTeacher = By.xpath("//*[contains(text(),'srini@gmail.com')]");
	
	public void clickOnTeachersMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(teachersmenu));
		element.click();
	}
	
	public void clickOnNewTecherButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(newTeacher));
		element.click();
	}
	
	public void ChooseAddManuallyOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addmanually));
		element.click();
		Thread.sleep(3000);
	}
	
	public void selectKeystage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectStage));
//		Select select = new Select(element);
//		select.selectByIndex(1);

		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(ks));
		element1.click();
	}
	
	public void selectYear() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectYear));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(year));
		//element1.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element1);

	}
	
	public void selectSubject() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selectSubject));
		element.click();
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(subject));
		element1.click();
	}
	
	public void enterFname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		element.sendKeys("srini");
	}

	public void enterLname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		element.sendKeys("R");
	}
	
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("srini@gmail.com");
	}
	
	public void clickOnSaveTeacherButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(saveTeacherBtn));
		//element.click();
	}
	
	public void verfiyTeacherCreation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(verifyTeacher));
		String teacheremail = element.getText();
		Assert.assertEquals(teacheremail, "srini@gmail.com");
	}
}
