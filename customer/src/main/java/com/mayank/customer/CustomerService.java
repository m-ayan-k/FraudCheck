package com.mayank.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().
                firstname(request.firstName())
                .lastname(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);
    }
}
