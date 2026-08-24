package Collection;

import java.lang.reflect.Array;
import java.util.*;

public class Youtubep {
    public static void main(String args[]) {
        Vector v1 = new Vector();
        v1.add("rani");
        v1.add("janu");
       Vector v2=new Vector();
       v2.add("laduu");
       v2.add("jaa");
       v1.addAll(0,v2);

//       for(int i=0;i<v2.size();i++)
//           v1.add(v2.get(i));
//        System.out.println(v1.size());
//        System.out.println(v1.capacity());
        System.out.println(v1);
        System.out.println(v1.get(3));
       // v1.remove(5);
       // v1.removeAll(v2);
       // v1.clear();//entrite list clear
        //System.out.println(v1);
        //verification:
        //contains -single  value  vyndha ledha like true or false
        //containsall-multip[le values vundha ledha ani nchudaniki
        System.out.println(v1.contains("janu"));
        System.out.println(v1.containsAll(v2));
        //update:
        v1.set(3,"satisha");
        /*System.out.println(v1);
        System.out.println(v1.get(3));
        System.out.println(v1.indexOf("rani"));*/
        Object [] arr=v1.toArray();//only store ome string
        System.out.println(Arrays.toString(arr));
        Vector v4 = new Vector(400);
        v4.add("pr5abu");
        v4.add("jam");
        System.out.println(v4.size());
      System.out.println(v4.capacity());
        System.out.println(v4);
        Object[] arra=new Object[]{1,5,3,6,7};
        Vector v5=new Vector(Arrays.asList(arra));
        System.out.println(v5);
        System.out.println(v5.size());
        System.out.println(v5.capacity());
        //generics -java 1.5  specifie<> primitive data type ni specify cheyaleymu***only primitive datatype ni acess
       //generic apply out of the collection also
        //adds null value
        //vector java 1.o  lo introduce //collection 1.2
        Vector<Integer> v6=new Vector<>();
        v6.add(12);
        v6.add(null);
        v6.add(12);
        System.out.println(v6);

    }
}
