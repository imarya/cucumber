package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created with IntelliJ IDEA.
 * User: pradeep
 * Date: 9/10/16
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class CashWithdrawal {

    @Given("^I have deposited \\$(\\d+) in my$")
    public void i_have_deposited_$_in_my(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I request \\$(\\d+)​$")
    public void i_request_$_(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
