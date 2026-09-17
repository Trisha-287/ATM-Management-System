package practice.session;

import java.util.Scanner;

public class Day2practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //palindrome
        System.out.print("enter a string:");
        try {
            String name = sc.nextLine();
            //check only alphabets
            if(!name.matches("[a-zA-Z]+")){
                throw new IllegalArgumentException("please enter only alphabates anly");
            }
            String reverse = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                reverse += name.charAt(i);
            }
            if (name.equalsIgnoreCase(reverse)) {
                System.out.println("palindrome");
            }
            else{
                System.out.println("not a palindrome");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
       sc.close();
    }
}
