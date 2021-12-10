package com.company;

public class OrderValues {
    int antal;
    double pris;
    String statCode;
    public OrderValues(int antal, double pris){
        this.antal = antal;
        this.pris = pris*1.685;
    }

    public double getPris() {
        return pris;
    }
}
