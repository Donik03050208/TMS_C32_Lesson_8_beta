package com.teachmeskills.lesson_8.fabric;

import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;

import java.util.Date;

public class CardFabric {
    public BaseCard createCardByCode (int cardCode){
        if (cardCode==1){
            return new VisaCard("346353", 566 , new Date() ,"Bogdan", "usd", 23 );

        }
        else {
            return new MasterCard("346353", 896 , new Date() ,"Alice", "usd", "Belarus");
        }
    }
}
