package trisha;

import java.util.Scanner;

import static trisha.Atm.pin1;

public class Atm1{
    static Scanner scanner=new Scanner(System.in);
    static int pin=1111;
    static int account=123456;
    static int withdraw=0;
    static int balance=500;
    public static void main(String[]args) {
        System.out.println("******atm transaction***");
        if (login()) {
            while (true) {
                System.out.println("1.check balance");
                System.out.println("2.deposit");
                System.out.println("3.withdraw");
                System.out.println("4.transactionhistory");
                System.out.println("5.exit");
                System.out.print("enter choice:");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        checkbalance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        transactionhistory();
                        break;
                    default:
                        System.out.println("invalid account number or pin number");
                        System.out.println("login failed");
                }
            }
        }
    }
    public static void checkbalance(){
        System.out.println("enter balance amount is:"+balance);
    }
    public static void deposit(){
        System.out.println("enter the deposit amount");
        int amount=scanner.nextInt();
        balance=balance+amount;
        System.out.println("enter total money:"+balance);
        System.out.println("updated successfully");
    }
    public static void withdraw(){
        System.out.println("enter withdraw amount is:");
        int withdraw=scanner.nextInt();
        if(withdraw<=balance) {
            System.out.println("sucesfully completed withdraw money");
            System.out.println("updated money"+balance);
        }
        else{
            System.out.println("not completed withdraw money");
        }
    }
    public static void transactionhistory(){
        System.out.println("enter transaction history is:");
        System.out.println("today withdraw money"+balance);
        System.out.println("current balance "+balance);
    }
    public static boolean login() {
        System.out.print("enter account number:");
        int acc = scanner.nextInt();
        System.out.print("enter pin number");
        int pin1 = scanner.nextInt();
        if (acc == account && pin1 == pin) {
            System.out.println("login success fully");
            return true;
        } else {
            System.out.println("login filed check once");
            return false;
        }
    }
}
