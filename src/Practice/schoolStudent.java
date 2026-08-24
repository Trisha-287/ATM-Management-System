package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class schoolStudent implements studentproperties{
    @Override
    public int id() {
        return 12;
    }

    @Override
    public String name() {
        String arr[]={"rani","john","pandu"};
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your name:");
//        String names=sc.nextLine();
        if(arr.equals(arr)) {
            System.out.println("stident names is:" + Arrays.toString(arr));
            System.out.print("enter student number:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("student name is:" + arr[1]);
                    break;
                case 2:
                    System.out.println("student name is:" + arr[2]);
                    break;
                case 3:
                    System.out.println("student name is:" + arr[3]);
                    break;
                default:
                    System.out.println("invalid number please check ones");
            }
        }
        return "";
    }

    @Override
    public int phone_number() {
        return 4567889;
    }
}
