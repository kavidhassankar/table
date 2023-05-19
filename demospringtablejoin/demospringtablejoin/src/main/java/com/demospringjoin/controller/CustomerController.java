package com.demospringjoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demospringjoin.entity.Customer;
import com.demospringjoin.service.CustomerService;

@RestController
@RequestMapping("/send")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;

	@PostMapping("/customercontroll")
	public Customer createCustomer(@RequestBody Customer customer) {

		customerservice.createcus(customer);

		return customer;

	}

}
