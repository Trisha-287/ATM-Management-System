package Atmmanagementsystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int pin = 123;
        double balance = 3000;
        ArrayList<String>transactions=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter your account pin number:");
            int user_pin = sc.nextInt();
            if (user_pin != pin) {
                System.out.println("incorrect pin");
                return;
            }
            System.out.println("login successfull!");
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
                            System.out.println("balance amount is:" + balance);
                            transactions.add("availabla balance:"+balance);
                            break;
                        case 2:
                            try {
                                System.out.print("enter withdrawal amount:");
                                double amount = sc.nextDouble();
                                if (amount <= 0) {
                                    System.out.println("amount must be grather then 0");
                                } else if (amount > balance) {
                                    System.out.println("insufficient balance");
                                } else {
                                    balance = balance - amount;
                                    System.out.println("withdraw successful");
                                    System.out.println("remaining balance:" + balance);
                                }
                                transactions.add("cash withdrawal:"+amount);
                            } catch (InputMismatchException e) {
                                System.out.println("invalid input! plese enter number only");
                                sc.nextLine();
                            }
                            break;
                        case 3:
                            try {
                                System.out.print("enter deposit amount:");
                                double amount = sc.nextDouble();
                                if (amount <= 0) {
                                    System.out.println("amount must be grather then 0");
                                } else {
                                    balance = balance + amount;
                                    System.out.println("deposit succesful");
                                    System.out.println("updated balance=" + balance);
                                }
                                transactions.add("cash deposit:"+amount);
                            } catch (InputMismatchException e) {
                                System.out.println("invalid input! plese enter number only");
                                sc.nextLine();
                            }
                            break;
                        case 4:
                            try {
                                System.out.println("enter current pin number:");
                                int current_pin = sc.nextInt();
                                if (current_pin == pin) {
                                    System.out.println("enter new pin number:");
                                    int new_pin = sc.nextInt();
                                    if (new_pin >= 1006 && new_pin <= 5008) {
                                        pin = new_pin;
                                        System.out.println("pin changed successfully!");
                                    } else {
                                        System.out.println("pin must contains exactly 4 digits");
                                    }
                                } else {
                                    System.out.println("incorrect pin number");
                                }
                                transactions.add("pin sucessfully changed");
                            } catch (InputMismatchException e) {
                                System.out.println("invalid pin! please enter number only");
                                sc.nextLine();
                            }
                            break;
                        case 5:
                            System.out.println("tansaction history");
                            if(transactions.isEmpty()){
                                System.out.println("no transaction found");
                            }
                            else{
                                for(String transaction:transactions){
                                    System.out.println(transaction);
                                }
                            }
                            break;
                        case 6:
                            System.out.println("fund transfer");
                            try {
                                System.out.println("enter receiver account number");
                                long accnumber = sc.nextLong();
                                System.out.println("enter transfer amount");
                                double transfer = sc.nextDouble();
                                if (transfer <= 0) {
                                    throw new IllegalArgumentException("Amount must be greater then 0");
                                }
                                if (transfer > balance) {
                                    throw new ArithmeticException("insufficient balance");
                                }
                                balance = balance - transfer;
                                transactions.add("transferred" + transfer
                                        + "to account" + accnumber);
                                System.out.println("fund transfer succesful!");
                                System.out.println("remaining balance:" + balance);
                            }catch (InputMismatchException e){
                                System.out.println("please enter valid input");
                            }
                            catch (IllegalArgumentException e){
                                System.out.println(e.getMessage());
                            }
                            catch (ArithmeticException e){
                                System.out.println(e.getMessage());
                            }
                            break;

                        case 7:
                            System.out.println("thank you");
                            return;
                        default:
                            System.out.println("invalid choice!please select 1 to 5");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("invalid input! plese enter number only");
                    sc.nextLine();
                }
            }
            }
        catch(InputMismatchException e){
                System.out.println("invalid pin! plese enter number only");
                sc.nextLine();
            }
            sc.close();
    }
}
