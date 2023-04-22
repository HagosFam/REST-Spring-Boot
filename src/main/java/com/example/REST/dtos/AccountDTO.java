package com.example.REST.dtos;

import com.example.REST.domains.CreditCard;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AccountDTO {
    @Id
    private long id;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountNumber;
    private double amount;
    private CreditCard creditCard;

    public AccountDTO() {

    }

    public AccountDTO(String accountHolderName,String accountHolderEmail, String accountNumber, double amount) {
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
