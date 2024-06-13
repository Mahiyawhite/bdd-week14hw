package com.visa.pages;

import com.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "input[id='response-1']")
    WebElement durationOfStay;

    @CacheLookup
    @FindBy(css = "#current-question > button")
    WebElement thirdContinueButton;

    public void clickToLongerThen6Month(){
        log.info("select duration of stay");
        clickOnElement(durationOfStay);
    }
    public void thirdContinueButton(){
        log.info("click on continue button");
        clickOnElement(thirdContinueButton);
    }

}
