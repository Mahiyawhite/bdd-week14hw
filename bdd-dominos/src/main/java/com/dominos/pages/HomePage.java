package com.dominos.pages;

import com.dominos.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id='app']/div/div[1]/div/a/h1")
    WebElement title;

    public void verifyTitle(){
        String actualMessage = String.valueOf(title);
        String expectedMessage = String.valueOf(title);
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
