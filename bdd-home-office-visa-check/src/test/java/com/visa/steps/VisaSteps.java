package com.visa.steps;

import com.visa.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class VisaSteps {

    StartPage startPage = new StartPage();
    SelectNationalityPage selectNationalityPage = new SelectNationalityPage();
    ReasonForTravelPage reasonForTravelPage = new ReasonForTravelPage();
    ResultPage resultPage = new ResultPage();
    DurationOfStayPage durationOfStayPage = new DurationOfStayPage();
    WorkTypePage workTypePage = new WorkTypePage();
    FamilyImmigrationStatusPage familyImmigrationStatusPage = new FamilyImmigrationStatusPage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I click on cookie$")
    public void iClickOnCookie() {
        startPage.clickOnCookie();
    }

    @When("^I click on start now button$")
    public void iClickOnStartNowButton() {
        startPage.clickOnStartButton();
    }

    @And("^I select nationality \"([^\"]*)\"$")
    public void iSelectNationality(String nationality) {
        selectNationalityPage.selectNationality(nationality);
    }

    @Then("^I click on continue button$")
    public void iClickOnContinueButton() {
        selectNationalityPage.clickOnContinueButton();
    }

    @And("^I select reason for visit$")
    public void iSelectReasonForVisit() {
        reasonForTravelPage.selectReason();
    }

    @And("^I click on second continue button$")
    public void iClickOnSecondContinueButton() {
        reasonForTravelPage.secondContinueButton();
    }

    @Then("^I should see the result message \"([^\"]*)\"$")
    public void iShouldSeeTheResultMessage(String arg0) {
        String actualMessage = resultPage.getResultMessage();
        String expectedMessage = "You will not need a visa to come to the UK";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @And("^I select reason for visit job type$")
    public void iSelectReasonForVisitJobtype() {
        reasonForTravelPage.jobType();
    }

    @And("^I select length of stay$")
    public void iSelectLengthOfStay() {
        durationOfStayPage.clickToLongerThen6Month();
    }

    @And("^I click on third continue button$")
    public void iClickOnThirdContinueButton() {
        durationOfStayPage.thirdContinueButton();
    }

    @And("^I select job type Health and care professional$")
    public void iSelectJobTypeHealthAndCareProfessional() {
        workTypePage.healthCareJobType();
    }

    @And("^I click on fourth continue button$")
    public void iClickOnFourthContinueButton() {
        workTypePage.fourthContinueButton();
    }

    @Then("^I should see the second result message \"([^\"]*)\"$")
    public void iShouldSeeTheSecondResultMessage(String arg0) {
        String actualMessage = resultPage.getSecondResultMessage();
        String expectedMessage = "You need a visa to work in health and care";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @And("^I select reason for visit Join partner or family for a long stay$")
    public void iSelectReasonForVisitJoinPartnerOrFamilyForALongStay() {
        familyImmigrationStatusPage.joinPartner();
    }

    @And("^I select immigration status yes$")
    public void iSelectImmigrationStatusYes() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("^I should see the third result message \"([^\"]*)\"$")
    public void iShouldSeeTheThirdResultMessage(String arg0) {
        String actualMessage = resultPage.getThirdResultMessage();
        String expectedMessage = "You may need a visa";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}



