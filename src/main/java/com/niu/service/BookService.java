package com.niu.service;

import com.niu.dao.BookDao;
import com.niu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sang on 2018/7/15.
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    public void addBook(Book book) {
        bookDao.save(book);
    }
    public Page<Book> getBookByPage(Pageable pageable) {
        return bookDao.findAll(pageable);
    }
    public List<Book> getBooksByAuthorStartingWith(String author){
        return bookDao.getBooksByAuthorStartingWith(author);
    }
    public List<Book> getBooksByPriceGreaterThan(Float price){
        return bookDao.getBooksByPriceGreaterThan(price);
    }
    public Book getMaxIdBook(){
        return bookDao.getMaxIdBook();
    }
    public List<Book> getBookByIdAndAuthor(String author, Long id){
        return bookDao.getBookByIdAndAuthor(author, id);
    }
    public List<Book> getBooksByIdAndName(String name, Long id){
        return bookDao.getBooksByIdAndName(name, id);
    }
}