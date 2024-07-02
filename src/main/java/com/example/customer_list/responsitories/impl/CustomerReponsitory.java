package com.example.customer_list.responsitories.impl;

import com.example.customer_list.models.Customer;
import com.example.customer_list.responsitories.ICustomerReponsitory;

import java.util.ArrayList;
import java.util.List;

public class CustomerReponsitory implements ICustomerReponsitory {
    private static List<Customer> customers ;

    static {
    customers = new ArrayList<>();
    customers.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà nội","src/imageCustomers/pexels-3motional-studio-407102-1081685.jpg"));
    customers.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","src/imageCustomers/pikachu.png"));
    customers.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","src/imageCustomers/unnamed.jpg"));
    customers.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","src/imageCustomers/✰Tanjiro kumado.jpg"));
    customers.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","src/imageCustomers/434297656_742502578028155_3436343806776691725_n.jpg"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
