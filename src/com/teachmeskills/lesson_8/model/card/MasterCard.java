package com.teachmeskills.lesson_8.model.card;

import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

public class MasterCard extends BaseCard {

    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, String country) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(double transferAmount) {
        return Constants.masterCardLimit > transferAmount;
    }
}
