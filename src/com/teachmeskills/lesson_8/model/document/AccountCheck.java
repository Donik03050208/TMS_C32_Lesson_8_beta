package com.teachmeskills.lesson_8.model.document;


import java.util.Date;

public class AccountCheck {
    public double transferAmount;
    public Date transferDate;
    String senderAccount;
    String receivingAccount;
    String comment;

    public AccountCheck(double transferAmount, Date transferDate, String senderAccount,  String receivingAccount, String comment) {
        this.transferAmount = transferAmount;
        this.transferDate = transferDate;
        this.senderAccount = senderAccount;
        this.receivingAccount = receivingAccount;
        this.comment = comment;
    }

    public void showAccountCheck() {
        System.out.println("Сумма перевода: " + this.transferAmount + " " + "Дата перевода: " + this.transferDate
                + ", с:" + this.senderAccount
                + " , на:" + this.receivingAccount
                + " . Комментарий: " + this.comment);


    }
}


