package com.company;
import java.util.ArrayList;
public class Animal {
    private String name;
    private int level=1, cost=0; double visitCost=0; int purchased=0, tileNum=0;

    public ArrayList<String> occupiedBy = new ArrayList<>();

    //for setup
    public Animal(String inputName,int inputLevel, int inputCost, double visitCost, int inputPurchased, int inputTileNum) {
        name=inputName;
        level=inputLevel;
        cost=inputCost;
        purchased=inputPurchased;
        tileNum=inputTileNum;

        occupiedBy.add ("*");
        occupiedBy.add("!");
        occupiedBy.add("?");
        occupiedBy.add("%");
    }




    //for printing to board
    public int getLevel() {
        return level;
    }
    public void setLevel(int inputLevel) {
        level = inputLevel;
    }

    public int getCost() {
        return cost;
    }

    public double getVisitCost() {
        return visitCost;
    }
    public void setVisitCost() {
        visitCost *= level;
    }

    public int getPurchased() {
        return purchased;
    }
    public void setPurchased(int inputPurchased) {
        purchased=inputPurchased;
    }
    public int getTileNum() {
        return tileNum;
    }

}
