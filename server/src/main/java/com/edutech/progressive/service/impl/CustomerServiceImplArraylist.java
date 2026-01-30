package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.CustomerService;

public class CustomerServiceImplArraylist implements CustomerService{ 
    private static final List<Customers> customersList = new ArrayList<>();
    public List<Customers> getAllCustomers()throws SQLException{
        return customersList;
    }
    public int addCustomer(Customers customers) throws SQLException{
        customersList.add(customers);
        return customersList.size();
    }
    public List<Customers> getAllCustomersSortedByName()throws SQLException{
        // List<Customers> sortedList = new ArrayList<>(customersList);
        Collections.sort(customersList);
        return customersList;
    }
    public void emptyArrayList(){
        // customersList = new ArrayList<>();
        customersList.clear();
    }
}