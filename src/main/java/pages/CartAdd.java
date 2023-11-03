package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartAdd {

	//initialize WebDriver
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public CartAdd(WebDriver driver)
	{
		this.driver = driver;
	}

	//Method to search book 
	public void seacrchBook(String book)
	{
		WebElement SearchBx = driver.findElement(By.id("input_search"));
		SearchBx.sendKeys(book);
	}

	//Method to click on search button
	public void clickSearchBtn() 
	{
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit' ]"));
		searchbtn.click();


	}

}
