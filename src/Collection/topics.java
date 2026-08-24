package Collection;

import java.util.Scanner;

public class topics {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        //reverse number
       /*int rev=0;
       while(num!=0){
        rev=rev*10+num%10;
        num=num/10;
       }
        System.out.println(rev);*/
        //count digit number
       /* int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count);*/
        //factorial
       /* int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);*/
        //fibonacci series
        /*int a=0;int b=1;
        for(int i=1;i<=num;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }*/
        //armstrong number
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
    }
}
