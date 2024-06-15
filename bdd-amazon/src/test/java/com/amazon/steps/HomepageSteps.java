package com.amazon.steps;

import com.amazon.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps {

    Homepage homepage = new Homepage();
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I click on cookie$")
    public void iClickOnCookie() {
        homepage.clickOnCookie();
    }

    @Then("^I should see the title$")
    public void iShouldSeeTheTitle() {
        homepage.verifyTitle();
    }

}
