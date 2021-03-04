@smoke
Feature: login credentials


 Scenario: There is a password but email is empty
 Given user is on automationn  practice page for trhird case
When user clicks first sign in button for third case
And user enters "password" for third case
And user clicks sign in button for third case
Then email adress required message should be display

  Scenario: There are no email and password
    Given user is on automationpractice page
    When user click first sign in button
    And  click second sign in button
    Then email address required message should be displayed



  Scenario: login with incorrect data
    Given user is on automation ppractice page
    When user clicks first sign in button for fourth case
    And user entered "email" and "password"
    And user click sign in button for fourth case
    Then authentication failed message should be displayed


  Scenario: There is an email but password is empty
    Given user is on automation page for second case
    When user clicks first sign in button for second case
    And user enters "email" for second case
    And user clicks sign in button
    Then password required message should be display
