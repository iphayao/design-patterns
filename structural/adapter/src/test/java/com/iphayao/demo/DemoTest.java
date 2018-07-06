package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    AudioPlayer audioPlayer = new AudioPlayer();

    @Test
    public void testAdapterPlayingMp3FileGetPlayingWithFileName() {
        assertEquals("Playing mp3 file. Name: beyond the horizon.mp3",
                audioPlayer.play("mp3", "beyond the horizon.mp3"));
    }

    @Test
    public void testAdapterPlayingMp4FileGetPlayingWithFileName() {
        assertEquals("Playing mp4 file. Name: alone.mp4",
                audioPlayer.play("mp4", "alone.mp4"));
    }

    @Test
    public void testAdapterPlayingVlcFileGetPlayingWithFileName() {
        assertEquals("Playing vlc file. Name: far far away.vlc",
                audioPlayer.play("vlc", "far far away.vlc"));
    }

    @Test
    public void testAdapterPlayingAviFileGetInvalidDescription() {
        assertEquals("Invalid media. avi format not supported",
                audioPlayer.play("avi", "mind me.avi"));
    }
}