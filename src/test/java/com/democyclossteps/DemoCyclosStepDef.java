package com.democyclossteps;

import com.democyclosbase.DemoCyclosBase;
import com.democyclospages.LoginPage;
import com.democyclospages.PersonalDetailPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



// Inherit the base class
public class DemoCyclosStepDef extends DemoCyclosBase{
	
	//Launch the base URL of democyclos site
	@Given("Launch the land URL")
	public void launch_the_land_url() {
		democyclosURL();
	}

	//Click on login button and entering the username and password , then submit
	@Given("Provided the correct {string} and {string}")
	public void provided_the_correct_and(String username, String password) throws InterruptedException {
		LoginPage.login(username, password);
	}



//Click on personl icon and printing the details
	@Then("Validating the profile page")
	public void validating_the_profile_page() throws InterruptedException {
		PersonalDetailPage.personalbutton();
		
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
