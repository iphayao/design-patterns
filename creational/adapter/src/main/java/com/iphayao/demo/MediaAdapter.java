package com.iphayao.demo;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public String play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            return advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            return advancedMediaPlayer.playMp4(fileName);
        }
        return null;
    }
}
