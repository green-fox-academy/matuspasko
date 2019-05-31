package com.gfa.book.demo.controllers;

import com.gfa.book.demo.models.Book;
import com.gfa.book.demo.services.BookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {

    BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public String showBooks(Model model) {
        List<Book> allBooks = service.getBookList();
        model.addAttribute("firstBook", service.getBookList().get(0));
        model.addAttribute("books", service.getBookList());
        return "index";
    }

    @RequestMapping(path = "/booksby", method = RequestMethod.GET)
    public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) { // http://localhost:8080/booksby?author=Author1
        model.addAttribute("firstBook", service.getBookList().get(0));
        model.addAttribute("books", service.buildFilteredBooks(author));
        return "index";
    }

    @RequestMapping(path = "/booksby2", method = RequestMethod.GET)
    public String queryBooksTwoo() {

        return "one";
    }

    @RequestMapping(path = "/booksby", method = RequestMethod.POST)
    public String queryBooksForm(Model model, @RequestParam(name = "author") String author) {
        model.addAttribute("firstBook", service.getBookList().get(0));
        model.addAttribute("books", service.buildFilteredBooks(author));
        return "index";
    }

    @GetMapping("/sorted")
    public String booksSorted (Model model){
        model.addAttribute("booksSorted", service.getBookList();
        return "sorted";
    }
}
