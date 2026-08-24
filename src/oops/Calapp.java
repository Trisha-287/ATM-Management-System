package oops;

import java.util.Scanner;

public class Calapp {
    public int add(int a,int b){
      //  System.out.println("addition:"+(a+b));

        return a+b;
    }
    public void sub(int a,int b){
        System.out.println("substraction:"+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("multiplication:"+(a*b));
    }
    public void div(int a,int b){
        System.out.println("division:"+(a/b));
    }
    public void mod(int a,int b){
        System.out.println("modules:"+(a%b));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.mul");
        System.out.println("4.div");
        System.out.println("5.module");
        System.out.println(" choice operation:");
        int choice=sc.nextInt();
        Calapp cl=new Calapp();
        if(choice==1) {
            cl.add(a, b);
        }
        else if(choice==2){
               cl.sub(a,b);
            }
        else if(choice==3){
            cl.mul(a,b);
        }
        else if(choice==4){
            cl.div(a,b);
        }
        else if(choice==5){
            cl.mod(a,b);
        }
        else{
            System.out.println("invalid choice");
        }
        sc.close();
    }
}

