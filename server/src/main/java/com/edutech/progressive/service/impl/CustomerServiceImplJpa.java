package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.dao.CustomerDAO;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.repository.CustomerRepository;
import com.edutech.progressive.service.CustomerService;
@Service
public class CustomerServiceImplJpa {
    
    // @Autowired
    private CustomerRepository custRepo;

    public CustomerServiceImplJpa(CustomerRepository custRepo) {
        this.custRepo = custRepo;
    }

    public List<Customers>  getAllCustomers(){
        return custRepo.findAll();
    }

    public Customers getCustomerById(int customerId){
        return custRepo.findByCustomerId(customerId);
    }

    public int addCustomer(Customers customers){
        return custRepo.save(customers).getCustomerId();
    }

    public void updateCustomer(Customers customers){
        custRepo.save(customers);
    }

    public void deleteCustomer(int customerId){
        custRepo.deleteByCustomerId(customerId);
    }

    public List<Customers> getAllCustomersSortedByName(){
       List<Customers> list = custRepo.findAll();
       list.sort(Customers::compareTo);
       return list;
    }
    
}
