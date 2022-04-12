package com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page {



	public WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	public Order_Page (WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getItinerary() {
		return itinerary;
	}




}
