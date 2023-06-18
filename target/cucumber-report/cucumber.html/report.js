$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("poker.feature");
formatter.feature({
  "line": 1,
  "name": "Verification Of Functioning Of Poker Games Link",
  "description": "",
  "id": "verification-of-functioning-of-poker-games-link",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2665577900,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "I Am On Virgin Games Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "As A User I want To Verify The Poker Link On Home Page Is Functioning As Expected",
  "description": "",
  "id": "verification-of-functioning-of-poker-games-link;as-a-user-i-want-to-verify-the-poker-link-on-home-page-is-functioning-as-expected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I Click On Accept Cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I Click On Poker Tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Poker Tab Opens Poker Games Page And Displays \u0027Play our exciting Online Poker Games\u0027 Message",
  "keyword": "Then "
});
formatter.match({
  "location": "PokerSteps.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 126635400,
  "status": "passed"
});
formatter.match({
  "location": "PokerSteps.iClickOnPokerTab()"
});
formatter.result({
  "duration": 82951500,
  "status": "passed"
});
formatter.match({
  "location": "PokerSteps.pokerTabOpensPokerGamesPageAndDisplaysPlayOurExcitingOnlinePokerGamesMessage()"
});
formatter.result({
  "duration": 256166400,
  "status": "passed"
});
formatter.after({
  "duration": 669734000,
  "status": "passed"
});
});