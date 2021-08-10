package tech.geterrays.bookmnager.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.geterrays.bookmnager.book.model.Book;

public interface BookRepo extends JpaRepository<Book,Long> {
    void deleteById(Long id);
    Book findBookById(Long id);
}
