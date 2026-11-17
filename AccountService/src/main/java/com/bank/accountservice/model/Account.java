package com.bank.accountservice.model;

public class Account {
    private Long id;
    private String accountHolder;
    private double balance;

    public Account() {}

    public Account(Long id, String accountHolder, double balance) {
        this.id = id;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
