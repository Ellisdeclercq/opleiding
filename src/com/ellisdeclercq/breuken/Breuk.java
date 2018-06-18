package com.ellisdeclercq.breuken;

public class Breuk {

    private int teller;
    private int noemer;

    public Breuk (int teller, int noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }

    public int getTeller() {
        return teller;
    }



    public int getNoemer() {
        return noemer;
    }





/*
    private void plusmin(Breuk a, Breuk b) {
        int tellerc = a.teller * b.noemer;
        int noemerc = a.noemer * b.teller;
        Breuk d = (tellerc, noemerc);

        System.out.println(d);
    }
    */

    public Breuk plus(Breuk that) {
        int nieuweTeller = this.teller * that.noemer + this.noemer * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk min (Breuk that) {
        int nieuweTeller = this.teller * that.noemer - this.noemer * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk maal (Breuk that) {
        int nieuweTeller = this.teller * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk omkering () {
        int nieuweTeller = this.noemer;
        int nieuweNoemer = this.teller;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk deel (Breuk that) {
        that.omkering();
        this.maal(that);

        return new Breuk (this.teller, this.noemer);
    }


}
