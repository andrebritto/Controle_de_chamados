package com.grokonez.springrest.postgresql.controller

import com.grokonez.springrest.postgresql.model.Customer
import com.grokonez.springrest.postgresql.repo.CustomerRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = arrayOf("*"))
@RestController
@RequestMapping("/api")
class CustomerController {
	@Autowired
	lateinit var repository: CustomerRepository

	private val LOGGER = LoggerFactory.getLogger(this.javaClass)

	@GetMapping("/customers")
	fun findAll(): MutableIterable<Customer> {
		var ret:MutableIterable<Customer> = repository.findAll();
		LOGGER.info("listando...");

		return ret
	}
	
	@PostMapping("/customers/create")
	fun postCustomer(@RequestBody customer: Customer): Customer{
		LOGGER.info("Gravando...");
		LOGGER.info("${customer.name}, ${customer.age}");
		return repository.save( Customer(customer.name, customer.age));
	}
	
	@DeleteMapping("/customers/{id}")
	fun deleteCustomer(@PathVariable("id") id: Long): ResponseEntity<String>{
		println("Delete Customer with ID = " + id + "...");
		repository.deleteById(id);
		return ResponseEntity("Customer has been deleted!", HttpStatus.OK);
	}
	
	@DeleteMapping("/customers/delete")
	fun deleteAllCustomers(): ResponseEntity<String>{
		println("Delete All Customers...");
		repository.deleteAll();
		return ResponseEntity("All customers have been deleted!", HttpStatus.OK);
	}
	
	@GetMapping("customers/age/{age}")
	fun findByAge(@PathVariable age: Int) = repository.findByAge(age);
 
	@PutMapping("/customers/{id}")
	fun updateCustomer(@PathVariable("id") id: Long, @RequestBody customer: Customer):  ResponseEntity<Customer> {
		println("Update Customer with ID = " + id + "...");
 
		var customerData = repository.findById(id);
 
		if (customerData.isPresent()) {
			var _customer = customerData.get();
			_customer.name = customer.name;
			_customer.age = customer.age;
			_customer.active = customer.active;
			return ResponseEntity(repository.save(_customer), HttpStatus.OK);
		} else {
			return ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}
}