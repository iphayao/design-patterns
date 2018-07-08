package com.iphayao.demo;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Finish!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void endPay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
