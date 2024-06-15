package com.dominos.steps;

import com.dominos.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps {

    HomePage homePage = new HomePage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I should see the title$")
    public void iShouldSeeTheTitle() {
        homePage.verifyTitle();
    }
}
