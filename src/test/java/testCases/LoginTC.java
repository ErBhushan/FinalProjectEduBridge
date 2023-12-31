package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTC {
	WebDriver driver;
	Login login;


	@BeforeSuite
	public void setupClass() {
		driver = new ChromeDriver();
		driver.get("https://www.bookswagon.com/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		login = new Login(driver);

	}

	@Test
	public void credLogin() throws IOException {
		login.entermail("bhushanmsonawane10@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		login.enterPassword("Maharaj56!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		login.clickLogin();
		
		
		System.out.println("User login successfully");
		

	}
	
	
	
	
	
	
	@AfterTest
	public void TakeScreenshot() throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshots/img1.jpg");

		FileUtils.copyFile(source, dest);

		System.out.println("Screenshot Saved");

	}


	@AfterSuite
	public void teardown() {
		driver.quit();
	}






}
