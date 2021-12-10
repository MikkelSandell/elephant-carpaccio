package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo world");
        OrderValues first = new OrderValues(1,10,"UT");
        OrderValues secend = new OrderValues(2,30,"NV");
        System.out.println(first.tax());
        System.out.println(secend.tax());
    }
}
