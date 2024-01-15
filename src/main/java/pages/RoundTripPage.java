package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class RoundTripPage extends ProjectSpecifications {
	
	@FindBy (xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[2]")
	WebElement RoundTripRadBtn;

	@FindBy (xpath = "(//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement From;
	
	@FindBy (xpath = "(//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement To;
	
	@FindBy (xpath= "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement departureDate;
	
	@FindBy (xpath =  "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement selectDate;
	
	@FindBy (xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;
	
	
	@FindBy (xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")
	WebElement currency;
	
	@FindBy (xpath = "//div[text()='Search Flight']")
	WebElement searchFlightBtn;
	
	public void OneWayTripPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void RoundTripRadBtn() {
		click(RoundTripRadBtn);
	}
	
	public void From(String Fromvalue) {
		click(From);
		sendKeys(From, Fromvalue);
	}
	
	public void To(String Tovalue) {
		click(To);
		sendKeys(To, Tovalue);
	}
	
	public void Passengers() {
		
		click(passengers);
	}

	public void currency()throws InterruptedException {
		 
		  WebElement selectcurrency=driver.findElement(By.xpath("(//div/select)[3]"));
		  //create an object of Select Class
		  Select dropdown=new Select(selectcurrency);
		  dropdown.selectByVisibleText("INR");
		  System.out.println(dropdown.getFirstSelectedOption().getText());//USD
		  System.out.println(dropdown.isMultiple());
		  Thread.sleep(2000);
	  }

	public void SearchFlightBtn() {
		click(searchFlightBtn);
	}
	
}
