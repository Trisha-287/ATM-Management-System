package practice.session;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("enter year:");
            int year = sc.nextInt();
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        } catch (InputMismatchException e) {
            System.out.println("please choose only years");
        }
        sc.close();
    }

}
