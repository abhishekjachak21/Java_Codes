package com.example.repo;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import com.example.beans.Account;
import com.example.beans.Transaction;
import com.example.util.TransactionType;


public class BankRepositary implements BankRepoOps{
	
	List<Account> accounts;
	
	public BankRepositary(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	 public static long getRandomLong() {
		 return ThreadLocalRandom.current().nextLong();
	 }

	   public void credit(Account account, double amount) {
		   account.setBalance(account.getBalance()+amount);
		   account.getTransactions().add(new Transaction(getRandomLong(), LocalDate.now(), amount, account.getBalance()+amount, TransactionType.CREDIT));
	   }
	   
	   public void debit(Account account, double amount) {
		   account.setBalance(account.getBalance()-amount);
		   account.getTransactions().add(new Transaction(getRandomLong(), LocalDate.now(), amount, account.getBalance()-amount, TransactionType.DEBIT));
	   }
	   
	   public Account getAccountById(String accountId) {
		  if(this.accounts.stream().anyMatch(a->a.getAccountId().equals(accountId)))
	    	 return this.accounts.stream().filter(a->a.getAccountId().equals(accountId)).collect(Collectors.toList()).get(0);
		  else 
			  return null;
	   }
	   
	   public void addAccount(Account account) {
		   this.accounts.add(account);
	   }
	
}
