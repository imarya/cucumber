package com.cucumber.application.support;

import com.cucumber.application.nicebank.Account;
import com.cucumber.application.nicebank.CashSlot;
import com.cucumber.application.nicebank.Teller;

/**
 * Created by pradeep on 15/10/16.
 */
public class KnowsMyDomain {

    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;

    public Account getMyAccount() {
        if (myAccount == null) {
            myAccount = new Account();
        }
        return myAccount;
    }

    public Teller getTeller() {
        if (teller == null) {
            teller = new Teller(this.getCashSlot());
        }
        return teller;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }
}
