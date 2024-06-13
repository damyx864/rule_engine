package com.rule_engine.rules;

import com.rule_engine.types.Fee;
import com.rule_engine.types.Transaction;
import com.rule_engine.types.TransactionType;

public class FixedFee1PoundRedemption implements FeeRule {

    private final Transaction transaction;

    public FixedFee1PoundRedemption(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public Fee applyFee(Transaction txn) {

        int amt = 0;
        if (transaction.getType().equals(TransactionType.REDEMPTION)) {
            amt = 100;
        }

        return new Fee(amt, txn);
    }
}
