package com.nebula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nebula.entity.Customer;
import com.nebula.repository.CustomerRepository;

@Service
public class CustomerService{
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long customerId, Customer updatedCustomer) {
        if (customerRepository.existsById(customerId)) {
            updatedCustomer.setCustomerId(customerId);
            return customerRepository.save(updatedCustomer);
        }
        return null; // Customer not found
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}