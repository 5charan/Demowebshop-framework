@tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario: verify the login page
    Given user should open the browser
    Then user Login to the application
    When enter the valid email
    And enter the valid password
    Then click on the login button
