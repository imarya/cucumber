Feature: Bank offering customers saving account as well as their regular checking account

  Scenario: Transfer funds from savings into checking account
  Given I have deposited $10 in my checking account
  And I have deposited $500 in my savings account
  When I transfer $500 from my saving account into my checking account
  Then the balance of checking account should be $510
  And the balance of savings account should be $0