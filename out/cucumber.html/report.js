$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "To Register",
  "description": "",
  "id": "to-register",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Registration for New user",
  "description": "",
  "id": "to-register;registration-for-new-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "New user register all details",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "user on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.new_user_register_all_details()"
});
formatter.result({
  "duration": 24248315601,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.submit_the_form()"
});
formatter.result({
  "duration": 3542172500,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_on_Home_page()"
});
formatter.result({
  "duration": 11948700,
  "status": "passed"
});
});