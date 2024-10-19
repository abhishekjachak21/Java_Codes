package com.example.beans;

import java.util.*;

public class Account {
    private String accountId;
    private double balance;
    private Customer customer;
    private List<Transaction>transactions;
    
    
	public Account(String accountId, double balance, Customer customer, List<Transaction> transactions) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.customer = customer;
		this.transactions = transactions;
	}


	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<Transaction> getTransactions() {
		return transactions;
	}


	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
