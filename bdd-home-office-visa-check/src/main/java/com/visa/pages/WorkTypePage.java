package com.visa.pages;

import com.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement healthCareJobType;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"current-question\"]/button")
    WebElement fourthContinueButton;

    public void healthCareJobType(){
        log.info("planning to work for 'Health and care professional");
        clickOnElement(healthCareJobType);
    }
    public void fourthContinueButton(){
        log.info("click on continue button");
        clickOnElement(fourthContinueButton);
    }

}
