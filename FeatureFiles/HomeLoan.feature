Feature: Home Loan

  @sanity
  Scenario Outline: EMI Calculator for Home Loan
    When user clicks on calculator button and home loan button
    And user then sets Home Loan values
    Then user verifies monthly payment is displayed or not
    And user verifies total payment is displayed or not
    When user scroll home page
    Then user handles table header
    And user handles year on year table
    When user scrolls up the page
