package com.rule_engine.calculator;

import com.rule_engine.products.ProductDefinition;
import com.rule_engine.types.Transaction;

public interface FeeCalculator {

    int calculateFee(Transaction txn, ProductDefinition product);
}
