package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.beans.Account;
import com.example.exception.AccountNotFoundException;
import com.example.exception.InsufficientBalanceException;
import com.example.repo.BankRepoOps;
import com.example.repo.BankRepositary;
import com.example.util.BankUtils;

public class BankServiceImpl implements BankService {
     
	BankRepoOps repo;
	
	public BankServiceImpl(){
	 List<Account> accounts = new ArrayList<Account>();
	 repo = new BankRepositary(accounts);
	}
	
     
	public void withdraw(String accountId, double amount) throws AccountNotFoundException, InsufficientBalanceException {
		Account account = repo.getAccountById(accountId);
		if(account ==  null) {
			throw new AccountNotFoundException("acc does not exsit");
		}
		if(account.getBalance() - amount < BankUtils.MIN_BALANCE)
			throw new InsufficientBalanceException("this min bal shud be " + BankUtils.MIN_BALANCE);
		repo.debit(account, amount);		
		
	}
	
	public void deposit(String accountId, double amount) throws AccountNotFoundException, InsufficientBalanceException {
		Account account = repo.getAccountById(accountId);
		if(account ==  null) {
			throw new AccountNotFoundException("acc does not exsit");
		}
		
		repo.credit(account, amount);
	}
	

	@Override
	public void createAccount(String firstName, String lastName, String street, String city, String country,
			double initialBalance) {
		
		
		
	}
}