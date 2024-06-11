package com.springapp;

import org.springframework.beans.factory.annotation.Autowired;

public class MusicPlayer {
    private Music music;


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic () {
        System.out.println("now playing " + music.getSong());
    }
}
