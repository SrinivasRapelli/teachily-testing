package com.teachily.SchoolAdminPages;

import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeaturesPage {
	
	WebDriver driver;
	public FeaturesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By featuresMenu = By.xpath("//*[text()=\"Features\"]");
	By copyTheLink = By.xpath("(//button)[5]");
	By fname = By.id("name");
	By lname = By.id("last_name");
	By email = By.id("email");
	By password = By.id("password");
	By nextButton = By.xpath("//button[text()=\"Next\"]");
	By checkBox = By.xpath("(//label)[1]");
	By doneBtn = By.xpath("//button[text()=\"Done\"]");
	
	
	public void clickOnFeaturesMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(featuresMenu));
		element.click();
	}
	
	public void copyTheLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(copyTheLink));
		element.click();
	}
	
	public void openTheLinkInNewPage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.navigate().to("https://www.teachily.co.uk/enroll/9da2");
		
	}
	
	public void enterFirstName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
		element.sendKeys("c");
	}
	
	public void enterLastName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lname));
		element.sendKeys("c");
	}
	
	public void enterEmailName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("ca@gmail.com");
	}
	
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		element.sendKeys("Ab@12345");
	}
	
	public void clickNextButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
		element.click();
	}
	
	public void selectAClass() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox));
		element.click();
	}
	
	public void clickOnDoneButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(doneBtn));
		element.click();
		
		try {
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.accept();
		} catch (Exception e) {
			System.out.println("Succesfully selfenrolled!");
		}
		
	}
	
}
