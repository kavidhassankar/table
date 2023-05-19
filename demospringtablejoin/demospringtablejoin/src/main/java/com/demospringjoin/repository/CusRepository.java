package com.demospringjoin.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.demospringjoin.entity.Customer;

public interface CusRepository extends CrudRepository<Customer, UUID> {

}
