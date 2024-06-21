package ru.springapp;

import org.springframework.stereotype.Component;

@Component
public class Trumpet implements MusicalInstrument {
    @Override
    public String nowPlaying () {
        return("trumpet");
    }



}
