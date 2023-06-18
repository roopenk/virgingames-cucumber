package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility {

    // Declaring Logger variable for logging every method in logs
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() { // Declaring Constructor to initialize driver for the current page
        PageFactory.initElements(driver, this);
    }

    // Defining Locators
    @CacheLookup
    @FindBy(xpath = "//label[@class = 'dialog_button'][@data-qa = 'accept-cookie-policy']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[@data-tracking='{\"label\":\"Poker\",\"section\":\"Top Nav\",\"mvtVariant\":\"\",\"mvtCampaign\":\"\"}']")
    WebElement pokerTab;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Play our exciting Online Poker Games']")
    WebElement pokerText;

    // Defining Methods
    public void clickingOnAcceptCookies() { // Method to click on accept cookies button
        clickOnElement(acceptCookies);
        log.info("Clicking On Accept Cookies Button : " + acceptCookies.toString());
    }

    public void clickingOnPokerTab() { // Method to click on poker tab
        clickOnElement(pokerTab);
        log.info("Clicking On Poker Tab : " + pokerTab.toString());
    }

    public void verifyingPokerGamesText() { // Method to verify the poker games text
        String expectedText = "Play our exciting Online Poker Games";
        String actualText = getTextFromElement(pokerText);
        Assert.assertEquals(expectedText, actualText);
        log.info("Verifying The Poker Games Text : " + pokerText.toString());
    }
}
