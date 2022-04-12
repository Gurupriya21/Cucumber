package com.Step_Definition;

import org.openqa.selenium.WebDriver;

import com.Cucumber_Adactin_POM.Cucumber_Adactin_PO_Manager;
import com.Cucumber_Project.Base_Class_Runner;
import com.Runner_Class.Adactin_Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_Step_Definition extends Base_Class_Runner {
	public static WebDriver driver = Adactin_Runner_Class.driver;
	public static Cucumber_Adactin_PO_Manager pom = new Cucumber_Adactin_PO_Manager(driver);

	@Given("user Launch The Application Url")
	public void user_launch_the_application_url() {
		navigate("https://adactinhotelapp.com/");

	}

	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() {
		input_value(pom.get_Instance_Hp().getUsername(), "Gurupriya21");

	}

	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {
		input_value(pom.get_Instance_Hp().getPassword(), "69910112@g");

	}

	@Then("user Click On The Login button And It Naviagtes to Search Hotel Page")
	public void user_click_on_the_login_button_and_it_naviagtes_to_search_hotel_page() {
		Click(pom.get_Instance_Hp().getLogin_Btn());

	}

	@When("user Select The Hotel Location In Location Dropdown")
	public void user_select_the_hotel_location_in_location_dropdown() {
		dropdown("ByIndex", pom.get_Instance_Sh().getLocation(), "5");

	}

	@When("user Select The Hotel From Given Hotel Options")
	public void user_select_the_hotel_from_given_hotel_options() {
		dropdown("ByValue", pom.get_Instance_Sh().getHotelname(), "Hotel Sunshine");

	}

	@When("user Select The Room Type As required")
	public void user_select_the_room_type_as_required() {
		dropdown("ByIndex", pom.get_Instance_Sh().getRoomtype(), "2");

	}

	@When("user Enter The {string} In Check In Date Field")
	public void user_enter_the_in_check_in_date_field(String checkin) {
		input_value(pom.get_Instance_Sh().getCheck_in(), checkin);

	}

	@When("user Enter The {string} In Check Out Date Field")
	public void user_enter_the_in_check_out_date_field(String checkout) {
		input_value(pom.get_Instance_Sh().getCheck_out(), checkout);

	}

	@When("user Select The Person Count In Adults In Room Field")
	public void user_select_the_person_count_in_adults_in_room_field() {
		dropdown("ByIndex", pom.get_Instance_Sh().getAdults_per_room(), "1");

	}

	@Then("user Click The Search Button And It Navigates to Select Hotel Page")
	public void user_click_the_search_button_and_it_navigates_to_select_hotel_page() {
		Click(pom.get_Instance_Sh().getSearch());
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		Click(pom.get_Instance_Ch().getRadio_Btn());

	}

	@Then("user Click The Continue Button And It Naviagtes to Book A Hotel Page")
	public void user_click_the_continue_button_and_it_naviagtes_to_book_a_hotel_page() {
		Click(pom.get_Instance_Ch().getCont());

	}

	@When("user Enter The {string} In Firstname Field")
	public void user_enter_the_in_firstname_field(String firstname) {
		input_value(pom.get_Instance_Bh().getFname(), firstname);

	}

	@When("user Enter The {string} In Lastname Field")
	public void user_enter_the_in_lastname_field(String lastname) {
		input_value(pom.get_Instance_Bh().getLname(), lastname);
	}

	@When("user Enter The {string} In Address Field")
	public void user_enter_the_in_address_field(String address) {
		input_value(pom.get_Instance_Bh().getAddress(), address);

	}

	@When("user Enter The {string} In Credit Card No Field")
	public void user_enter_the_in_credit_card_no_field(String cardno) {
		input_value(pom.get_Instance_Bh().getCredit_card_no(), cardno);

	}

	@When("user Select The Credit Card Type")
	public void user_select_the_credit_card_type() {
		dropdown("ByValue", pom.get_Instance_Bh().getCredit_card_type(), "VISA");

	}

	@When("user Select The Expiry Date In Expiry Date Field")
	public void user_select_the_expiry_date_in_expiry_date_field() {
		dropdown("ByIndex", pom.get_Instance_Bh().getExpmnt(), "5");
	}

	@When("user Select The Expiry Month In Expiry Month Field")
	public void user_select_the_expiry_month_in_expiry_month_field() {
		dropdown("ByIndex", pom.get_Instance_Bh().getExpyr(), "5");
	}

	@When("user Enter The {string} In CVV Number Field")
	public void user_enter_the_in_cvv_number_field(String cvv) {
		input_value(pom.get_Instance_Bh().getCvv(), cvv);

	}

	@Then("user Enter The Book Now Button And It Naviages to Itinerary Page")
	public void user_enter_the_book_now_button_and_it_naviages_to_itinerary_page() {
		Click(pom.get_Instance_Bh().getBook());

	}
}
