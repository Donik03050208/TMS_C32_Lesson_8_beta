package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;
import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

import static com.teachmeskills.lesson_8.utils.Constants.masterCardLimit;

// TODO реализовать имплементацию интерфейса
public class MasterCardTransferService implements CardTransferService{


    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double transferAmount) {
        if (cardFrom.checkCardLimitTransfer(transferAmount)){
            cardFrom.amount += transferAmount;
            cardTo.amount -= transferAmount;
            return new Check(transferAmount,cardTo.cardNumber, cardFrom.cardNumber, new Date(), "Success");

        } else{
            return new Check(transferAmount, cardTo.cardNumber, cardFrom.cardNumber, new Date(), "Были превышены лимиты. Лимит для перевода по данной карте = " + masterCardLimit);

        }

    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardSender, Account receivingAccount, double amountTransfer) {
        if(cardSender.amount >= amountTransfer){
            if(amountTransfer > 0){
                if (cardSender.checkCardLimitTransfer(amountTransfer)) {
                    cardSender.amount -= amountTransfer;
                    receivingAccount.amount += amountTransfer;
                    return new Check(amountTransfer, cardSender.cardNumber, receivingAccount.accountNumber, new Date(), "Success.");
                } else {
                    return new Check(amountTransfer, cardSender.cardNumber, receivingAccount.accountNumber, new Date(),
                            "Limits have been exceeded. The transfer limit for this card is: " + masterCardLimit);
                }
            }else{
                return new Check(amountTransfer, cardSender.cardNumber, receivingAccount.accountNumber, new Date(),
                        "Incorrect value.");
            }
        }else {
            return new Check(amountTransfer, cardSender.cardNumber, receivingAccount.accountNumber, new Date(),
                    "Insufficient funds on the card.");
        }
    }
}







