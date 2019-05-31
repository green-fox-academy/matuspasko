package com.gfa.book.demo.services;

import com.gfa.book.demo.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private List<Book> bookList = new ArrayList<>();

    public BookService() {
        bookList.add(new Book("Title1", "Author1", 1963));
        bookList.add(new Book("Title2", "Author2", 1968));
        bookList.add(new Book("Title3", "Author3", 1966));
        bookList.add(new Book("Title4", "Author4", 1961));
        bookList.add(new Book("Title5", "Author5", 1969));
        bookList.add(new Book("Title6", "Author6", 1960));
    }


    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> buildFilteredBooks(String author) {
        List<Book> queriedBooks;

        if (author != null) {
            queriedBooks = filterBooksByAuthor(author);
        } else {
            queriedBooks = bookList;
        }
        return queriedBooks;
    }

    private List<Book> filterBooksByAuthor(String author) {
        return bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    public List<Book> booksSortedFromYoungToOld(){
        return bookList.stream()
                .sorted(Comparator.comparing(Book::getReleaseYear))
                .collect(Collectors.toList());
    }
}
