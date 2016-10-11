package stepdefinitions.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by pradeep on 9/10/16.
 */
public class ChangePIN {

    @Given("^I have been issued a new card$")
    public void i_have_been_issued_a_new_card() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_have_been_issued_a_new_card");
    }

    @Given("^I insert the card, entering the correct PIN$")
    public void i_insert_the_card_entering_the_correct_PIN() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_insert_the_card_entering_the_correct_PIN");
    }

    @When("^I choose \"([^\"]*)\" from the menu$")
    public void i_choose_from_the_menu(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_choose_from_the_menu");
    }

    @When("^I change the PIN to (\\d+)$")
    public void i_change_the_PIN_to(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_change_the_PIN_to");
    }

    @Then("^the system should remember my PIN is now (\\d+)$")
    public void the_system_should_remember_my_PIN_is_now(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_system_should_remember_my_PIN_is_now");
    }

    @When("^I try to change the PIN to the original PIN number$")
    public void i_try_to_change_the_PIN_to_the_original_PIN_number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_try_to_change_the_PIN_to_the_original_PIN_number");
    }

    @Then("^I should see a warning message$")
    public void i_should_see_a_warning_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i_should_see_a_warning_message");
    }

    @Then("^the system should not have changed my PIN$")
    public void the_system_should_not_have_changed_my_PIN() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the_system_should_not_have_changed_my_PIN");
    }

}
