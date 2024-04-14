package com.mayank.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder().
                firstname(request.firstName())
                .lastname(request.lastName())
                .email(request.email())
                .build();
        customerRepository.save(customer);
    }
}
