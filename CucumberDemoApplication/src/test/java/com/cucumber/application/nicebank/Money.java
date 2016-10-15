package com.cucumber.application.nicebank;

/**
 * Created by pradeep on 15/10/16.
 */
public class Money {

    private int rupee;
    private int paisa;

    public Money() {
    }

    public Money(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    public Money add(Money amount) {
        this.rupee += amount.rupee;
        this.paisa += amount.paisa;
        return this;
    }

    public Money subtract(Money dispenseAmount) {
        this.rupee -= dispenseAmount.rupee;
        this.paisa -= dispenseAmount.paisa;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        if (rupee != money.rupee) return false;
        return paisa == money.paisa;

    }

    @Override
    public int hashCode() {
        int result = rupee;
        result = 31 * result + paisa;
        return result;
    }
}
