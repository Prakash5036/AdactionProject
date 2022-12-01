package org.test;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pom.AdactinPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	

@Given("Lauch the browser")
public void lauch_the_browser() {
	
	getDriver();
	browserLaunch("http://adactinhotelapp.com/");
	System.out.println("Lauched Sucessfully");
 
}

AdactinPOM a=new AdactinPOM();
@When("Enter the {string} and {string}")
public void enter_the_and(String userName, String password) {
	
	AdactinPOM a=new AdactinPOM();
	WebElement user = a.getUser();
	elementTextSend(user, userName);
	WebElement pass = a.getPass();
	elementTextSend(pass, password);
	
}

@When("Click the login")
public void click_the_login() {
	
	AdactinPOM a=new AdactinPOM();
	WebElement login = a.getLogin();
	elementClick(login);
	System.out.println("Login Sucessful");
   
}

@When("Book the hotels {string},{string},{string},{string},{string}")
public void book_the_hotels(String string, String string2, String string3, String string4, String string5) {
	
	AdactinPOM a =new AdactinPOM();
	WebElement location = a.getLocation();
	select(location, string);
	WebElement hotels = a.getHotels();
	select(hotels, string2);
	WebElement room_type = a.getRoom_type();
	select(room_type,string3);
	WebElement room_nos = a.getRoom_nos();
	select(room_nos, string4);
    
}

@When("Click the search button")
public void click_the_search_button() {
	AdactinPOM a =new AdactinPOM();
	WebElement submit = a.getSubmit();
	elementClick(submit);
	
    
}

@Then("Check the booking status sucessfully or not")
public void check_the_booking_status_sucessfully_or_not() throws InterruptedException {
	
	System.out.println("Booked Sucesful");
	Thread.sleep(5000);
	driver.close();
    
}

}
