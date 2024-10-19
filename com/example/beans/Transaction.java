package com.example.beans;
import java.time.*;
import com.example.util.TransactionType;

public class Transaction {
       private long transactionID;
       private LocalDate transactionDate ;
       private double transactionAmount;
       private  double balance;
       private TransactionType transactionType;
       
       
       
	public Transaction(long transactionID, LocalDate transactionDate, double transactionAmount, double balance,
			TransactionType transactionType) {
		super();
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.balance = balance;
		this.transactionType = transactionType;
	}
	
	public long getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
       
       
}
