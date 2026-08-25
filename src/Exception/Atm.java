package Exception;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        int pin=123;

        int balance=2000;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your account pin number:");
        int user_pin=sc.nextInt();
        if(user_pin==pin) {
            System.out.println("login successfull!");
            while (true) {
                System.out.println("1.check balance");
                System.out.println("2.withdraw");
                System.out.println("3.deposit");
                System.out.println("4.change pin");
                System.out.println("5.exit");
                System.out.println("enter your choice:");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("balance amount is:" + balance);
                } else if (choice == 2) {
                    System.out.print("enter amount:");
                    int amount = sc.nextInt();
                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("withdraw successful");
                        System.out.println("balance=" + balance);
                    } else {
                        System.out.println("insufficent balance");
                    }
                } else if (choice == 3) {
                    System.out.print("enter amount:");
                    int amount = sc.nextInt();
                    balance = balance + amount;
                    System.out.println("deposit succesful");
                    System.out.println("balance=" + balance);
                }
                else if(choice==4){
                    System.out.println("enter current pin number:");
                    int current_pin= sc.nextInt();
                    if(current_pin==pin){
                        System.out.println("enter new pin number:");
                        int new_pin= sc.nextInt();
                        if(new_pin>=100&&new_pin<=500){
                            System.out.println("confirm new pin:");
                            int con_pin= sc.nextInt();
                            if(new_pin==con_pin){
                                pin=new_pin;
                                System.out.println("pin changed");
                            } else{
                                System.out.println("pin is not changed");
                            }
                        }
                        else{
                            System.out.println("pin must contains 4 digits");
                        }
                    }
                    else{
                        System.out.println("incorrect pin number");
                    }
                }
                else if (choice == 5) {
                    System.out.println("thank you");
                    break;
                } else {
                    System.out.println("invalid choice");
                }
            }
        }
        else{
            System.out.println("invali pin please check once");
        }
        sc.close();
    }
}
