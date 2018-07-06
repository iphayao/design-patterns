package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        System.out.println(audioPlayer.play("mp3", "beyond the horizon.mp3"));
        System.out.println(audioPlayer.play("mp4", "alone.mp4"));
        System.out.println(audioPlayer.play("vlc", "far far away.vlc"));
        System.out.println(audioPlayer.play("avi", "mind me.avi"));
    }
}
