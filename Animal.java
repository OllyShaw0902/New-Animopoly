package com.company;

public class Animal {
    private String name;
    private int level=1, cost=0, visitCost=0, purchased=0, tileNum=0;

    //for setup
    public int Animal(String inputName,int inputLevel, int inputCost, int visitCost, int inputPurchased, int inputTileNum) {
        name=inputName;
        level=inputLevel;
        cost=inputCost;
        purchased=inputPurchased;
        tileNum=inputTileNum;
    }

    public ArrayList<char> occupiedBy<Player> = new ArrayList<char>();
       occupiedBy.add("*");
       occupiedBy.add("!");
       occupiedBy.add("?");
       occupiedBy.add("%");

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

    public int getVisitCost() {
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
