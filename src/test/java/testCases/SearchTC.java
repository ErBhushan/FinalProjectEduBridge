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

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Search;

public class SearchTC {
	WebDriver driver;

	public class SearchFunctionalityTest {


		
		@BeforeSuite
		public void setupClass() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

			
			driver.get("https://www.bookswagon.com/");
		}

		@Test
		public void testSearchFunctionality() {
			
			Search search = new Search(driver);
			
			search.enterSearchQuery("GMAT");
			
			search.clickSearchButton();
			
			boolean resultsDisplayed = search.areSearchResultsDisplayed();
			if (resultsDisplayed)
			{
				System.out.println("Search results are displayed.");
			} 
			else
			{
				System.out.println("No search results found.");
			}			

		}
		@AfterTest
		public void Screenshot() throws IOException{
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Screenshots/img2.jpg");

			FileUtils.copyFile(source, dest);

			System.out.println("Screenshot Saved");
		}

		@AfterSuite
		public void teardown() {
			driver.quit();
		}


	}
}
