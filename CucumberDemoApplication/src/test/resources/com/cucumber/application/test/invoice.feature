Feature: Invoice creation

  Scenario: Create an invoice
    Given I am an signed-in user with role : admin
    And a client "Test Client" exists with name : "Test Client"
    And a project "Test Project" exists with name :
      | name   | "Test Project"       |
      | client | client "Test Client" |
    And a issue "Test Issue" exists with name :
      | project | project "Test Project" |
      | name    | "Test Issue"           |
    And a work_unit "Test Work Unit" exists with name :
      | issue        | issue "Test Issue" |
      | completed_on | "2016-10-11"       |
      | hours        | "7.5"              |
    And I am on the admin invoices page
    Then I should see "Test Client"
    And I follow "Test Client"
    And I fill in "invoice_id" with "abc"
    And I press "Submit"
    Then I am on the admin invoices page
    And I should not see "Test Client"