Feature: Car Loan

  @sanity
  Scenario Outline: EMI Calculator for Car Loan
    Given User opens the  emicalculator.net
    And user clicks on the Car Loan button
    When user fills the Car Loan Amount as "<loan>" as input field
    Then user validates the Car Loan Amount
    When user fills the Interset Rate as "<interest>" as input field
    Then user validates the Interset Rate
    When user fills the Loan Tenure as "<tenure>" as input field
    Then validates the Loan Tenure
    When user clicks on EMI in Arrears
    And user scrolls down till year table
    Then user fetches the arrears interest amount for one month and display it
    And arrears principal amount for one month and display it
    When user scrolls up till EMI page
    And user clicks on EMI Advance
    And user scrolls down Advance page till year table
    Then user fetches the advance interest amount for one month and display it
    And advance principal amount for one month and display it
    When user scrolls up till top of the page

    Examples: 
      | loan    | rate | tenure |
      | 1500000 |  9.5 |      1 |
