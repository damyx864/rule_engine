package com.rule_engine.types;

import java.time.LocalDateTime;

public class Transaction {

    private final TransactionType type;
    private final int value;
    private final LocalDateTime time;
    private final boolean foreignExchange;

    public Transaction(TransactionType type, int value, LocalDateTime time, boolean foreignExchange) {
        this.type = type;
        this.value = value;
        this.time = time;
        this.foreignExchange = foreignExchange;
    }

    public TransactionType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean isForeignExchange() {
        return foreignExchange;
    }
}
