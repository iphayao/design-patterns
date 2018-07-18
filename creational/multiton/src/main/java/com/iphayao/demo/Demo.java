package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Multiton m1 = Multiton.getInstance(MultitonType.ZERO);
        Multiton m2 = Multiton.getInstance(MultitonType.ONE);
        Multiton m3 = Multiton.getInstance(MultitonType.TWO);

        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());

    }
}
