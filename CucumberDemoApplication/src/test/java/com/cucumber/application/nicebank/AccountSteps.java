package com.cucumber.application.nicebank;

import com.cucumber.application.support.KnowsMyDomain;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import org.junit.Assert;

/**
 * Created by pradeep on 15/10/16.
 */
public class AccountSteps {

    private KnowsMyDomain helper;

    public AccountSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @Given("^I have deposited \\$(\\d*\\.*\\d*) in my$")
    public void i_have_deposited_$_in_my(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().credit(amount);
        Assert.assertEquals("Incorrect account balance", amount, helper.getMyAccount().getBalance());
    }
}
