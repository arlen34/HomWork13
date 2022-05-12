package com.company;

public class Class {
    private final int nomer;
    private final String soz;
    private final int massive;

    public Class(int myNomer, String mySoz, int myMassive){
        this.nomer = myNomer;
        this.soz = mySoz;
        this.massive = myMassive;
    }

    public int getNomer() {
        return nomer;
    }

    public String getSoz() {
        return soz;
    }

    public int getMassive() {
        return massive;
    }
}
