package com.example.customer_list.responsitories;

import com.example.customer_list.models.Customer;

import java.util.List;

public interface ICustomerReponsitory {
    List<Customer> findAll();
}
