package com.ellisdeclercq;

public class PrimeNumber {
    public static void main(String[] args) {
        int Testgetal = 18;
        int Deelgetal = Testgetal;
        int Count = 0;
        while (Testgetal <= Deelgetal) {
            Deelgetal--;
            if (Deelgetal % Testgetal == 0) {
                Count++;
            }
        }
        if (Count <= 2) {
            System.out.println("Het is een priemgetal");
        } else {
            System.out.println("Het is geen priemgetal");
        }
    }
}






