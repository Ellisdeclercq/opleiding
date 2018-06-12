package com.ellisdeclercq;

import java.util.Scanner;

public class Weersvoorpelling {

    public static void main(String[] args) {
        System.out.println("Geef een maand in.");

        Scanner s = new Scanner(System.in);
        String maand = s.nextLine();

        System.out.println("De zonuren in deze maand zijn: " + Maand.valueOf(maand).getZonUren());
        System.out.println("De neerslag in deze maand is: " + Maand.valueOf(maand).getRegen());
        System.out.println("De gemiddelde temperatuur in deze maand is: " + Maand.valueOf(maand).getTemperatuur());


    }

}
