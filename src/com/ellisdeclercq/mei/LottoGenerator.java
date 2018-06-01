package com.ellisdeclercq.mei;

public class LottoGenerator {

    public static void main(String[] args) {

        int[] getallen = {0, 0, 0, 0, 0, 0};
        int x = 0;
        for (int z = 0; z < getallen.length ; z++) {
            x = RandomNumber.berekenRandomGetal(1,45);
            getallen[z] = x;
        }








        for (int p = 0; p <getallen.length; p++) {
            System.out.println(getallen[p]);
        }
        //System.out.println(x);
        //System.out.println(" " + getallen[0] + " " + getallen[1] + " " + getallen[2] + " " + getallen[3] + " " + getallen[4] + " " + getallen[5]);
    }
}
