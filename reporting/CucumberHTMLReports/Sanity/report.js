$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/Features/Blog.feature");
formatter.feature({
  "name": "blog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate blog entering functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in Blog page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters data in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.enterProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "data should appear in search field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.VerifyProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/Features/module2/Search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing multi scenario case1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "test multiple scenario case1",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.testmultiplescenariouc1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing multi scenario case2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "test multiple scenario case2",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.testmultiplescenariouc2()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user is in Search page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cproduct\u003e\" product",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.step({
  "name": "Product \"\u003cproduct\u003e\" should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "MacBook Air"
      ]
    },
    {
      "cells": [
        "MacBook Pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user is in Search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"iPhone\" product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Search.enterProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Search.clicksearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"iPhone\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Search.verifyProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user is in Search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Air\" product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Search.enterProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Search.clicksearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"MacBook Air\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Search.verifyProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user is in Search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.navigateSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Pro\" product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Search.enterProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Search.clicksearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"MacBook Pro\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Search.verifyProduct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});