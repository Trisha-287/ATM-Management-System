package Collection;

import java.util.*;

public class AssignmentList {
    public static void main(String[] args){
        /*List<Integer>l=new ArrayList<>();
       l.add(4);
        l.add(5);
        l.add(0);
        l.add(9);
        l.add(8);
        l.add(10);
        System.out.println(l);
        int sum=0;
        for(Integer j:l){
            sum=sum+j;
        }
        double avg=sum/l.size();
        System.out.println("ag is:"+avg);
        //System.out.println("sum is:"+sum);
        //even number ******
        int sum1=0;
       for(Integer y:l) {
           if (y % 2 == 0) {
               sum1 = sum1 + y;
           }
       }
        System.out.println("sum is:"+sum1);*/
        //Split a list into 2 lists*********
        List<Integer>l1=new ArrayList<>();
        l1.add(4);
        l1.add(9);
        l1.add(8);
        l1.add(5);
        l1.add(0);
        l1.add(10);
        System.out.println(l1);
        System.out.println(l1.subList(0,3));
        System.out.println(l1.subList(3,6));
        //4  wap to merge twom list into a single list
        List<Integer>l2=new ArrayList<>();
        l2.add(4);
        l2.add(9);
        l2.add(8);
        System.out.println(l2);
        List<Integer>l3=new ArrayList<>();
        l3.add(5);
        l3.add(0);
        l3.add(10);
        System.out.println(l3);
       System.out.println(l2.addAll(l3));
        System.out.println(l2);
        //question 5*********** repeated duplicate elementsalong with its repetiton count

    }
}
