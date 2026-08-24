package Practice;

import java.util.*;

public class list {
    public static void main(String[] args){
        List<String>l=new LinkedList<>();
        l.add("rani");
        l.add("siva");
        l.add("lakshmi");
        l.add("pranu");
        l.add("rani");
        l.add("puri");
        System.out.println(l);
        System.out.println(l.subList(0,2));
//        l.remove(1);
//        l.get(2);
        System.out.println(l.getLast());
        System.out.println(l);
        Set<String>s=new HashSet<>(l);
        s.add("raki");
        System.out.println(s);
    }
}
