package com.company.design.decorator;

public class Main {
    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();
        //등급을 올릴것이다.
        //A3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();
        //A4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        //A5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();
    }
}
