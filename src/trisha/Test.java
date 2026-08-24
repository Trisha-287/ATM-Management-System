package trisha;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int startingnumber=scanner.nextInt();
        System.out.println(" enter second number");
        int endingnumber=scanner.nextInt();
        int sum=0;
        for(int i=startingnumber;i<endingnumber;i++){
            if(i%2==0)
           sum=sum+i;
        }
        System.out.println(sum);
        scanner.close();


    }
}
