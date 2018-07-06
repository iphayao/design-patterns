package com.iphayao.demo;

public class Mp4Player implements AdvancedMediaPlayer {
    public String playVlc(String fileName) {
        // Do nothing
        return null;
    }

    public String playMp4(String fileName) {
        return "Playing mp4 file. Name: " + fileName;
    }
}
