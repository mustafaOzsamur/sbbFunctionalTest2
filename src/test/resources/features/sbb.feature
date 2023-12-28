Feature: US1001 Functional tests related to the user interface on the sbb.ch website.


  Scenario Outline:TC01 The unsuccessful login test with incorrect information on the sbb.ch website (Negative login test)
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
      | peter@gmail.com   | peter78475*        |
      | titus@gmail.com   | zhdshfi83587.      |
      | bernd@gmail.com   | kdjgbfvjsjdk56837% |

  @sbb
  Scenario: TC02 Testing the listing of bus schedules by entering a travel route on the homepage
    Given Go to the 'sbbUrl' address
    When Enter the bus stop to board.
    And Enter the destination stop.
    And Select a different date.
    And  Select a different time.
    Then Close the browser


