package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class crtremoveduplicate {
    public static void main(String[] args){
        /*int arr[]={4,5,6,7,4,5,6,9,10};
        Set<Integer> s=new HashSet<>();
        System.out.println(s);
        for(int i=0;i< arr.length;i++){
            s.add(arr[i]);
        }
        System.out.println(s);*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements:");
        String input=sc.nextLine();
        String arr[]=input.split("");
        Set<Integer> s=new HashSet<>();
        for(String store:arr){
           s.add(Integer.parseInt(store));
        }
        System.out.println("after removing elements:");
        for(int ele:s){
            System.out.print(ele+" ");
        }
    }
}
