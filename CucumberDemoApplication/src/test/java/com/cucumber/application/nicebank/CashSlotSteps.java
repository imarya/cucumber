package com.cucumber.application.nicebank;

import com.cucumber.application.support.KnowsMyDomain;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by pradeep on 15/10/16.
 */
public class CashSlotSteps {


    private KnowsMyDomain helper;

    public CashSlotSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @Then("^\\$(\\d*\\.*\\d*) should be dispensed$")
    public void $_should_be_dispensed(@Transform(MoneyConverter.class) Money amountDispense) throws Throwable {
        Assert.assertEquals("Amount not valid after dispensed ", helper.getTeller().getCashSlot().getMoney(), amountDispense);
    }

    @Then("^the balance of my account should be \\$(\\d*\\.*\\d*)$")
    public void the_balance_of_my_account_should_be_$(@Transform(MoneyConverter.class) Money balance) throws Throwable {
        Assert.assertEquals("Balance amount not match after dispensed", helper.getMyAccount().getBalance(), balance);
    }
}
