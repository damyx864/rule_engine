package com.rule_engine.products;

import com.rule_engine.rules.FixedFee1PoundRedemption;
import com.rule_engine.types.Transaction;
import com.rule_engine.rules.AdditionalFeeForeignExchange;

public class ThomasTravelProductDefinition extends ProductDefinition {

    public ThomasTravelProductDefinition(Transaction transaction) {
        super();
        this.setName("THOMAS TRAVEL");
        this.addFee(new FixedFee1PoundRedemption(transaction));
        this.addFee(new AdditionalFeeForeignExchange(transaction));
    }
}
