package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BooksCataologue {

	//initialize WebDriver
	WebDriver driver;


	//Constructor that will be automatically called as soon as the object of the class is created
	public BooksCataologue(WebDriver driver)
	{
		this.driver = driver;	}

	//Method to enter name 
	public void enterName(String Name)
	{

		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys(Name);

	}

	//Method to enter email id
	public void enterMail(String Mail)
	{
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(Mail);
	}

	//Method to enter organization 
	public void enterOrganisation(String Organisation)
	{
		WebElement organisation = driver.findElement(By.id("organisation"));
		organisation.sendKeys(Organisation);
	}

	//Method to enter address line 1
	public void enterAdd1(String Add1)
	{
		WebElement address1 = driver.findElement(By.id("add1"));

		address1.sendKeys(Add1);

	}

	//Method to enter address line 2
	public void enterAdd2(String Add2)
	{
		WebElement address2 = driver.findElement(By.id("add2"));
		address2.sendKeys(Add2);
	}

	//Method to select and click on cehck box
	public void clickCheckBox()
	{
		WebElement civilchkbx = driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[3]"));
		civilchkbx.click();

		WebElement electricchkbx = driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[6]"));
		electricchkbx.click();

	}

	//Method to click on submit button
	public void clickButton()
	{
		WebElement submitbtn = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		submitbtn.click();
	}



}
