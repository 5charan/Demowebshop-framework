@tag
Feature: Test the DemoWebShop website

  @tag1 @smoke
  Scenario: Verify the Registration page
    Given open the browser
    Then click on the Register
    When click on the Gender
    Then Enter a Firstname  "<firstname>"
    When enter a Lastname "<lastname>"
    Then Enter a Email "<Email>"
    When enter the Password"<password>"
    Then Enter a  ConfirmPassword "<ConfirmPassword>"
    When click on a Register button
