package atm.management.system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Account {
    String name;
    int pin;
    double balance;
    ArrayList<String> transactions = new ArrayList<>();
    //constructor
    Account(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }//date and time
    public String getDateTime(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        return now.format(formatter);
    }
    //checkbalance
    public void checkBalance() {
        System.out.println("balance amount is:" + balance);
        transactions.add("availabla balance:" + balance
                 +"|Date & Time:"+getDateTime());
    }//deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater then 0");
        }
        balance += amount;
        System.out.println("deposit successful");
        System.out.println("deposited Amount:" + amount);
        System.out.println("updated balance:" + balance);
        transactions.add("cash deposited:"+amount
                 +"|Date & Time:"+getDateTime());
    }//check withdrawal
    public void CheckWithdrawal(int amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("withdrawal amount must be greater then 0");
        }
        if(amount %100!=0){
            throw new IllegalArgumentException("withdrawal amount must be  a multiple of 100");
        }
        if (amount > balance) {
            throw new ArithmeticException("insufficient  account balance");
        }
    }
    //complete withdraw
    public void completeWithdrawalAmount(int amount){
        balance -= amount;
        System.out.println("withdraw successful");
        System.out.println("remaining balance:" + balance);
        System.out.println("withdraw Amount:" + amount);
        transactions.add("cash withdrawal" + amount
                      +"|Date & Time:"+getDateTime());
    }//change pin
    public void changePin(int currentPin, int newPin) {
        if (currentPin != pin) {
            System.out.println("incorrect pin");
            return;
        }
        pin = newPin;
        System.out.println("pin changed successfully!"
        +"|Date & Time:"+getDateTime());
        transactions.add("pin sucessfully changed");
    }
    //transactionhistory
    public void showTransactions() {
        System.out.println("tansaction history");
        if (transactions.isEmpty()) {
            System.out.println("no transaction found");
        } else {
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }//fund transfer
    public void fundTransfer(long accountNumber, double amount) {
        if(accountNumber<=0){
            throw new IllegalArgumentException("invalid account");
        }
        if(amount<=0){
            throw new IllegalArgumentException("transfer amount must be greater then 0");
        }
        if (amount > balance) {
            throw new ArithmeticException("insufficient balance");
        }
        balance = balance - amount;
        transactions.add("transferred"+amount+"to account"+ accountNumber+"|Date & Time:"+getDateTime());
        System.out.println("fund transfer succesful!");
        System.out.println("remaining balance:" + balance);
        System.out.println("transferred amount:" + amount);
    }
}
