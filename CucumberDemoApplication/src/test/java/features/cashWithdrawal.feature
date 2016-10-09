Feature:​Cash Withdrawal​

  Scenario:​Successful withdrawal for account in credit​​
    Given I have deposited $100 in my
    When I request $20​
    Then $20 should be dispensed