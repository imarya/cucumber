package com.cucumber.application.nicebank;

/**
 * Created by pradeep on 11/10/16.
 */
public class Account {

    private Money balance = new Money();

    public void deposit(Money amount) {
        this.balance = balance.add(amount);
    }

    public Money getBalance() {
        return this.balance;
    }

    public void dispense(Money dispenseAmount) {
        this.balance = balance.subtract(dispenseAmount);
    }
}
