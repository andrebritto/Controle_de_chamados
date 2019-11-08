package com.grokonez.springrest.postgresql.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grokonez.springrest.postgresql.model.Customer;

@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {
	fun findByAge(age: Int): Iterable<Customer>
}
