package dario.springframework.spring6restmvc.services;

import dario.springframework.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer> getCustomers();

    Customer getCustomerById(UUID customerId);
}
