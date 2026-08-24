package Collection;

import java.util.*;

public class hashset {
    public static void main(String args[]){
        //1
        Set<Integer>s=new HashSet<>();
        System.out.println(s);
        s.add(2);
        System.out.println(s);
        s.remove(2);
        System.out.println(s);
        //2
        Set<Integer>s2=new HashSet<>(Arrays.asList(2,4,7,2,3));
        Set<Integer>s22=new HashSet<>(Arrays.asList(2,66,88,56));
        boolean isSubset=true;
        for(Integer value:s2){
            if(!s2.contains(value))
                isSubset=false;
            break;

        }
        if(isSubset) {
            System.out.println("set 2 is subset for set22");
        }
            else{
            System.out.println("not a subset");
            }
    }
}
