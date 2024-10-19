package com.example.HW;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


 class Account {
    private String accountId;
    private double balance;

    public Account(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public void transfer(Account targetAccount, double amount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }
}


public class SimpleBankApp {
    
    private Map<String, Account> accounts = new HashMap<>();

    public SimpleBankApp() { 
        initializeAccounts();
    }

    private void initializeAccounts() {
        for (int i = 1; i <= 10; i++) {
            accounts.put("ACC" + i, new Account("ACC" + i));
        }
    }

    public Account getAccount(String accountId) {
        Account account = accounts.get(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Invalid account ID.");
        }
        return account;
    }

    public static void main(String[] args) {
        SimpleBankApp bankApp = new SimpleBankApp();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Enter account ID (ACC1 to ACC10) or 'exit' to quit:");
                String accountId = scanner.nextLine();

                if (accountId.equalsIgnoreCase("exit")) {
                    break;
                }

                Account account = bankApp.getAccount(accountId);
                System.out.println("Current balance: " + account.getBalance());

                System.out.println("Choose an action: (1) Deposit (2) Withdraw (3) Transfer");
                int action = Integer.parseInt(scanner.nextLine());

                switch (action) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter target account ID: ");
                        String targetAccountId = scanner.nextLine();
                        Account targetAccount = bankApp.getAccount(targetAccountId);
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = Double.parseDouble(scanner.nextLine());
                        account.transfer(targetAccount, transferAmount);
                        break;
                    default:
                        System.out.println("Invalid action.");
                }

                System.out.println("Updated balance: " + account.getBalance());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
