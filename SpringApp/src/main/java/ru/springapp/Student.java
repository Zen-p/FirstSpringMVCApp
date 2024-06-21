package ru.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {

    private String name = "Ivan";

    @Autowired
    @Qualifier("guitar")
    private MusicalInstrument musicalInstrument;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String playMusic() {
        return name + " is now playing " + musicalInstrument.nowPlaying();
    }

}
