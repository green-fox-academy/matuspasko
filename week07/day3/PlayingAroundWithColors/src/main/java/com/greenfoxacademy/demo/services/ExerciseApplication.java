package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.services.color.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication implements CommandLineRunner {


    // tieto @aotowire and @ Qualifered sa daju spravit aj cez  constructor (Martin to tak ma na GitHub)
    @Autowired
    @Qualifier("blue")
    private MyColor color1;

    @Autowired
    @Qualifier("red")
    private MyColor color2;
    // Printer.MyColor myColor;

    @Autowired
    @Qualifier("yellow")
    private MyColor color3;

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        color1.printColor();
        color2.printColor();
        color3.printColor();

    }
}