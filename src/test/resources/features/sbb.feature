Feature: US1001 The user clicks on the titles in the header section of the SwissSign website in order.
@sbb
  Scenario Outline:Negative login test.
    Given Go to the 'sbbUrl' address
    When Click on the Anmelden button
    And Enter an invalid "<email>" address in the email box
    And Enter an invalid "<password>" in the password box
    And Click the Anmelden button
    And Verify that the login was unsuccessful
    Then Close the browser
    Examples:
      | email             | password           |
      | marcel@gmail.com  | marcel123456.      |
      | liam@gmail.com    | liam84568475.      |
      | michael@gmail.com | michael8568934z59@ |
      | peter@gmail.com   | peter78475*       |
      | titus@gmail.com   | zhdshfi83587.      |
      | bernd@gmail.com   | kdjgbfvjsjdk56837% |


