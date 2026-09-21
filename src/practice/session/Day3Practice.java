package practice.session;

import conditionalstmt.CalUsingSwitch;

import java.util.Scanner;

public class Day3Practice {
    public static int add ( int a, int b){
        return a + b;
    }
    public static int mul ( int a, int b){
        return a * b;
    }
    public static int sub ( int a, int b){
        return a - b;
    }
    public static int div ( int a, int b) {
        return a / b;
    }
    public static void main (String[] args){
        CalUsingSwitch c=new CalUsingSwitch();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int choice= sc.nextInt();
        int n=2;
        int n1=3;

        switch(choice){
            case 1:
                System.out.println(add(n,n1));
                break;
            case 2:
                System.out.println(sub(n,n1));
                break;
            case 3:
                System.out.println(mul(n,n1));
                break;
            case 4:
                System.out.println(div(n,n1));
                break;
            default:
                System.out.println("invalid choice");
        }

    }
}
