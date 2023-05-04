package com.krisbude.exercise.endpoint;

import com.krisbude.exercise.dao.CustomerRepository;
import com.krisbude.exercise.domain.Customer;
import com.krisbude.exercise.endpoint.resources.CustomerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomersEndpoint {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomersEndpoint(CustomerRepository customerRepository ) {
        this.customerRepository =  customerRepository;
    }

    @PutMapping("/customers")
    public CustomerResource updateCustomer(@RequestBody CustomerResource customer) {
        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
        if (existingCustomer == null) {
            return null;
        }
        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setLastName(customer.getLastName());
        existingCustomer.setMiddleName(customer.getMiddleName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhoneNumber(customer.getPhoneNumber());
        existingCustomer.setBirthDate(customer.getBirthDate());

        return CustomerResource.from(customerRepository.save(existingCustomer));
    }
}
