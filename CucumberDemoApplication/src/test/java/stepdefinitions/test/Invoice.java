package stepdefinitions.test;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by pradeep on 11/10/16.
 */
public class Invoice {

    @Given("^I am an signed-in user with role : admin$")
    public void i_am_an_signed_in_user_with_role_admin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^a client \"([^\"]*)\" exists with name : \"([^\"]*)\"$")
    public void a_client_exists_with_name(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^a project \"([^\"]*)\" exists with name :$")
    public void a_project_exists_with_name(String arg1, DataTable arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @Given("^a issue \"([^\"]*)\" exists with name :$")
    public void a_issue_exists_with_name(String arg1, DataTable arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @Given("^a work_unit \"([^\"]*)\" exists with name :$")
    public void a_work_unit_exists_with_name(String arg1, DataTable arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @Given("^I am on the admin invoices page$")
    public void i_am_on_the_admin_invoices_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I follow \"([^\"]*)\"$")
    public void i_follow(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_fill_in_with(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I press \"([^\"]*)\"$")
    public void i_press(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should not see \"([^\"]*)\"$")
    public void i_should_not_see(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
