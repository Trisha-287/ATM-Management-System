package trisha;

import java.util.Scanner;

public class Operation {
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int mul(int num1,int num2){
        return num1*num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int div(int num1,int num2){
        return num1/num2;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number is:");
        int num1=scanner.nextInt();
        System.out.println("enter second number is:");
        int num2=scanner.nextInt();
        System.out.println("1.addition");
        System.out.println("2.multiplication");
        System.out.println("3.substraction");
        System.out.println("4.division");
        System.out.println("enter your choice");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                add(num1,num2);
                System.out.println("add the number is:"+(num1+num2));
                break;
            case 2:
                mul(num1,num2);
                System.out.println("add the number is:"+(num1*num2));
                break;
            case 3:
                sub(num1,num2);
                System.out.println("sub the number is:" +(num1-num2));
                break;
            case 4:
                div(num1,num2);
                System.out.println("div the number is:"+(num1/num2));
                break;
            default:
                System.out.println("invalid choice");
            }

        }
    }
