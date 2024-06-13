package com.rule_engine.types;

import com.rule_engine.products.ProductDefinition;

public interface ProductDefinitionStore {

    ProductDefinition findProductDefinition(Transaction txn);
}
