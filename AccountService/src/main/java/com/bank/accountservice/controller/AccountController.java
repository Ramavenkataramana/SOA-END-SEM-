package com.bank.accountservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.accountservice.model.Account;

@RestController
@RequestMapping("/api/v1/Internal/accounts")
public class AccountController {

    @GetMapping
    public List<Account> getAccounts() {
        return Arrays.asList(
            new Account(1L, "Ram", 50000.0),
            new Account(2L, "Krishna", 75000.0),
            new Account(3L, "Arjun", 90000.0)
        );
    }

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return new Account(id, "Ram", 50000.0);
    }
}
