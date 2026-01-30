package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Customers;

public class CustomerServiceImplArraylist {
    public List<Customers> getAllCustomers()throws SQLException{
        return new ArrayList<>();
    }
    public int addCustomer(Customers customers) throws SQLException{
        return -1;
    }
    public List<Customers> getAllCustomersSortedByName()throws SQLException{
        return new ArrayList<>();
    }
    public void emptyArrayList(){
        
    }
}