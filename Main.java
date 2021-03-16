package com.company;
import java.util.Random;

public class Main {

    public static int drawCard(){
        Random random = new Random();

        int cardNum = random.nextInt(19) + 1;
        return cardNum;
    }

    public static void main(String[] args) {
        
        //chance card setup
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
            tileNum=tileNum+1
        }else if (cardNumber == 16){
            tileNum=tileNum+2
        }else if (cardNumber == 17){
            tileNum=tileNum+3
        }else if (cardNumber == 18){
            tileNum=tileNum-1
        }else if (cardNumber == 19){
            tileNum=tileNum-2
        }else if (cardNumber == 20){
            tileNum=tileNum-3
        }
        System.out.println(money);
        System.out.println(turnsToMiss);
        
        //animal/tile setup
        AnimalSetUp();
        
        //board setup
        Board();
    }
    public static void Board(){

        //Currently prints uneditable board 
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("|  Start  | Dolphin |  Whale  |  Shark  |   Dog   |   Cat   |  Rabbit |  Badger |");
        System.out.println("|         |    1    |    2    |    3    |    4    |    5    |    6    |    7    |");
        System.out.println("|         |   OCE   |   OCE   |   OCE   |   PET   |   PET   |   PET   |   FOR   |");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|         |                                                           |         |");
        System.out.println("| Elephant|                                                           | Squirrel|");
        System.out.println("|   25    |                                                           |    8    |");
        System.out.println("|   SAV   |                                                           |   FOR   |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|         |                                                           |         |");
        System.out.println("|  Rhino  |                                                           |   Deer  |");
        System.out.println("|   24    |                                                           |    9    |");
        System.out.println("|   SAV   |                                                           |   FOR   |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|         |                                                           |         |");
        System.out.println("|  T-Rex  |                                                           |  Raptor |");
        System.out.println("|   23    |                                                           |    10   |");
        System.out.println("|  DINO!  |                                                           |   DINO! |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|         |                                                           |         |");
        System.out.println("| Panther |                                                           |   Lion  |");
        System.out.println("|   22    |                                                           |    11   |");
        System.out.println("|   RAI   |                                                           |    SAV  |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|         |                                                           |         |");
        System.out.println("| Gorilla |                                                           |   Zebra |");
        System.out.println("|   21    |                                                           |    12   |");
        System.out.println("|   RAI   |                                                           |    SAV  |");
        System.out.println("|         |                                                           |         |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("|  Parrot |   Seal  | Penguin |PolarBear|  Lizard | Kangaroo|  Koala  |   Miss  |");
        System.out.println("|   20    |    19   |    18   |    17   |    16   |    15   |    14   |    a    |");
        System.out.println("|   RAI   |   ART   |   ART   |   ART   |   OUT   |   OUT   |   OUT   |   turn  |");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("---------------------------------------------------------------------------------");
    }
    public static void AnimalSetUp() {
        dolphin = new Animal(dolphin, 0, 60, 2, 0, 1);
        whale = new Animal(whale, 0, 60, 2, 0, 2);
        shark = new Animal(shark, 0, 60, 2, 0, 3);
        dog = new Animal(dog, 0, 100, 3, 0, 4);
        cat = new Animal(cat, 0, 100, 3, 0, 5)
        rabbit = new Animal(rabbit, 0, 100, 3, 0, 6);
        badger = new Animal(badger, 0, 140, 4.5, 0, 7);
        squirrel = new Animal(squirrel, 0, 140, 4.5, 0, 8);
        deer = new Animal(deer, 0, 140, 4.5, 0, 9);
        raptor = new Animal(raptor, 0, 1500, 50, 0, 10);
        lion = new Animal(lion, 0, 350, 11.5, 0, 11);
        zebra = new Animal(zebra, 0, 350, 11.5, 0, 12);
        koala = new Animal(koala, 0, 180, 6, 0, 14);
        kangaroo = new Animal(kangaroo, 0, 180, 6, 0, 15);
        lizard = new Animal(lizard, 0, 180, 6, 0, 16);
        polarBear = new Animal(polarBear, 0, 220, 7, 0, 17);
        penguin = new Animal(penguin, 0, 220, 7, 0, 18);
        seal = new Animal(seal, 0, 220, 7, 0, 19);
        parrot = new Animal(parrot, 0, 260, 8.5, 0, 20);
        gorilla = new Animal(gorilla, 0, 260, 8.5, 0, 21);
        panther = new Animal(panther, 0, 260, 8.5, 0, 22);
        trex = new Animal(trex, 0, 1500, 50, 0, 23);
        rhino = new Animal(rhino, 0, 350, 11.5, 0, 24);
        elephant = new Animal(elephant, 0, 350, 11.5, 0, 25);
    }
}

