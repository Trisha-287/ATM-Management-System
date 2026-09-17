package practice.session;

import java.util.Scanner;

public class StringIsEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String name = sc.nextLine();
        if(name.isEmpty()){
            System.out.print("String is empty");
        }
        else{
            System.out.print("string is not empty");
        }
    }

}
