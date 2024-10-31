package com.teachmeskills.lesson_8.model.document;

import java.util.Date;

public class Check {



        public double transferAmount;
        public Date transferDate;
        String fromNumber;
        String toNumber;
        String comment;

        public Check(double transferAmount,  String toNumber, String fromNumber, Date transferDate, String comment) {
            this.transferAmount = transferAmount;
            this.transferDate = transferDate;
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.comment = comment;
        }

        public void showCheckInfo(){
            System.out.println("Сумма перевода: " + this.transferAmount + " " + "Дата перевода: " + this.transferDate
                    + ", с:" + this.fromNumber
                    + " , на:" + this.toNumber
                    + " . Комментарий: " + this.comment);
        }

    }

