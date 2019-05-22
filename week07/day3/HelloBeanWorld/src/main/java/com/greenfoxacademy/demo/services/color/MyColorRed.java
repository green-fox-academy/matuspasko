package com.greenfoxacademy.demo.services.color;

import com.greenfoxacademy.demo.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
// ked mame viac farieb cez @Autowired musime to cez @Qualifier urcit ze je to farba red
@Qualifier("red")
public class MyColorRed implements MyColor {

    @Autowired
    Printer myPrinter;

    @Override
    public void printColor() {
        myPrinter.log("This is color Red!");
    }
}
