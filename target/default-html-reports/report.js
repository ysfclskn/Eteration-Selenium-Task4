$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CheckInstructors.feature");
formatter.feature({
  "name": "Check Instructors List",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check Instructors List Count",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@main"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I opens Eteration Academy Page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_defs.stepDefs.iOpensEterationAcademyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I goes to \"Instructors\" Page",
  "keyword": "Then "
});
formatter.match({
  "location": "step_defs.stepDefs.iGoesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verifies instructors list count",
  "keyword": "And "
});
formatter.match({
  "location": "step_defs.stepDefs.iVerifiesInstructorsListCount()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});