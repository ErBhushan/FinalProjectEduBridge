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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.CartAdd;

public class CartAddTc {

	WebDriver driver;
	CartAdd cart;

	@BeforeTest
	public void setupClass()
	{
		driver = new ChromeDriver();
		cart = new CartAdd(driver);
		driver.get("https://www.madrasshoppe.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	@Test
	public void addToCart() throws InterruptedException, IOException
	{
		cart.seacrchBook("Rich Dad Poor Dad");
		cart.clickSearchBtn();
		driver.navigate().to("https://www.madrasshoppe.com/rich-dad-poor-dad-english-1st-edition-2017-kiyosaki-robert-t-9781612680019-57175.html");
		WebElement buybtn = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]"));
		buybtn.click();
		Thread.sleep(3000);
		System.out.println("Product added in cart Successfully");


		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshots/img7.jpg");

		FileUtils.copyFile(source, dest);

		System.out.println("Screenshot Saved");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}





