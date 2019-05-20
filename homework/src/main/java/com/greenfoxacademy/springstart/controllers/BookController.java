package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book("Cats Cradle", "Kurt Vonnegut", 1963));
        books.add(new Book("Do Androids Dream of Elecric Sheep", "Philip K. Dick", 1968));
    }


}
