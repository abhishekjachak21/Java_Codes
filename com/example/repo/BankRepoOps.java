package com.example.repo;

import com.example.beans.Account;

public interface BankRepoOps {
   public void credit(Account account, double amount);
   public void debit(Account account, double amount);
   public Account getAccountById(String accountId) ;
   public void addAccount(Account account);

}
