package com.example.REST.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {
    @Id
    private long id;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountNumber;
    private double amount;
    private CreditCard creditCard;

    public Account() {

    }

    public Account(String accountHolderName,String accountHolderEmail, String accountNumber, double amount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.accountHolderEmail = accountHolderEmail;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public String getAccountHolder() {
        return accountHolderName;
    }

    public String getGetAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolderName = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
