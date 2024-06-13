package com.rule_engine.rules;

import com.rule_engine.types.Fee;
import com.rule_engine.types.Transaction;

public interface FeeRule {

    Fee applyFee(Transaction transaction);
}
