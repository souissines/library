package tech.geterrays.bookmnager.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.geterrays.bookmnager.customer.model.Customer;
import tech.geterrays.bookmnager.customer.repo.CustomerRepo;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer addCustomer(Customer customer) {
        customer.setCustomerCode((UUID.randomUUID().toString()));
        return customerRepo.save(customer);
    }

    public List<Customer> findAllcustomers() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerRepo.findCustomerById(id);
    }

    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }


}
