package trisha;

import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter phone company is:");
        String p=scanner.nextLine();
        String company="realme";
        /*if(company=="realme"){
           System.out.println("phone is realme");
        }
        else{
            System.out.println("enter invelid phone");
        }*/

        do{
            System.out.println("mobile is realme");
        }
        while(company=="realme" );
            System.out.println("invalid phone");
    }
}
