package com.Cucumber_Adactin_POM;

import org.openqa.selenium.WebDriver;

public class Cucumber_Adactin_PO_Manager {

	public WebDriver driver;
	private Home_Page hp;
	private Search_Hotel sh;
	private Select_Hotel ch;
	private Booking_Hotel bh;
	private Order_Page orders;

	public Cucumber_Adactin_PO_Manager(WebDriver driver1) {
		this.driver = driver1;
	}

	public Home_Page get_Instance_Hp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}

	public Search_Hotel get_Instance_Sh() {
		if (sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}

	public Select_Hotel get_Instance_Ch() {
		if (ch == null) {
			ch = new Select_Hotel(driver);
		}
		return ch;
	}

	public Booking_Hotel get_Instance_Bh() {
		if (bh == null) {
			bh = new Booking_Hotel(driver);
		}
		return bh;
	}

	public Order_Page get_Instance_Orders() {
		if (orders == null) {
			orders = new Order_Page(driver);
		}
		return orders;
	}



}
