package com.cv.library.uk.pages;

import com.cv.library.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement cookieIframe;

    @CacheLookup
    @FindBy(xpath = "//*[@id='save']/span[1]/div/span")
    WebElement cookies;

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceSelect;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMinField;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMaxField;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeSelect;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeSelect;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsButton;


    public void handleCookiesInIframe() {
        driver.switchTo().frame(cookieIframe);
        clickOnElement(cookies);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleField,jobTitle);
    }

    public void enterLocation(String location){
        sendTextToElement(locationField,location);
    }

    public void selectDistance(String distance) {
        sendTextToElement(distanceSelect,distance);
    }

    public void clickMoreSearchOptions() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterSalaryMin(String salaryMin) {
        sendTextToElement(salaryMinField,salaryMin);
    }

    public void enterSalaryMax(String salaryMax) {
        sendTextToElement(salaryMaxField,salaryMax);
    }

    public void selectSalaryType(String salaryType) {
        sendTextToElement(salaryTypeSelect,salaryType);
    }

    public void selectJobType(String jobType) {
        sendTextToElement(jobTypeSelect,jobType);
    }

    public void clickFindJobsButton() {
        clickOnElement(findJobsButton);
    }
}
