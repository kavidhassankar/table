package com.demospringjoin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospringjoin.entity.Customer;
import com.demospringjoin.repository.CusRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CusRepository cusrepository;

	public void createcus(Customer customer) {
		
		cusrepository.save(customer);
		
	
		
	}
	

}
