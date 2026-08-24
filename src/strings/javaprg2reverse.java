package strings;

import java.util.Scanner;

public class javaprg2reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        /*int num=sc.nextInt();
        //1.uisng alogorithm
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;//0+1233%10=4  40+3=43 430+2=432  4320+1=4321
            num=num/10;//1234/10=123 123/10=12  12/10=1 1/10=0
        }
        System.out.println("reverse the number is:"+rev);*/
       /* // 2 approach string buffer class
        int num1=sc.nextInt();
        StringBuffer rev;
        StringBuffer sb=new StringBuffer(String.valueOf(num1));
        rev=sb.reverse();
        System.out.println(rev);*/
        //3 approach
        //using string builder class
        /*int num2=sc.nextInt();
        StringBuilder sb1=new StringBuilder();
        sb1.append(num2);
        StringBuilder rev= sb1.reverse();
        System.out.println(rev);*/
        int number=sc.nextInt();
        int reverse=0;
        while(number!=0){
            reverse=reverse*10+number%10;
            number=number/10;
        }
        System.out.println("revrese number is:"+reverse);
    }

}
