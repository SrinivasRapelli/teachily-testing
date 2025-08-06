package com.teachily.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;

	@BeforeSuite
	public void openWebsite() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\TeachilyProject\\TeachilyWebsite\\drivers\\chromedriver.exe");   //for running the code locally
				//driver = new FirefoxDriver();
				
				WebDriverManager.chromedriver().setup();   //for runnning the code remotely
				driver = new ChromeDriver();
				driver.get("https://www.teachily.co.uk/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void closeWebsite() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
