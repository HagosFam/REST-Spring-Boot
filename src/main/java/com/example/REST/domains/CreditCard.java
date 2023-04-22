package com.example.REST.domains;

public class CreditCard {
    private String cardNumber;
    private String type;
    private String validationDate;

    public CreditCard(String cardNumber, String type, String validationDate) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.validationDate = validationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getType() {
        return type;
    }

    public String getValidationDate() {
        return validationDate;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValidationDate(String validationDate) {
        this.validationDate = validationDate;
    }


}
