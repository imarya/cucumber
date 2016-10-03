package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;

import implementation.Checkout;

import static org.junit.Assert.*;


public class CheckoutSteps {

	private int itemPrice = 0;
	private Checkout checkout;

	@Given("^the price of a \"([^\"]*)\" is (\\d+)C$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
		itemPrice = price;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
		if(checkout == null){
			checkout = new Checkout();
		}
		checkout.add(itemName, itemCount, itemPrice);
	}

	@Then("^the total price should be (\\d+)$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
		assertEquals(total, checkout.getTotal());
	}

	@Given("^the price of a \"([^\"]*)\"  is (\\d+)C$")
	public void thePriceOfAIsC(String arg1, int arg2) throws Throwable {
		throw new PendingException();
	}

	@Then("^the total price should be (\\d+)C$")
	public void theTotalPriceShouldBeC(int arg1) throws Throwable {
		throw new PendingException();
	}



}
