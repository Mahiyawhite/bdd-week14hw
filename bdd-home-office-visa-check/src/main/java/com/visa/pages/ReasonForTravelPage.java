package com.visa.pages;

import com.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@class='govuk-radios']/div/input[1]")
    WebElement reasonForVisit;

    @CacheLookup
    @FindBy(css = "input[id='response-1']")
    WebElement reasonForVisitJobType;

    @CacheLookup
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement secondContinueButton;

    public void selectReason(){
        log.info("select reason for visit Tourism");
        clickOnElement(reasonForVisit);
    }
    public void secondContinueButton(){
        log.info("click on continue button");
        clickOnElement(secondContinueButton);
    }
    public void jobType(){
        log.info("select reason for visit job type");
        clickOnElement(reasonForVisitJobType);
    }
}
