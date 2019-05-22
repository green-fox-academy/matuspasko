package com.greenfoxacademy.demo.services.color;

import com.greenfoxacademy.demo.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("yellow")
public class MyColorYellow implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("This is color Yellow!");
    }
}
