package com.visa.pages;

import com.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='global-cookie-message']/div/div[2]/button[1]")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startButton;

    public void clickOnCookie(){
        log.info("click to accept cookie");
        clickOnElement(cookies);
    }
    public void clickOnStartButton(){
        log.info("click start button");
        clickOnElement(startButton);
    }


}
