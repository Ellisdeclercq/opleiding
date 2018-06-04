package com.ellisdeclercq.beehive;

public class Soldier {
    int  hitpoints = 100;
    String weapon;
    int armour = 2;
    int strength = 10;
    String name;

    public Soldier (String name) {
        this("John Doe", hitpoints, armour, strength);
    }

    public void Defend() {
        System.out.println(name + "is defending");
    }

    public void attack(Soldier enemy) {
        enemy.hitpoints -= ((this.strength * 1.5) - enemy.armour);
        this.hitpoints -= ((enemy.strength * 0.5) - this.armour);
    }

    public boolean isDead() {
        return (hitpoints <= 0);
    }


    public static void main(String[] args) {
        Soldier arnold = new Soldier("John doe", 100, 2, 3);
        Soldier sylvester = new Soldier();

        while (arnold.hitpoints > 0 && sylvester.hitpoints > 0) {
            arnold.attack(sylvester);

            sylvester.attack(arnold);
        }

        sylvester.isDead();
        arnold.isDead();

    }
}
