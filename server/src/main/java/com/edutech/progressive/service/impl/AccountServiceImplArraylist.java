package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.service.AccountService;

public class AccountServiceImplArraylist implements AccountService{ 
    private static List<Accounts> accountsList = new ArrayList<>();
    public List<Accounts> getAllAccounts()throws SQLException{
        return accountsList;
    }
    public int addAccount(Accounts accounts) throws SQLException{
        accountsList.add(accounts);
        return accountsList.size();
    }
    public List<Accounts> getAllAccountsSortedByBalance()throws SQLException{
        List<Accounts> sortedList = new ArrayList<>(accountsList);
        Collections.sort(sortedList);
        return sortedList;
    }
    public void emptyArrayList(){
        // accountsList = new ArrayList<>();
        accountsList.clear();
    }
}