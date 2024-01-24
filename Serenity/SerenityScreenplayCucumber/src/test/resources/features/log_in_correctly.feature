Feature: Login
  Background: Test Login

  Scenario Outline: User can Login correctly
    Given Ivan open my store site
    When he go to my account section
    Then he wait for login form to be loaded

    When he logs in with user "<username>" and password "<password>"
    Then he should see log in status correctly

    Examples:
    | username | password |
    | jperez@gmail.com | imd |