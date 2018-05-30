package com.ellisdeclercq;

public class Faculteit {
    public static void main(String[] args) {
        int faculteit = 1;
        int aantal = 6;

        int i = 1;
        while(i <= aantal)
        {
            faculteit *= i;
            i++;
        }

        System.out.println("De faculteit van " + aantal + " is " + faculteit);
    }
}
