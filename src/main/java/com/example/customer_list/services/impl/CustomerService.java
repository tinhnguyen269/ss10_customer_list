package com.example.customer_list.services.impl;

import com.example.customer_list.models.Customer;
import com.example.customer_list.responsitories.ICustomerReponsitory;
import com.example.customer_list.responsitories.impl.CustomerReponsitory;
import com.example.customer_list.services.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    public static ICustomerReponsitory customerReponsitory = new CustomerReponsitory();
    @Override
    public List<Customer> findAll() {
        return customerReponsitory.findAll();
    }
}
