package testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Dashboard;
import pages.Hom;
import pages.Logi;


class LoginTC
{	
	WebDriver driver;
	Hom home;
	Logi login;
	Dashboard dashboard;
	
	// Create a list to store existing usernames
    List<String> existingUsers = new ArrayList<>();
    
    
	@BeforeTest
	public void setupClass() 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Creating object of home page
		 home = new Hom(driver);
		//Creating object of Login page
		login = new Logi(driver);
		//Creating object of Dashboard
		dashboard = new Dashboard(driver);
		
		home.clickRegister();
	  
		dashboard.register();
		System.out.println("user account created successfully");
	}
	
	@Test
	public void credLogin()
	{
		 String currUser = "bhushanmsonawane10@gmail.com";
		    existingUsers.add(currUser);
		    // Check if the user exists (you'll need to implement this logic)
		    if (userExists(currUser)) {
		        System.out.println("User already exists");
		    } else {
		        login.entermail(currUser);
		        login.enterPassword("Bhushan10989$");
		        login.clickLogin();
		        System.out.println("User login successfully");
		    }
	}
	public boolean userExists(String username) {
	   
		// Check if the provided username exists in the list of existing users
        return existingUsers.contains(username);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("user logged out successfully");
	}
}
