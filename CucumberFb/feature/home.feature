@chrome
Feature: Home page of Facebook

  Scenario Outline: As a user I want to go to login page so I can access the application
    Given I am in homepage "https://www.facebook.com"
    When I enter "<username>" and "<password>"
    And click on login button
    Then "<errorMsg>" error message displayed

    Examples: 
      | username | password  | errorMsg                                                   |
      | user1    | password1 | incorrect |