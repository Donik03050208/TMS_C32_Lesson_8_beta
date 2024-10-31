package com.teachmeskills.lesson_8.model.card;

import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

public class VisaCard extends BaseCard{

    int cashback;

    public VisaCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, int cashback) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.cashback = cashback;
    }

    @Override
    public boolean checkCardLimitTransfer(double transferAmount) {
       return Constants.visaCardLimit > transferAmount;

    }
}
