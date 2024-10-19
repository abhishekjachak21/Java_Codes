package com.example.service;

import com.example.exception.AccountNotFoundException;
import com.example.exception.InsufficientBalanceException;


public interface BankService {
	
	public void withdraw(String accountId, double amount) throws AccountNotFoundException, InsufficientBalanceException ;
	
	public void deposit(String accountId, double amount) throws AccountNotFoundException, InsufficientBalanceException ;
	
	public void createAccount(String firstName, String lastName, String street, String city, String country, double initialBalance);
	
}
