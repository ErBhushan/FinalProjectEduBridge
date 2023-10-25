package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	//intialising webdriver
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	//method will automatically call as soon as object of the class is created
	public void register() {
		//timeout given to load all web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Finding of web element first name
		driver.findElement(By.id("sb_reg_name")).sendKeys("Bhushan");
		
		//Finding of web element contact number
		driver.findElement(By.id("adforest_contact_number")).sendKeys("8237115919");
		
		//Finding of web element mail id
		driver.findElement(By.id("sb_reg_email")).sendKeys("bhushanmsonawane10@gmail.com");
		
		//Finding of web element password
		driver.findElement(By.name("sb_reg_password")).sendKeys("Bhushan100989$");
		
		//Finding of web element check box and click on it
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ins[1]")).click();
		
		//Finding of web element  register button on click on it
		driver.findElement(By.id("sb_register_submit")).click();
		
		
		
		
	
	}

}
