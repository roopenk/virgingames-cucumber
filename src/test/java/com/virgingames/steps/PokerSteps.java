package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PokerSteps {
    @When("^I Click On Accept Cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickingOnAcceptCookies();
    }

    @And("^I Click On Poker Tab$")
    public void iClickOnPokerTab() {
        new HomePage().clickingOnPokerTab();
    }

    @Then("^Poker Tab Opens Poker Games Page And Displays 'Play our exciting Online Poker Games' Message$")
    public void pokerTabOpensPokerGamesPageAndDisplaysPlayOurExcitingOnlinePokerGamesMessage() {
        new HomePage().verifyingPokerGamesText();
    }
}
