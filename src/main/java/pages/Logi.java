package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Logi {
	//intialising web driver
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Logi(WebDriver driver) {
		this.driver = driver;
	}

	//find web elment mail id text box
	By mail = By.id("sb_reg_email");
	//fing web element password text box
	By pswd = By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
	//find web element login button 
	By loginbtn = By.id("aswift_2");

	
	//method to enter mail id in text box
	public void entermail(String cUser) {
		
		driver.findElement(mail).sendKeys(cUser);
	}

	//method to enter password in text box
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	//method to click on login button
	public void clickLogin() {
		driver.findElement(loginbtn).click();

	}

}
