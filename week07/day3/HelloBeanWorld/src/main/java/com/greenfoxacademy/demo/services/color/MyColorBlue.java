package com.greenfoxacademy.demo.services.color;

import com.greenfoxacademy.demo.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class MyColorBlue implements MyColor {

    @Autowired
    Printer myPrinter;


    @Override
    public void printColor() {
        myPrinter.log("It is blue color!");

    }
}
