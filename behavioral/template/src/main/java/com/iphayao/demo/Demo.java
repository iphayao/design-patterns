package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Game game = new Basketball();
        game.play();

        game = new Football();
        game.play();

    }
}
