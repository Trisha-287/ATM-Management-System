package oops;

import java.util.Scanner;

public class Student10 implements Polystudent {
    Scanner sc=new Scanner(System.in);
    @Override
    public void name() {
        System.out.println("enter student name:");
        String n=sc.nextLine();

    }

    @Override
    public void age() {
        System.out.println("enter student age:");
        int ag=sc.nextInt();
    }

    @Override
    public void marks() {
        System.out.println("enter student marks:");
        int marks=sc.nextInt();
      if(marks>35){
          System.out.println("student is pass");
      } else if (marks<35) {
          System.out.println("student is fail");
      }

    }
    }

