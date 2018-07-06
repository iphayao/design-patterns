package com.iphayao.demo;

public class VlcPlayer implements AdvancedMediaPlayer {
    public String playVlc(String fileName) {
        return "Playing vlc file. Name: " + fileName;
    }

    public String playMp4(String fileName) {
        // Do nothing
        return null;
    }
}
