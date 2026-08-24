package oops;

import java.util.Arrays;
import java.util.Scanner;

import static java.awt.Color.black;
import static java.awt.Color.white;
public class Some_animals implements Animals{
    Scanner sc=new Scanner(System.in);
    @Override
    public void cow() {
        String []list={"white","black","brown"};
        String []list1=new String[list.length];
        System.out.println(Arrays.toString(list));
        for(int i=0;i<list.length;i++){
            System.out.println("enter color name:");
             list[i] = sc.nextLine();
        }

        System.out.print("enter cow color:");
        String str = sc.nextLine();
        if (str.equalsIgnoreCase("white")) {
            System.out.println("cow color is white");
        }
        else if (str.equalsIgnoreCase("black")) {
            System.out.println("cow color is black");
        } else {
            System.out.println("cow color is inalid");
        }

    }

}
