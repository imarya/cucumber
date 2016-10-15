package com.cucumber.application.nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: pradeep
 * Date: 9/10/16
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class CashWithdrawalSteps {

    private Account account = new Account();
    private Money currentBalance = new Money();

    @Given("^I have deposited \\$(\\d*\\.*\\d*) in my$")
    public void i_have_deposited_$_in_my(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        account.deposit(amount);
        currentBalance = amount;
        Assert.assertEquals("Incorrect account balance", amount, account.getBalance());
    }

    @When("^I request \\$(\\d*\\.*\\d*)$")
    public void i_request_$(@Transform(MoneyConverter.class) Money amountDispense) throws Throwable {
        account.dispense(amountDispense);
    }

    @Then("^\\$(\\d*\\.*\\d*) should be dispensed$")
    public void $_should_be_dispensed(@Transform(MoneyConverter.class) Money amountDispense) throws Throwable {
        Money balance = account.getBalance();
        currentBalance = currentBalance.subtract(amountDispense);
        Assert.assertEquals("Amount not valid after dispensed ",balance, currentBalance);
    }
}
