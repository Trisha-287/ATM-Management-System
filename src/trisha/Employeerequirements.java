package trisha;

import java.util.Scanner;

public class Employeerequirements {
    int id;
    String name;
    double salary;
    public void display(){
        System.out.println("employee id:"+id);
        System.out.println("employee name:"+name);
        System.out.println("employee salary:"+salary);
    }
    public void checksalarey() {
        if (salary >= 50000) {
            System.out.println("high salary");
        } else if (salary >= 30000 && salary < 50000) {
            System.out.println("medium salary");
        } else {
            System.out.println("low salary");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Employeerequirements e1=new Employeerequirements();
        System.out.println("enter employee name");
        e1.id=sc.nextInt();
    }
}
