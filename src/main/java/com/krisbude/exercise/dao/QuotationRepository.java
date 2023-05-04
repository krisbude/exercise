package com.krisbude.exercise.dao;


import com.krisbude.exercise.domain.Quotation;
import org.springframework.data.repository.CrudRepository;

public interface QuotationRepository extends CrudRepository<Quotation, String> {


}
