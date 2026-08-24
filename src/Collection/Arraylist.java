package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args){
        //1
        ArrayList<String>a1=new ArrayList<>(Arrays.asList("rani","raju","johnm"));
        System.out.println(a1.indexOf("rani"));
        System.out.println(a1.lastIndexOf("johnm"));
        //2
        ArrayList<String>a2=new ArrayList<>(Arrays.asList("hf","prema","siva"));
        ArrayList<String>a22=new ArrayList<>(Arrays.asList("suri"));
        a22.addAll(a2);
        System.out.println(a22);
        //3
        ArrayList<Integer>a3=new ArrayList<>(Arrays.asList(1,3,6,1,9,1,4,5,7));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        int count=0;
        for(Integer number:a3) {
            if (number == num)
                    count++;
        }
        System.out.println(count);
        //4
        ArrayList<Integer>a4=new ArrayList<>(Arrays.asList(22,34,78,567));
        System.out.println("entera a couple number:");
        int n=sc.nextInt();
        System.out.println(a4.contains(n));
        //5
        ArrayList<Integer>a5=new ArrayList<>(Arrays.asList(22,34,78,567));
       System.out.println("entera numbers like ouput is reverse order:");
       int n1=sc.nextInt();
        a5.add(n1);
        System.out.println(a5);
        for(int i=a5.size()-1;i>=0;i--){
            System.out.println((a5.get(i)+""));

        }
    }
}
