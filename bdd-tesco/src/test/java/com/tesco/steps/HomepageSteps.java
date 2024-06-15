package com.tesco.steps;

import com.tesco.pages.HomePage;
import com.tesco.utility.Utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps extends Utility {

    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        driver.get(baseUrl);
        
    }

    @Then("^I should see the title$")
    public void iShouldSeeTheTitle() {
        homePage.verifyTitle();
    }
}
