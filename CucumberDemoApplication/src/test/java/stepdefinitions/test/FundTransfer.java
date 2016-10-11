package stepdefinitions.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created with IntelliJ IDEA.
 * User: pradeep
 * Date: 9/10/16
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class FundTransfer {

    private int savingAccountBalance;
    private int checkingAccountBalance;

    private enum account {
        SAVING("savings"), REGULAR("checking");

        private String name;

        account(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }
    }

    @Given("^I have deposited \\$(\\d+) in my (\\w+) account")
    public void depositMoneyInXAccount(int amountDeposit, String accountType) {

        if (account.SAVING.getName().equals(accountType)) {
            savingAccountBalance += amountDeposit;
        } else if (account.REGULAR.getName().equals(accountType)) {
            checkingAccountBalance += amountDeposit;
        }
        System.out.println("$" + amountDeposit + " deposited in " + accountType + " account");
    }

    @When("^I transfer \\$(\\d+) from my saving account into my checking account$")
    public void TransferXAmountFromSavingToCheckingAccount(int amountTransfer) throws Throwable {
        savingAccountBalance -= amountTransfer;
        checkingAccountBalance += amountTransfer;
        System.out.println("$" + amountTransfer + " transfer from saving to checking account");
    }

    @Then("^the balance of (\\w+) account should be \\$(\\d+)$")
    public void balanceInXAccount(String accountType, int balanceAmount) throws Throwable {

        if (account.SAVING.getName().equals(accountType)) {
            if (balanceAmount == this.savingAccountBalance) {
                System.out.println("$" + this.savingAccountBalance + " in " + accountType + " account");
            } else {
                System.out.println("Error in fund transfer, nothing deducted from saving account");
            }
        } else if (account.REGULAR.getName().equals(accountType)) {
            if (balanceAmount == this.checkingAccountBalance) {
                System.out.println("$" + this.checkingAccountBalance + " in " + accountType + " account");
            } else {
                System.out.println("Error in fund transfer, nothing added to checking account");
            }
        } else {
            System.out.println("Invalid account");
        }
    }
}
