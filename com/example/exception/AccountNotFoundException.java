package com.example.exception;

public class AccountNotFoundException extends Exception{
  
    private String message;
	
	public AccountNotFoundException(String message) {
		this.message = message;
	}

    public String getMessage() {
    	return this.message;
    }
    
}
