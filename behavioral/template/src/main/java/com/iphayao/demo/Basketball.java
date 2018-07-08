package com.iphayao.demo;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Basketball Game Finish!");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void endPay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }
}
