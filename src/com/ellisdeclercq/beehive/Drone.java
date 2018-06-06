package com.ellisdeclercq.beehive;

public class Drone {

    long load;
    int times;

    public Drone ( long load, int times ) {
        System.out.println("create new drone");
        this.load = load;
        this.times = times;
    }

    public static void main(String[] args) {
        Drone Richard = new Drone(25000, 5);
        long amount = Richard.load * Richard.times;

        System.out.println(amount);
    }
}
