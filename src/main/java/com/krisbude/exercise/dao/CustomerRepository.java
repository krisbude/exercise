package com.krisbude.exercise.dao;

import com.krisbude.exercise.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
}
