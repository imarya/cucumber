package com.cucumber.application.nicebank;

import cucumber.api.Transformer;

/**
 * Created by pradeep on 15/10/16.
 */
public class MoneyConverter extends Transformer<Money> {
    @Override
    public Money transform(String amount) {
        String[] numbers = amount.split("\\.");
        int rupee = 0;
        int paisa = 0;
        if(numbers != null && numbers.length > 0) {
            rupee = Integer.parseInt(numbers[0]);

            if (numbers.length > 1) {
                paisa = Integer.parseInt(numbers[1]);
            }
        }
        return new Money(rupee, paisa);
    }
}
