package com.cucumber.application.nicebank;

import com.cucumber.application.support.KnowsMyDomain;
import cucumber.api.Transform;
import cucumber.api.java.en.When;

/**
 * Created by pradeep on 15/10/16.
 */
public class TellerSteps {

    private KnowsMyDomain helper;

    public TellerSteps(KnowsMyDomain helper) {
        this.helper = helper;
    }

    @When("^I request \\$(\\d*\\.*\\d*)$")
    public void i_request_$(@Transform(MoneyConverter.class) Money amountDispense) throws Throwable {
        helper.getTeller().withdrawFromAccount(helper.getMyAccount(), amountDispense);
    }
}
