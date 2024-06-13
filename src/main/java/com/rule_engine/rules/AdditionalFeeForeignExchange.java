package com.rule_engine.rules;

import com.rule_engine.types.Fee;
import com.rule_engine.types.Transaction;

public class AdditionalFeeForeignExchange implements FeeRule {

    private final float ONE_POINT_FIVE_PERCENT = 0.015f;
    private final Transaction transaction;

    public AdditionalFeeForeignExchange(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public Fee applyFee(Transaction txn) {

        int amt = 0;
        if (transaction.isForeignExchange()) {
            amt = (int) (txn.getValue() * ONE_POINT_FIVE_PERCENT);
        }

        return new Fee(amt, txn);
    }
}
