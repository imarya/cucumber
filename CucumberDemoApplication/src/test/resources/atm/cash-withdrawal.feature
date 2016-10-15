Feature:​Cash Withdrawal​

  Scenario:​Successful withdrawal for account in credit​​
    Given I have deposited $100.90 in my
    When I request $20.90
    Then $20.90 should be dispensed