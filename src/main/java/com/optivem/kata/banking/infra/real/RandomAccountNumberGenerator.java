package com.optivem.kata.banking.infra.real;

import com.optivem.kata.banking.core.domain.accounts.AccountNumber;
import com.optivem.kata.banking.core.domain.common.base.Generator;
import com.optivem.kata.banking.core.ports.driven.AccountNumberGenerator;
import de.huxhorn.sulky.ulid.ULID;
import org.springframework.stereotype.Component;

@Component
public class RandomAccountNumberGenerator implements AccountNumberGenerator {
    private final ULID ulid;

    public RandomAccountNumberGenerator() {
        ulid = new ULID();
    }

    @Override
    public String next() {
        return ulid.nextULID();
    }
}