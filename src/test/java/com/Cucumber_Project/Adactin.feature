Feature: Booking Hotel Room In Adactin Application
Scenario: Login Page
Given user Launch The Application Url
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login button And It Naviagtes to Search Hotel Page

Scenario: Search Hotel Page
When user Select The Hotel Location In Location Dropdown
And user Select The Hotel From Given Hotel Options
And user Select The Room Type As required
And user Enter The "<10.04.2022>" In Check In Date Field
And user Enter The "<12.04.2022>" In Check Out Date Field
And user Select The Person Count In Adults In Room Field
Then user Click The Search Button And It Navigates to Select Hotel Page

Scenario: Select Hotel Page
When user Select The Hotel 
Then user Click The Continue Button And It Naviagtes to Book A Hotel Page

Scenario: Book A Hotel Page
When user Enter The "<Gurupriya>" In Firstname Field
And user Enter The "<Dharshini>" In Lastname Field
And user Enter The "<9-11 Broadway, London SW1H 0AZ, United Kingdom>" In Address Field
And user Enter The "<5551225115215210>" In Credit Card No Field
And user Select The Credit Card Type
And user Select The Expiry Date In Expiry Date Field
And user Select The Expiry Month In Expiry Month Field
And user Enter The "<321>" In CVV Number Field
Then user Enter The Book Now Button And It Naviages to Itinerary Page


