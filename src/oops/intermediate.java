package oops;

import java.util.Scanner;

public class intermediate extends Student10 {
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
    public void btech(){
        Scanner sc=new Scanner(System.in );
        System.out.println("enter student branch:");
        String branch=sc.nextLine();
        if (true){
            if(branch.equals("it")){
                System.out.println("it branch is easy to studingf");
            } else if (branch.equals("ece")) {
                System.out.println("ece branch is very tuff");
            }
        }
    }
}
