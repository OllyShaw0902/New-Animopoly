package com.company;
import java.util.Random;

public class Main {

    public static int drawCard(){
        Random random = new Random();

        int cardNum = random.nextInt(19) + 1;
        return cardNum;
    }

    public static void main(String[] args) {
        int money = 0;
        int turnsToMiss = 0;
        int tileNum;
        int cardNumber=drawCard();
        System.out.println(cardNumber);
        if (cardNumber == 1){
            money = money + 100;
        }else if (cardNumber == 2){
            money = money + 200;
        }else if (cardNumber == 3){
            money = money + 300;
        }else if (cardNumber == 4){
            money = money + 400;
        }else if (cardNumber == 5){
            money = money + 500;
        }else if (cardNumber == 6){
            money = money - 100;
        }else if (cardNumber == 7){
            money = money - 200;
        }else if (cardNumber == 8){
            money = money - 300;
        }else if (cardNumber == 9){
            money = money - 400;
        }else if (cardNumber == 10){
            money = money - 500;
        }else if (cardNumber == 11){
            turnsToMiss = turnsToMiss + 1;
        }else if (cardNumber == 12){
            turnsToMiss = turnsToMiss + 2;
        }else if (cardNumber == 13){
            tileNum = 0;
            System.out.println(tileNum);
        }else if (cardNumber == 14){
            tileNum = 13;
            System.out.println(tileNum);
        }else if (cardNumber == 15){
            //PLACEHOLDER
        }else if (cardNumber == 16){
            //PLACEHOLDER
        }else if (cardNumber == 17){
            //PLACEHOLDER
        }else if (cardNumber == 18){
            //PLACEHOLDER
        }else if (cardNumber == 19){
            //PLACEHOLDER
        }else if (cardNumber == 20){
            //PLACEHOLDER
        }
        System.out.println(money);
        System.out.println(turnsToMiss);
    }
}

