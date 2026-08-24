package oops;

import java.util.*;
import java.util.Scanner;

import static java.awt.Color.blue;
import static java.awt.Color.green;

public class Elephant extends elephent{
    Scanner sc=new Scanner(System.in);
    @Override
    public void size() {
        System.out.print("enter elephrnt size:");
        int size=sc.nextInt();
        if(30<size) {
            System.out.println("size is middle");
        }
            else if(50<size) {
                System.out.println("Size is high ");
            }

                else{
                    System.out.println("size is default");
                }
    }

    @Override
    public void color() {
        List list=new ArrayList<>();
        list.add(blue);
        list.add(green);
        System.out.println(list);
        list.remove(blue);
        System.out.println(list);

    }



    @Override
    public void cow() {

    }
public static void main(String[] args){
    Elephant e=new Elephant();
    e.sound();
}

}
