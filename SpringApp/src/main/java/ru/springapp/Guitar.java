package ru.springapp;


import org.springframework.stereotype.Component;

@Component
public class Guitar implements MusicalInstrument {
    @Override
    public String nowPlaying () {
        return("guitar");
    }



}
