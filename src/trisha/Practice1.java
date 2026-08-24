package trisha;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a= sc.nextInt();
        if(a/5==1){
            System.out.println("number is divible by 5");}
        else{
            System.out.println("number is not divisible by 5");
        }
    }
}
