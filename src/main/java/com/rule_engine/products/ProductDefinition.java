package com.rule_engine.products;

import com.rule_engine.rules.FeeRule;
import com.rule_engine.types.Fee;
import com.rule_engine.types.Transaction;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProductDefinition {

    private String name;
    private Set<FeeRule> feeChain;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void addFee(FeeRule feeRule) {
        if (feeChain != null ) {
            feeChain.add(feeRule);
        } else {
            feeChain = new LinkedHashSet<>() ;
            feeChain.add(feeRule);
        }
    }

    protected Set<FeeRule> getFeeChain() {
        return feeChain;
    }

    public int getFeeAmount(Transaction transaction) {
        if(transaction == null)
            return 0;

        return this.getFeeChain()
                .stream()
                .map(fr -> fr.applyFee(transaction))
                .map(Fee::getAmount)
                .reduce(0, Integer::sum);
    }
}
