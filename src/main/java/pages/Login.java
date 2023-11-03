package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {
	//intialising web driver
	WebDriver driver;


	//Constructor that will be automatically called as soon as the object of the class is created
	public  Login(WebDriver driver)
	{
		this.driver = driver;

	}



	//method to enter mail id in text box
	public void entermail(String email) {
		WebElement Email = driver.findElement(By.id("ctl00_phBody_SignIn_txtEmail"));
		Email.sendKeys(email);
	}


	//method to enter password in text box
	public void enterPassword(String pass) {
		WebElement Passwrd = driver.findElement(By.id("ctl00_phBody_SignIn_txtPassword"));
		Passwrd.sendKeys(pass);
	}

	//method to click on login button
	public void clickLogin() {
		WebElement Loginbtn = driver.findElement(By.id("ctl00_phBody_SignIn_btnLogin"));
		Loginbtn.click();
	}

}
