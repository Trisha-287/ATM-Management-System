package strings;

import java.util.Scanner;

public class Employe2 implements Employe {
    Scanner sc = new Scanner(System.in);
    public void employee(){
        if(true){
            System.out.println("enter employeee details");
            System.out.println("1.employeeid");
            System.out.println("2.employeename");
            System.out.println ("3.emp-loyeedapt");
            System.out.println("4. employeesalary");
            System.out.println("5.exit");
            System.out.println("choice your option:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                  id();
                    break;
                case 2:
                    name();
                    break;
                case 3:
                    dept();
                    break;
                case 4:
                    salary();
                    break;
                case 5:
                    System.out.println("exit the programing");
                    return;
                default:
                    System.out.println("coorectly choosee your option");
            }
        }
    }
    @Override
    public void id() {
        int id = 1234;
        System.out.println("enter employee password:");
        int password = sc.nextInt();
        if (password == id) {
            System.out.println("password is correct");
        } else {
            System.out.println("password is invalid please try again");
        }

    }

    @Override
    public void name() {
        sc.nextLine();
        System.out.println("enter employee name:");
        String name1 = sc.nextLine();
        System.out.println("employee:"+name1);

    }

    @Override
    public void dept() {
        sc.nextLine();
        System.out.println("enter emmployee dept name is:");
        String dept = sc.nextLine();
        System.out.println("dweptrmnra:"+dept);

    }

    @Override
    public void salary() {
        System.out.println("enter employee salary:");
        int salary = sc.nextInt();
        if (salary < 30000) {
            System.out.println("employee salary is low");
        } else if (salary < 40000 && salary < 60000) {
            System.out.println("employee salary is medium");
        } else if (salary < 80000 && salary < 90000) {
            System.out.println("employee salary high:");
        } else {
            System.out.println("salary is zero");
        }
    }
}