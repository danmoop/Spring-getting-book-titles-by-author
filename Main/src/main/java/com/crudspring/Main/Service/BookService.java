package com.crudspring.Main.Service;

import com.crudspring.Main.Model.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService
{
    private List<Book> allBooks = Arrays.asList(
            new Book("Angels & Demons", "Dan Brown", 2000),
            new Book("Harry Potter", "J K Rowling", 1998),
            new Book("Fahrenheit 451", "Ray Bradburry", 1950)
    );

    public List<Book> getAllBooks()
    {
        return allBooks;
    }

    public Book findAuthorsBook(String author)
    {
        return allBooks.stream().filter(book -> book.getAuthor().equals(author)).findAny().get();
    }
}
