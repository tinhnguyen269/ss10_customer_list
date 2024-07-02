package com.example.customer_list.services;

import com.example.customer_list.models.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
