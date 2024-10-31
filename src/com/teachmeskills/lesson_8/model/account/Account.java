package com.teachmeskills.lesson_8.model.account;

import static com.teachmeskills.lesson_8.utils.Constants.accountLimit;

public class Account {

    public String accountNumber;
    public double amount;

    public Account(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;

    }

    public boolean checkAccountLimitTransfer(double transferAmount) {
        if (transferAmount > accountLimit) {
            System.out.println("The transfer limit from the account has been exceeded.");
            return false;
        } else {
            System.out.println("The limit has not been exceeded.");
            return true;
        }
    }
}