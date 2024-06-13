package com.rule_engine.rules;

import com.rule_engine.types.Fee;
import com.rule_engine.types.Transaction;

public class FixedFee5PerCentAfter10PM implements FeeRule {

    private final int TEN_PM = 22;
    private final float FIVE_PERCENT = 0.05f;
    private final Transaction transaction;

    public FixedFee5PerCentAfter10PM(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public Fee applyFee(Transaction txn) {

        int amt = 0;
        if(transaction.getTime().getHour() >= TEN_PM) {
            amt = (int) (txn.getValue() * FIVE_PERCENT);
        }

        return new Fee(amt, txn);
    }
}
