package com.example.customer_list.controllers;

import com.example.customer_list.models.Customer;
import com.example.customer_list.services.ICustomerService;
import com.example.customer_list.services.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="CustomerController",value = "/customer")
public class CustomerController extends HttpServlet {
private static final ICustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = customerService.findAll();
        req.setAttribute("customers",customers);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
