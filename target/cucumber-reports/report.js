$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ExampleFeature.feature");
formatter.feature({
  "name": "Google search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Finding some cheese",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the Google search page",
  "keyword": "Given "
});
formatter.match({
  "location": "ExampleSteps.visitHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Cheese!\"",
  "keyword": "When "
});
formatter.match({
  "location": "ExampleSteps.searchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page title should start with \"cheese\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ExampleSteps.checkTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});