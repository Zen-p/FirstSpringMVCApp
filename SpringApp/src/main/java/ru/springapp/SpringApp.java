package ru.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCreate.class);


        Student student = context.getBean("studentBean", Student.class);
        System.out.println(student.playMusic());
        context.close();

    }
}
