package com.rule_engine.types;

public class Fee {
    private final int amount;
    private final Transaction transaction;

    public Fee(int amount, Transaction transaction) {
        this.amount = amount;
        this.transaction = transaction;
    }

    public int getAmount() {
        return amount;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}
