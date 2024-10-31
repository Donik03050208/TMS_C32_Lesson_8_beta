package com.teachmeskills.lesson_8.transfer;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;

public interface CardTransferService {



    Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double transferAmount);

    Check transferFromCardToAccount(BaseCard cardSender, Account receivingAccountNumber, double amountTransfer);


}
