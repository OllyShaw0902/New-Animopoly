
package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> diceRolls = new ArrayList<Integer>();
        diceRolls = Dice();

        if(diceRolls.get(0) == 1){
            Cards();
        }



    }
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
    public static void Cards(){
        System.out.println("This is where the card selection method will be.");
    }
}
