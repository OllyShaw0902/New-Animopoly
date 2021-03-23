package com.company;
import java.util.*;

public class Main {
    public static int drawCard(){
        Random random = new Random();

        int cardNum = random.nextInt(19) + 1;
        return cardNum;
    }

    public static void main(String[] args) {
        //setup
        //Instantiate all 4 player objects
        player one = new player("!", 2000, 0, 0, 1, false, true);
        System.out.println("Player one is the '!' symbol");
        player two = new player("?", 2000, 0, 0, 2, false, true);
        System.out.println("Player two is the '?' symbol");
        player three = new player("", 2000, 0, 0, 3, false, true);
        System.out.println("Player three is the '' symbol");
        player four = new player("%", 2000, 0, 0, 4, false, true);
        System.out.println("Player four is the '%' symbol");


        //chance card setup
        int money = 0;
        int turnsToMiss = 0;
        int tileNum= 0;
        int cardNumber=drawCard();
        System.out.println(cardNumber);
        if (cardNumber == 1){
            System.out.println("Gain £100!");
            money = money + 100;
        }else if (cardNumber == 2){
            System.out.println("Gain £200!");
            money = money + 200;
        }else if (cardNumber == 3){
            System.out.println("Gain £300!");
            money = money + 300;
        }else if (cardNumber == 4){
            System.out.println("Gain £400!");
            money = money + 400;
        }else if (cardNumber == 5){
            System.out.println("Gain £500!");
            money = money + 500;
        }else if (cardNumber == 6){
            System.out.println("Lose £100!");
            money = money - 100;
        }else if (cardNumber == 7){
            System.out.println("Lose £200!");
            money = money - 200;
        }else if (cardNumber == 8){
            System.out.println("Lose £300!");
            money = money - 300;
        }else if (cardNumber == 9){
            System.out.println("Lose £400!");
            money = money - 400;
        }else if (cardNumber == 10){
            System.out.println("Lose £500!");
            money = money - 500;
        }else if (cardNumber == 11){
            System.out.println("Unlucky! Miss one turn");
            turnsToMiss = turnsToMiss + 1;
        }else if (cardNumber == 12){
            System.out.println("Unlucky! Miss two turns");
            turnsToMiss = turnsToMiss + 2;
        }else if (cardNumber == 13){
            System.out.println("Go to start");
            tileNum = 0;
            System.out.println(tileNum);
        }else if (cardNumber == 14){
            System.out.println("Go to miss a turn");
            tileNum = 13;
            System.out.println(tileNum);
        }else if (cardNumber == 15){
            System.out.println("Move one space forward");
            tileNum=tileNum+1;
        }else if (cardNumber == 16){
            System.out.println("Move two spaces forward");
            tileNum=tileNum+2;
        }else if (cardNumber == 17){
            System.out.println("Move three spaces forward");
            tileNum=tileNum+3;
        }else if (cardNumber == 18){
            System.out.println("Move one space backwards");
            tileNum=tileNum-1;
        }else if (cardNumber == 19){
            System.out.println("Move two spaces backwards");
            tileNum=tileNum-2;
        }else if (cardNumber == 20){
            System.out.println("Move three spaces backwards");
            tileNum=tileNum-3;
        }
        System.out.println(money);
        System.out.println(turnsToMiss);

        //animal/tile setup
        AnimalSetUp();

        //board setup
        Board();

        //Rolls the dice
        ArrayList<Integer> diceRolls = new ArrayList<Integer>();
        diceRolls = Dice();

        if(diceRolls.get(0) == 1){
            drawCard();
        }

        //game starts
        //WIP
        int currentPlayer = 1;
        //while the the current player isn't bankrupt continue their turn (part 7 of flow chart)
        while(currentplayer.in == true) {
            //prints current player stats (part 2 of flow chart)
            getPlayerStats();
            //if player passes or lands on go then add £500 or £1000
            getPlayerStats(currentplayer);
            if(currentplayer.intitialPosition > currentplayer.currentPosition && currentplayer.currentPosition != 0) {
                currentplayer.money += 500;
            }
            else if(currentplayer.currentPosition == 0) {
                currentplayer.money += 1000;
            }
        }
        currentPlayer++;

    }

    //Dice method
    public static ArrayList<Integer> Dice(){
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();

        int dice1 = 0;
        int dice2 = 0;
        int doub = 0;

        System.out.println("Press enter to roll the dice.... ");
        String blank = reader.nextLine();

        System.out.println("Rolling Dice.....");

        dice1 = rand.nextInt(5) + 1;
        dice2 = rand.nextInt(5) + 1;

        int total = dice1 + dice2;

        System.out.println("You got "+dice1+" and "+dice2);
        System.out.println("In total you have rolled "+total);

        if(dice1 == dice2){
            System.out.println("Congratulations, you roll a double, pick up a card!");
            doub = 1;
        }

        ArrayList<Integer> dice = new ArrayList<Integer>();
        dice.add(doub);
        dice.add(total);


        return dice;


    }

