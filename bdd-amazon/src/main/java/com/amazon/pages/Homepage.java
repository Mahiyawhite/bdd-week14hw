package com.amazon.pages;

import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class);

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "nav-logo-sprites")
    WebElement title;

    @CacheLookup
    @FindBy(id = "sp-cc-accept")
    WebElement cookie;


    public void clickOnCookie(){
        clickOnElement(cookie);
    }

    public void verifyTitle(){
        String actualMessage = String.valueOf(title);
        String expectedMessage = String.valueOf(title);
        Assert.assertEquals(actualMessage,expectedMessage);
    }


}
