package Collection;

import java.util.*;

public class set {
    public static void main(String[] args){
        Set<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(2);
        hs.add(98);
        hs.add(90);
        hs.add(57);
        hs.add(2);
        hs.remove(12);
        System.out.println(hs.remove(2));//data evali not the index
        System.out.println(hs.contains(98));
        //System.out.println(hs);
        //data ni retrivel u
        for(Integer x:hs){
       System.out.println(x);
        }
        System.out.println(hs);
       TreeSet<Integer>tr=new TreeSet<>();
       tr.add(90);
       tr.add(50);
       tr.add(9);
       tr.add(2);tr.add(1);
       tr.add(77);

       System.out.println(tr);
//        System.out.println(tr.last());
//        System.out.println(tr.first());
//        System.out.println(tr.pollLast());
//        System.out.println(tr.pollFirst());
        System.out.println(tr.subSet(2,10));
        System.out.println(tr.subSet(2,10).remove(9));
        System.out.println(tr);

        System.out.println(tr.descendingSet());//reverse

        System.out.println(tr);


    }
}
