package com.teachmeskills.lesson_8.model.card;

import java.util.Date;

public abstract class BaseCard {
    public String cardNumber;
    public int cvv;
    public Date validDate;
    public String cardHolder;
    public String currency;
    public double amount;

    public BaseCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validDate = validDate;
        this.cardHolder = cardHolder;
        this.currency = currency;
    }

    public abstract boolean checkCardLimitTransfer(double transferAmount);

    public void showBaseInfo(){
        System.out.println(cardNumber + "->" + amount + "->" + validDate);
    }

}
