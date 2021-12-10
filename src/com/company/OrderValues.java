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
        if (statCode.equals("UT")){
            return pris*1.0685;
        }else if (statCode.equals("NV")){
            return pris*1.0800;
        }
        return 0;
    }
}
