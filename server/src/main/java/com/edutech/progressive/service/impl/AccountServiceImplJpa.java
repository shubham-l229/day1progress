package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.repository.AccountRepository;
@Service
public class AccountServiceImplJpa {
    // @Autowired
    private AccountRepository accRepo;

    public AccountServiceImplJpa(AccountRepository accRepo) {
        this.accRepo = accRepo;
    }

    public List<Accounts> getAllAccounts(){
        return accRepo.findAll();
    }

    public int addAccount(Accounts accounts){
        return accRepo.save(accounts).getAccountId();
    }

    public void updateAccount(Accounts accounts){
        accRepo.save(accounts);
    }

    public void deleteAccount(int accountId){
        accRepo.deleteById(accountId);
    }

    public List<Accounts> getAllAccountsSortedByBalance(){
        List<Accounts> list = accRepo.findAll();
        list.sort(Accounts::compareTo);
        return list;
    }

   

    
}
