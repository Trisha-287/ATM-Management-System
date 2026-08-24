package trisha;

import java.util.Scanner;

public class Atm {
    static Scanner sc = new Scanner(System.in);
    static String acc1 = "123456";
    static int pin1 = 1111;
    static String acc2 = "654321";
    static int pin2 = 2222;
    static int balance=5000;
    static int dailyLimit = 10000;
    static int withdrawnToday = 0;
    public static void main(String[] args) {
        System.out.println("****** ATM Transaction ******");
        if (login()) {
            while (true) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        transactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using ATM");
                        return;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } else {
            System.out.println("Login Failed");
        }
    }
    public static boolean login() {
        System.out.print("Enter Account Number: ");
        String acc = sc.next();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        if ((acc.equals(acc1) && pin == pin1) || (acc.equals(acc2) && pin == pin2)) {
            System.out.println("Login Successful");
            return true;
        }
        return false;
    }
    public static void checkBalance() {
        System.out.println("Current Balance is : " + balance);
    }
    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (amount <= balance && withdrawnToday + amount <= dailyLimit) {
            balance = balance - amount;
            withdrawnToday += amount;
            System.out.println("Withdraw Successful");
            System.out.println("Remaining Balance : " + balance);
        } else {

            System.out.println("Insufficient Balance or Daily Limit Exceeded");
        }
    }
    public static void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Deposit Successful");
        System.out.println("Updated Balance : " + balance);
    }
    public static void transactionHistory() {
        System.out.println("Today's Withdraw Amount : " + withdrawnToday);
        System.out.println("Current Balance : " + balance);
    }
}