    public static void Board(){

        //Currently prints uneditable board 

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|         |___OCE___|___OCE___|___OCE___|___PET___|___PET___|___PET___|___FOR___|");
        System.out.println("|  Start  | Dolphin |  Whale  |  Shark  |   Dog   |   Cat   |  Rabbit |  Badger |");
        System.out.println("|         |    1    |    2    |    3    |    4    |    5    |    6    |    7    |");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|___SAV___|                                                           |___FOR___|");
        System.out.println("| Elephant|                                                           | Squirrel|");
        System.out.println("|   25    |                                                           |    8    |");
        System.out.println("|         |                                                           |         |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|___SAV___|                                                           |___FOR___|");
        System.out.println("|  Rhino  |                                                           |   Deer  |");
        System.out.println("|   24    |                                                           |    9    |");
        System.out.println("|         |                                                           |         |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|__DINO!__|                                                           |__DINO!__|");
        System.out.println("|  T-Rex  |                                                           |  Raptor |");
        System.out.println("|   23    |                                                           |    10   |");
        System.out.println("|         |                                                           |         |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|___RAI___|                                                           |___SAV___|");
        System.out.println("| Panther |                                                           |   Lion  |");
        System.out.println("|   22    |                                                           |    11   |");
        System.out.println("|         |                                                           |         |");
        System.out.println("|         |                                                           |         |");
        System.out.println("-----------                                                           -----------");
        System.out.println("|___RAI___|                                                           |___SAV___|");
        System.out.println("| Gorilla |                                                           |  Zebra  |");
        System.out.println("|    21   |                                                           |   12    |");
        System.out.println("|         |                                                           |         |");
        System.out.println("|         |                                                           |         |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|___RAI___|___ART___|___ART___|___ART___|___OUT___|___OUT___|___OUT___|         |");
        System.out.println("| Parrot  |   Seal  | Penguin |PolarBear|  Lizard | Kangaroo|  Koala  |   Miss  |");
        System.out.println("|   20    |    19   |   18    |    17   |    16   |    15   |    14   |    a    |");
        System.out.println("|         |         |         |         |         |         |         |   turn  |");
        System.out.println("|         |         |         |         |         |         |         |         |");
        System.out.println("---------------------------------------------------------------------------------");
    }
    public static void AnimalSetUp() {
        Animal dolphin = new Animal("dolphin", 0, 60, 2, 0, 1);
        Animal whale = new Animal("whale", 0, 60, 2, 0, 2);
        Animal shark = new Animal("shark", 0, 60, 2, 0, 3);
        Animal dog = new Animal("dog", 0, 100, 3, 0, 4);
        Animal cat = new Animal("cat", 0, 100, 3, 0, 5);
        Animal rabbit = new Animal("rabbit", 0, 100, 3, 0, 6);
        Animal badger = new Animal("badger", 0, 140, 4.5, 0, 7);
        Animal squirrel = new Animal("squirrel", 0, 140, 4.5, 0, 8);
        Animal deer = new Animal("deer", 0, 140, 4.5, 0, 9);
        Animal raptor = new Animal("raptor", 0, 1500, 50, 0, 10);
        Animal lion = new Animal("lion", 0, 350, 11.5, 0, 11);
        Animal zebra = new Animal("zebra", 0, 350, 11.5, 0, 12);
        Animal koala = new Animal("koala", 0, 180, 6, 0, 14);
        Animal kangaroo = new Animal("kangaroo", 0, 180, 6, 0, 15);
        Animal lizard = new Animal("lizard", 0, 180, 6, 0, 16);
        Animal polarBear = new Animal("polarBear", 0, 220, 7, 0, 17);
        Animal penguin = new Animal("penguin", 0, 220, 7, 0, 18);
        Animal seal = new Animal("seal", 0, 220, 7, 0, 19);
        Animal parrot = new Animal("parrot", 0, 260, 8.5, 0, 20);
        Animal gorilla = new Animal("gorilla", 0, 260, 8.5, 0, 21);
        Animal panther = new Animal("panther", 0, 260, 8.5, 0, 22);
        Animal trex = new Animal("trex", 0, 1500, 50, 0, 23);
        Animal rhino = new Animal("rhino", 0, 350, 11.5, 0, 24);
        Animal elephant = new Animal("elephant", 0, 350, 11.5, 0, 25);
    }
}



