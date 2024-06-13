package com.visa.pages;

import com.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id='result-info']/div[2]/div/h2")
    WebElement checkResultMsg;

    @CacheLookup
    @FindBy(xpath = "//*[@id='result-info']/div[2]/div/h2")
    WebElement checkSecondResultMsg;

    @CacheLookup
    @FindBy(xpath = "//*[@id='result-info']/div[2]/div/h2")
    WebElement checkThirdResultMsg;


    public String getResultMessage() {
        return checkResultMsg.getText();
    }

    public String getSecondResultMessage() {
        return checkSecondResultMsg.getText();
    }
    public String getThirdResultMessage() {
        return checkThirdResultMsg.getText();
    }
}
