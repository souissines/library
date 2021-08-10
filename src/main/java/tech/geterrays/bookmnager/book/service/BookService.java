package tech.geterrays.bookmnager.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.geterrays.bookmnager.book.model.Book;
import tech.geterrays.bookmnager.book.repo.BookRepo;

import java.util.List;

@Service
public class BookService {
    private final BookRepo bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public Book addBook(Book book){
       return bookRepo.save(book);
    }

    public List<Book> findAllBooks(){
        return bookRepo.findAll();
    }
    public Book updateBook(Book book){
        return bookRepo.save(book);
    }
    public Book findBookById(Long id){
        return bookRepo.findBookById(id);
    }
    public void deleteBook(Long id){
        bookRepo.deleteById(id);
    }


}
