package com.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Music music = context.getBean("musicBean", SortOfMusic.class);

        System.out.println(music.getSong());

        context.close();


    }
    
}
