package com.iphayao.demo;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPay();

    public final void play() {
        initialize();
        startPlay();
        endPay();
    }
}
