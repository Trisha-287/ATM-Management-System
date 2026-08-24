package Collection;

import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string name:");
        String name = sc.nextLine();
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("reverse number is:" + rev);
    }
}
