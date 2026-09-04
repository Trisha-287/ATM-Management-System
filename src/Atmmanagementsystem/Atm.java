package Atmmanagementsystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
    }

    //checkbalance
    public void checkBalance() {
        System.out.println("balance amount is:" + balance);
        transactions.add("availabla balance:" + balance);
    }

    //deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater then 0");
        }
        balance += amount;
        System.out.println("deposit successful");
        System.out.println("updated balance:" + amount);
    }

    //withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater then 0");
        }
        if (amount > balance) {
            throw new ArithmeticException("insufficient balance");
        }
        balance -= amount;
        System.out.println("withdraw successful");
        System.out.println("remaining balance:" + balance);
        transactions.add("cash withdrawal" + amount);
    }//change pin

    public void changePin(int currentPin, int newPin) {
        if (currentPin != pin) {
            System.out.println("incorrect pin");
            return;
        }
        pin = newPin;
        System.out.println("pin changed successfully!");
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
        if (amount > balance) {
            throw new ArithmeticException("insufficient balance");
        }
        balance = balance - amount;
        transactions.add("transferred" + amount + "to account" + accountNumber);
        System.out.println("fund transfer succesful!");
        System.out.println("remaining balance:" + balance);
    }
}
public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //object creation using constructor
        Account account = new Account("siva", 1234, 3000);
        System.out.println("atm banking system");
        //pin login
        try {
            System.out.print("enter your account pin:");
            int userPin = sc.nextInt();
            if (userPin != account.pin) {
                System.out.println("incorrect pin");
                return;
            }
            System.out.println("login successful");
            //atm menu
            while (true) {
                System.out.println("1.check balance");
                System.out.println("2.withdraw");
                System.out.println("3.deposit");
                System.out.println("4.change pin");
                System.out.println("5.transaction");
                System.out.println("6.fund transfer");
                System.out.println("7.exit");
                System.out.println("enter your choice:");
                try {
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            account.checkBalance();
                            break;
                        case 2:
                            try {
                                System.out.print("enter withdraw amount");
                                double amount = sc.nextDouble();
                                account.withdraw(amount);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            try {
                                System.out.print("enter deposit amount");
                                double amount = sc.nextDouble();
                                account.deposit(amount);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 4:
                            try {
                                System.out.print("enter cuurent pin");
                                int currentPin = sc.nextInt();
                                System.out.print("enter new pin");
                                int newPin = sc.nextInt();
                                account.changePin(currentPin, newPin);
                            } catch (InputMismatchException e) {
                                System.out.println("invalid pin,enter number only");
                                sc.nextLine();
                            }
                            break;
                        case 5:
                            account.showTransactions();
                            break;
                        case 6:
                            try {
                                System.out.print("enter receiver account number");
                                long accountNumber = sc.nextLong();
                                System.out.print("enter transfer amount");
                                double amount = sc.nextDouble();
                                account.fundTransfer(accountNumber, amount);
                            } catch (InputMismatchException e) {
                                System.out.println("please enter valid input");
                                sc.nextLine();
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 7:
                            System.out.println("thank you");
                            System.out.println("logged out succesfully");
                            return;
                        default:
                            System.out.println("invalid choice please select 1 to 7");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("invalid input please enter number only");
                    sc.nextLine();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("invalid pin please enter number only");
        }
        sc.close();
    }
}

