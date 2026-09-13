package atm.management.system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //object creation using constructor
        Account account = new Account("siva", 1234, 3000);
        CashManager cashManager=new CashManager();
        System.out.println("atm banking system");
        //pin login
        int attempts=0;
        boolean login=false;
        while (attempts<=3){
            try {
                System.out.println("enter your account pin");
                int user_pin = sc.nextInt();
                if (user_pin == account.pin) {
                    login = true;
                    System.out.println("login successful");
                    break;
                } else {
                    attempts++;
                    System.out.println("incorrect pin");
                    System.out.println("attempts remaining:" + (3 - attempts));
                }
            } catch (InputMismatchException e) {
                System.out.println("invalid pin enter number only");
                sc.nextLine();
                attempts++;
                System.out.println("after remainig:" + (3 - attempts));
            }
        }if(!login) {
            System.out.println("account blocked due to 3 wrong attempts");
            sc.close();
            return;
        }//atm menu
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
                                System.out.print("enter withdraw amount:");
                                double amount = sc.nextDouble();
                                if(amount!=(int)amount){
                                    throw new IllegalArgumentException("please enter a whole number");
                                }
                                int withdrawAmount=(int)amount;
                                //first check account balance
                                account.checkwithdraw(withdrawAmount);
                                //then dispense atm cash
                                boolean successful= cashManager.withdraw(withdrawAmount);
                                //dispensed cash
                                if(successful){
                                    account.completeWithdrawalAmount(withdrawAmount);
                                }
                            }
                            catch (InputMismatchException e){
                                System.out.println("invalid input.enter number only");
                                sc.nextLine();
                            }
                            catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            try {
                                System.out.println("*********enter deposit amount***********");
                                System.out.println("enter 500 notes:");
                                int notes500= sc.nextInt();
                                System.out.println("enter 200 notes:");
                                int notes200= sc.nextInt();
                                System.out.println("enter 100 notes:");
                                int notes100= sc.nextInt();
                                //calculate total amount
                                double amount=(notes500*500)+(notes200*200)+(notes100*100);
                                //add notes to atm
                                boolean successful=cashManager.depositCash(notes500,notes200,notes100);
                                //add amount to account
                                if(successful){
                                    account.deposit(amount);
                                }
                            }catch (InputMismatchException e){
                                System.out.println("invalid input enter numbers only.");
                                sc.nextLine();
                            }
                            catch (IllegalArgumentException e) {
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
        }

    }


