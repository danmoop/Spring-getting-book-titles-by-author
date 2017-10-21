package com.crudspring.Main.Controller;

import com.crudspring.Main.Model.Book;
import com.crudspring.Main.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController
{
    @Autowired
    BookService bookService;

    @RequestMapping("/books/{author}")
    public String authorsBook(@PathVariable String author)
    {
        return bookService.findAuthorsBook(author).getTitle();
    }
}
