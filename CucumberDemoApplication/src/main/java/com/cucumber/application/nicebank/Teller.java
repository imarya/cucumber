package com.cucumber.application.nicebank;

/**
 * Created by pradeep on 15/10/16.
 */
public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public CashSlot getCashSlot() {
        return cashSlot;
    }

    public void withdrawFromAccount(Account fromAccount, Money amount) {
        fromAccount.debit(amount);
        cashSlot.dispense(amount);
    }
}
