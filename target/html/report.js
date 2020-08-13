$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Regression Manager Login Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Regression Manager Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is given with RegMan Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_given_with_RegMan_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to validate the HomePage title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_need_to_validate_the_HomePage_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to check for oracle logo",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_need_to_check_for_oracle_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/regman.feature");
formatter.feature({
  "name": "Regression Manager Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Regression Manager Add",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user was provided with suites manager window",
  "keyword": "Given "
});
formatter.match({
  "location": "AddMRLToSuite.user_was_provided_with_suites_manager_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user expand tree node",
  "keyword": "Then "
});
formatter.match({
  "location": "AddMRLToSuite.user_expand_tree_node()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user expand tree node13",
  "keyword": "Then "
});
formatter.match({
  "location": "AddMRLToSuite.user_expand_tree_node(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will drag and drop mrl",
  "keyword": "Then "
});
formatter.match({
  "location": "AddMRLToSuite.user_will_drag_and_drop_mrl()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Regression Manager Remove",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user provided with suites manager window",
  "keyword": "Given "
});
formatter.match({
  "location": "RemoveMRLFromSuite.user_provided_with_suites_manager_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user expand run testMrl suite tree node",
  "keyword": "Then "
});
formatter.match({
  "location": "RemoveMRLFromSuite.user_expand_run_testMrl_suite_tree_node()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select and remove mrl from suite",
  "keyword": "Then "
});
formatter.match({
  "location": "RemoveMRLFromSuite.user_select_and_remove_mrl_from_suite()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});