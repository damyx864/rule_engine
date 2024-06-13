package com.rule_engine.calculator;

import com.rule_engine.products.ProductDefinition;
import com.rule_engine.types.Transaction;

public class FeeCalculatorImpl implements FeeCalculator {

    @Override
    public int calculateFee(Transaction txn, ProductDefinition product) {

        return product.getFeeAmount(txn);
    }
}
