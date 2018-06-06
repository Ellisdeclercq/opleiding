package com.ellisdeclercq.beehive;

import com.ellisdeclercq.mei.RandomNumber;

import java.util.Random;

public class Queen {

    String name;
    int food;
    long sperm;
    long numberOfEggs;

    public Queen (String herName, long numberOfEggs) {
        name = herName;
        food = RandomNumber.berekenRandomGetal(20000,30000);
        sperm = 0;
        this.numberOfEggs = numberOfEggs;
    }

    public void matingFlight (int amount)  // later iets verzinnen voor invloed amount
    {
        sperm = sperm + amount;
    }


    public static void main(String[] args) {
        Queen Elisabeth = new Queen("Elisabeth", 40000);
        Elisabeth.matingFlight(12300);
        System.out.println(Elisabeth.sperm);

        while(Elisabeth.sperm > 0 && Elisabeth.food > 0) {
            Elisabeth.numberOfEggs = Elisabeth.numberOfEggs + 1;
            Elisabeth.sperm = Elisabeth.sperm - 1;
            Elisabeth.food = Elisabeth.food -1;
        }

        System.out.println(Elisabeth.numberOfEggs);

    }

    public int createsEgg(int numberOfEggs) {
        int number = 1 + numberOfEggs;

        return number;
    }
}
