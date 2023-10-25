package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hom {
//intialising webdriver	
WebDriver driver;
	
//Constructor that will be automatically called as soon as the object of the class is created
	public Hom(WebDriver driver) {
		this.driver=driver;
	}
		//Finding web Element resiter
		By register = By.name("Register");
		
	
	
	public void clickRegister() {
		//land on home page
		driver.get("https://bookflow.in/");
		// Navigate to registeration page
		driver.navigate().to("https://bookflow.in/register");
	}
}
	


