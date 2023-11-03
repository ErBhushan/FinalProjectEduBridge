package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.BooksCataologue;



public class BooksCatalogueTC {


	WebDriver driver;
	BooksCataologue catalogue;



	@BeforeSuite
	public void setupClass() {

		driver = new ChromeDriver();
		catalogue = new BooksCataologue(driver);
		driver.get("https://newagepublishers.com");
		driver.navigate().to("https://newagepublishers.com/servlet/AskForPrintedCatalogue");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));




	}

	@Test
	public void feedDetails() throws InterruptedException, IOException {

		catalogue.enterName("Bhushan");
		catalogue.enterMail("bhushanmsonawane10@gmail.com");
		catalogue.enterOrganisation("Samarth Books and sales");
		catalogue.enterAdd1("Shop 1, krishna apt, ganesh colony");
		catalogue.enterAdd2("Rane Nagar, Nashik");
		catalogue.clickCheckBox();
		catalogue.clickButton();
		Thread.sleep(2000);

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshots/img5.jpg");

		FileUtils.copyFile(source, dest);

		System.out.println("Screenshot Saved");


		System.out.println("Details filled successfully");
	}

	@AfterTest


	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}





