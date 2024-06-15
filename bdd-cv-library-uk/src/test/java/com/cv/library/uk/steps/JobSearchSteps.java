package com.cv.library.uk.steps;

import com.cv.library.uk.pages.HomePage;
import com.cv.library.uk.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JobSearchSteps {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I click on cookie$")
    public void iClickOnCookie() {
        homePage.handleCookiesInIframe();

    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) {
        homePage.enterJobTitle(jobTitle);

    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        homePage.enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        homePage.selectDistance(distance);
    }

    @And("^I click on more search options link$")
    public void iClickOnMoreSearchOptionsLink() {
        homePage.clickMoreSearchOptions();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String salaryMin) {
        homePage.enterSalaryMin(salaryMin);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String salaryMax) {
        homePage.enterSalaryMax(salaryMax);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) {
        homePage.selectSalaryType(salaryType);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        homePage.selectJobType(jobType);
    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        homePage.clickFindJobsButton();
    }

    @Then("^I should see the result \"([^\"]*)\"$")
    public void iShouldSeeTheResult(String textmsg) {
        resultPage.verifyTextSuccessfully(textmsg);
    }
}

