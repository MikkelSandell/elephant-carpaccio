package com.company;

public class OrderValues {
    int antal;
    double pris;
    String statCode;
    public OrderValues(int antal, double pris, String statCode){
        this.antal = antal;
        this.pris = pris;
        this.statCode = statCode;
    }

    public double getPris() {
        return pris;
    }

    public double tax(){
        return switch (statCode) {
            case "UT" -> pris * 1.0685;
            case "NV" -> pris * 1.0800;
            case "TX" -> pris * 1.0625;
            case "AL" -> pris * 1.04;
            case "CA" -> pris * 1.0825;
            default -> 0;
        };
    }
}
