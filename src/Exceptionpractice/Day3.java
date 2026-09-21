package Exceptionpractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter numbers");
        try {
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        }
        catch (InputMismatchException e){
            System.out.println("please enter integer number only");
            sc.next();
        }
        System.out.println("enter index");
        int index=sc.nextInt();
        try{
            System.out.println("array value:" + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of index");
        }
        catch (InputMismatchException e){
            System.out.println("please enter an integer");
        }
        sc.close();
    }
}
