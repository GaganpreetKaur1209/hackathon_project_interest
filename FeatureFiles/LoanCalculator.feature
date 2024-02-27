Feature: Loan Calculator

  @sanity
  Scenario Outline: EMI Loan Calculator
    When user clicks calculator button and Loan Calculator and under EMI calculator
    Then user validates EMI UI check for textbox and scales
    And user verifies EMI scale
    When user clicks on Loan Amount Calculator
    Then user validates Loan Amount Calculator UI check for textbox and scales
    And user verifies Loan Amount Calculator scale
    When user clicks on Loan Tenure Calculator
    Then user validates Loan Tenure Calculator UI check for textbox and scales
