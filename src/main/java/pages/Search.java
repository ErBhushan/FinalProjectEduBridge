package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

	//initialize WebDriver
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Search(WebDriver driver) {
		this.driver = driver;
	}

	//locate search box 
	By searchInput = By.id("inputbar");

	//locate search button
	By searchButton = By.id("btnTopSearch"); 

	//locate search result
	By searchResults = By.id("listSearchResult");

	//Method to enter book in search box
	public void enterSearchQuery(String query) {
		driver.findElement(searchInput).sendKeys(query);
	}

	//Method to click on search button
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}

	//Method to check search result display
	public boolean areSearchResultsDisplayed() {
		return driver.findElement(searchResults).isDisplayed();
	}
}


