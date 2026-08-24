package Collection;


import java.util.*;
import java.util.Scanner;

public class Day1p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("enter a string:");
        String name=sc.nextLine();
        if(name.isEmpty()) {
            System.out.println("string is emty");
        }
        else{
            System.out.println("string is not empty");
        }*/
       /* System.out.println("enter a number" );
        int n=sc.nextInt();
        if(n%3==0){
            System.out.println("divisible by 3");

        }
        else{
            System.out.println("not divisible by 3");
        }*/
       /*System.out.println("enter a number:");
        int number=sc.nextInt();
        if(number%3==0 && number%5==0){
            System.out.println(number+"number is divible by both 3 and 5");
        }
        else{

            System.out.println(number+"number is not divible by both 3 and 5");
        }*/
       /* System.out.println("enter a number:");
        int number = sc.nextInt();
        int cuberoot = (int) Math.round(Math.cbrt(number));
        if (cuberoot * cuberoot * cuberoot == number) {
            System.out.println(number + "is a perfect cube root");
        } else {
            System.out.println(number + "is not perfect cube root");
        }*/
        /*System.out.println("enter a year number:");
        int year = sc.nextInt();
        if ((year % 4 == 0) || (year%100 != 0 )|| (year % 400 == 0)){

            System.out.println("year is a leap year");
        }
        else{
            System.out.println("year is a not leap year");
        }*/
        //palindrome
        /*System.out.println("enter a number:");
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while (num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(original==reverse){
            System.out.println("palindrome");
        }
        else
            System.out.println(" not a palindrome");*/
      //vowels
        /*System.out.println("enter a string:");
        String name=sc.next();
        for(int i=0;i<name.length();i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + ">>> this is vowels");
            } else {
               System.out.println (ch + ">> this is  a constant");
            }
        }*/
        //prime nnumber
       for(int num=2;num<=100;num++){
            boolean prime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }

            }
            if(prime){
                System.out.println("prime number is:"+num);
            }

        }
        //2 string swap their references
        /*String s1="trisha";
        String s2="siva";
        String temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);*/
       // swap the first and last element of the array
        /*int arr[]={10,3,4,5,6};
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println("after swapping number;");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
        //swap the ch
       /* String s="hello";
        int i=0;int j=4;
        char ch[]=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        String result=new String(ch);
        System.out.println("ostring:"+s);
        System.out.println("sapping string:"+result);*/
    }
}

