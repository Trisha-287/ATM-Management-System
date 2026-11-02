package atm.management.system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Account {
    String name;
    int pin;
    double balance;

    ArrayList<String> transactions = new ArrayList<>();

    // Constructor
    Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
    // Date and time
    public String getDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return now.format(formatter);
    }
    // Check balance
    public void checkBalance() {
        System.out.println("Balance amount is: " + balance);

        transactions.add("Available balance: " + balance
                + " | Date & Time: " + getDateTime());
    }

    // Deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be greater than 0");
        }
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("Updated balance: " + balance);

        transactions.add("Deposit: ₹" + amount
                + " | Date & Time: " + getDateTime());
    }// complete withdrwal
    public void completeWithdrawalAmount(int amount) {
        checkWithdrawal(amount);
        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Withdrawn amount: ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);

        transactions.add("Withdrawal: ₹" + amount
                + " | Date & Time: " + getDateTime());
    }
    // Check withdrawal
    public void checkWithdrawal(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("withdrawal amount must be greater then 0");
        }
        if (amount % 100 != 0) {
            throw new IllegalArgumentException("withdrawal amount must be  a multiple of 100");
        }
        if (amount > balance) {
            throw new ArithmeticException("insufficient  account balance");
        }
    }
    //change pin
    public void changePin(int currentPin, int newPin) {
        if (currentPin != pin) {
            System.out.println("Incorrect PIN");
            return;
        }
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must contain exactly 4 digits");
            return;
        }
        pin = newPin;
        System.out.println("PIN changed successfully!");
        transactions.add("PIN successfully changed"
                + " | Date & Time: " + getDateTime());
    }

    //transactionhistory
    public void showTransactions() {
        System.out.println("Transaction History");

        if (transactions.isEmpty()) {
            System.out.println("No transactions found");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    //fund transfer
    public void fundTransfer(long accountNumber, double amount) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException(
                    "Invalid account number");
        }

        if (amount <= 0 || amount != Math.floor(amount)) {
            throw new IllegalArgumentException(
                    "Transfer amount must be a positive whole number");
        }

        if (amount > balance) {
            throw new ArithmeticException(
                    "Insufficient balance");
        }

        balance = balance - amount;

        transactions.add("Transferred ₹" + amount
                + " to account " + accountNumber
                + " | Date & Time: " + getDateTime());

        System.out.println("Fund transfer successful!");
        System.out.println("Remaining balance: ₹" + balance);
        System.out.println("Transferred amount: ₹" + amount);
    }
}
