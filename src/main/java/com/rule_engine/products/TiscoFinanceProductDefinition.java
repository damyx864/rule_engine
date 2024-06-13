package com.rule_engine.products;

import com.rule_engine.types.Transaction;
import com.rule_engine.rules.FixedFee5PerCentAfter10PM;

public class TiscoFinanceProductDefinition extends ProductDefinition {

    public TiscoFinanceProductDefinition(Transaction transaction) {
        super();
        this.setName("TISCO FINANCE");
        this.addFee(new FixedFee5PerCentAfter10PM(transaction));
    }
}
