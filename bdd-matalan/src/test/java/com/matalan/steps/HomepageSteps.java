package com.matalan.steps;

import com.matalan.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageSteps {

    HomePage homePage = new HomePage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @And("^I click on cookie$")
    public void iClickOnCookie() {
        homePage.clickOnCookie();
    }

    @Then("^I should see the title$")
    public void iShouldSeeTheTitle() {
        homePage.verifyTitle();
    }
}
