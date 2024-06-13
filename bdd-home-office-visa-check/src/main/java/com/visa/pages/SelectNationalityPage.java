package com.visa.pages;

import com.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "response")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//*[@id='current-question']/button")
    WebElement continueButton;

    public void selectNationality(String nationality) {
        log.info("selectNationality");
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickOnContinueButton(){
        log.info("click on continue button");
        clickOnElement(continueButton);

    }

}
