package com.teachmeskills.lesson_8;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.fabric.ParserFabric;
import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;
import com.teachmeskills.lesson_8.model.client.IndividualClient;
import com.teachmeskills.lesson_8.model.client.LegalClient;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;
import com.teachmeskills.lesson_8.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_8.transfer.impl.VisaCardTransferService;

import java.util.Date;
import java.util.Scanner;

import static com.teachmeskills.lesson_8.fabric.ParserFabric.createParser;

public class ApplicationRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.print("Specify the path to the file: ");
        //String path = sc.nextLine();
        //IParser parser = createParser(path);
        //parser.parseFile(path);


        // TODO реализовать тестовый сценарий
        // создать двух клиентов
        // каждому клиенту создать два счета и две карты
        // перевести с карты одного клиента на карту другого сумму денег
        // перевести с карты одного клинента на счет другого клиента сумму денег
       IndividualClient client1 = new IndividualClient();
       LegalClient client2 = new LegalClient();
       Account accountFirstClient = new Account("34567335", 3000);
       Account accountSecondClient = new Account("82583635", 6000);
       MasterCard masterCardFirstClient = new MasterCard("655653", 896 , new Date() ,"Alice", "usd", "Belarus");
       masterCardFirstClient.amount = 267.76;
       MasterCard masterCardSecondClient = new MasterCard("865678", 765 , new Date() ,"Bogdan", "usd", "Belarus");
       masterCardSecondClient.amount = 678.23;
       VisaCard visaCardFirstClient = new VisaCard("346353", 566 , new Date() ,"Alice", "usd", 26 );
       visaCardFirstClient.amount = 345.67;
       VisaCard visaCardSecondClient = new VisaCard("643834", 606 , new Date() ,"Bogdan", "usd", 23 );
       visaCardSecondClient.amount = 1456.34;
       CardTransferService masterCardService = new MasterCardTransferService();
       Check resultCheck = masterCardService.transferFromCardToCard(masterCardFirstClient, masterCardSecondClient, 534.01);
       resultCheck.showCheckInfo();
       System.out.println("-----------------");
       System.out.println(masterCardFirstClient.amount);
       System.out.println(masterCardSecondClient.amount);
        VisaCardTransferService visaCardTransferService = new VisaCardTransferService();
        Check resultCheck2 = visaCardTransferService.transferFromCardToAccount(visaCardSecondClient, accountSecondClient, 1000);
        resultCheck2.showCheckInfo();
        System.out.println("-------");
        System.out.println(visaCardSecondClient.amount);
        System.out.println(accountSecondClient.amount);

    }

}
