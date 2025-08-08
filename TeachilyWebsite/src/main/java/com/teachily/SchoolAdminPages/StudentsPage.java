package com.teachily.SchoolAdminPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StudentsPage {
	WebDriver driver;
	
	public StudentsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By studentsMenu = By.xpath("//span[text()='Students']");
	By newStudentButton = By.xpath("//button[text()=' New Student']");
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
	
	By saveStudentButton = By.xpath("//*[text()=\"Save Student\"]");
	By verifyStudent = By.xpath("//*[contains(text(),'ab@gmail.com')]");

	
	public void clickOnStudentsMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(studentsMenu));
		element.click();
	}
	
	public void clickOnNewStudentButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(newStudentButton));
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
	
	public void enterFname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		element.sendKeys("A");
	}

	public void enterLname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		element.sendKeys("B");
	}
	
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("ab@gmail.com");
	}
	
	public void clickOnSaveStudentButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(saveStudentButton));
		element.click();
	}
	
	public void verfiyStudentCreation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(verifyStudent));
		String teacheremail = element.getText();
		Assert.assertEquals(teacheremail, "ab@gmail.com");
	}
	
}
