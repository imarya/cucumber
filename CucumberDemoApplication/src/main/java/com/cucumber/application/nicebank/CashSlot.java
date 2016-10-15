package com.cucumber.application.nicebank;

/**
 * Created by pradeep on 15/10/16.
 */
public class CashSlot {

    private Money money;

    public Money getMoney() {
        if (money == null) {
            money = new Money();
        }
        return money;
    }

    public void dispense(Money money) {
        this.money = money;
    }
}
