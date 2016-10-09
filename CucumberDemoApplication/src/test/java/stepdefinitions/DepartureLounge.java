package stepdefinitions;

import cucumber.api.java.en.Given;

/**
 * Created with IntelliJ IDEA.
 * User: pradeep
 * Date: 9/10/16
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class DepartureLounge {

    @Given("^The flight (\\w+) is leaving today")
    public void theFlightLeavingToday(String flightName) {
        System.out.println("Flight " + flightName + " is leaving today");
    }
}
