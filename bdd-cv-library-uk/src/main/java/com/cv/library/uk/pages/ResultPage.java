package com.cv.library.uk.pages;

import com.cv.library.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class);

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id='site-main']/div/div[1]/div[2]/div[1]/div[1]/h1")
    WebElement checkResultMsg;

    public void verifyTextSuccessfully(String expectedMsg) {
        String actualMessage = String.valueOf(checkResultMsg);
        String expectedMessage = "Permanent Tester jobs in Harrow on the Hill";
        Assert.assertEquals(actualMessage,expectedMessage);

    }
}
