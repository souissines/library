package tech.geterrays.bookmnager.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.geterrays.bookmnager.book.model.Book;
import tech.geterrays.bookmnager.customer.model.Customer;

public interface CustomerRepo  extends  JpaRepository<Customer,Long> {
    void deleteById(Long id);
    Customer findCustomerById(Long id);
}
