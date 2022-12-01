$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/eclipse-workspace/AdactinLogin/src/test/resources/Adactin.feature");
formatter.feature({
  "name": "Book the Hotel using POM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to the Adactin website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Lauch the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the login",
  "keyword": "And "
});
formatter.step({
  "name": "Book the hotels \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croom_type\u003e\",\"\u003cadult_room\u003e\",\"\u003cchild_room\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click the search button",
  "keyword": "And "
});
formatter.step({
  "name": "Check the booking status sucessfully or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "",
        "password",
        "",
        "location",
        "",
        "hotels",
        "",
        "room_type",
        "",
        "adult_room",
        "",
        "child_room"
      ]
    },
    {
      "cells": [
        "Prakash21031990",
        "",
        "6IC187",
        "",
        "London",
        "",
        "Hotel Sunshine",
        "",
        "Double",
        "",
        "2 - Two",
        "",
        "3 - Three"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to the Adactin website",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Lauch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.lauch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the \"Prakash21031990\" and \"6IC187\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Book the hotels \"London\",\"Hotel Sunshine\",\"Double\",\"2 - Two\",\"3 - Three\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.book_the_hotels(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the booking status sucessfully or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.check_the_booking_status_sucessfully_or_not()"
});
formatter.result({
  "status": "passed"
});
});