package Collection;

import java.util.*;

public class Practice {
    public static void main (String[]args){
//        List<String> cars=new ArrayList<>();
//        cars.add("java");
//        cars.add("python");
//        cars.add("opps");
//        //cars.subList(1,3);
//        cars.size();
//      cars.remove(1);
//        //System.out.println(cars);
//        //cars.clear();
//        //System.out.println(cars);
//        cars.set(1,"rani");
//        System.out.println(cars.get(0));
//        System.out.println(cars);
////        for(String car:cars){
////            System.out.println(car);
////        }
////        Iterator it=cars.iterator();
////        while(it.hasNext()) {
////            System.out.println(it.next());
//   //     }
//    }
        /*Map<Integer,String>ob=new Hashtable<>();
        ob.put(100,"rani");
        ob.put(102,"ram");
        ob.put(103,"aam");
      // System.out.println(ob);//{103=aam, 102=ram, 100=rani}
       // System.out.println(ob.keySet());//[103, 102, 100]
       // System.out.println(ob.get(101));
        //System.out.println(ob.get(100));
        List<Integer>li=new ArrayList<>();
        for(Integer key:li) {
            System.out.println(li);
        }
        System.out.println(li);
        System.out.println(ob);
        //two ways created
        //this is the first one
        List<Integer>l=new ArrayList<>(ob.keySet());
        System.out.println(l);
        //this is the second method
        Iterator<Integer>ll=ob.keySet().iterator();
        while(ll.hasNext()) {
            System.out.println(ll.next());
        }
        for(Integer key:l){
            System.out.println(key+">>>>"+ob.get(key));

        }
        System.out.println(ob);
System.out.println( ob.isEmpty());

        System.out.println(ob.size());*/
//        System.out.println(li);
//      System.out.println(ob);
        ///?************queue concept practice************///



        //priority queue
        Queue<Integer>pq=new PriorityQueue<>();
        //adition---offer()or add()
        //retrivel--peek
        //removal--poll()orremove()
        pq.add(3);
        pq.offer(4);
        pq.add(22);
        System.out.println(pq);
        //retrivel--peek
        System.out.println(pq.peek());
//removal--poll()orremove()
        System.out.println(pq.poll());//poll anedhi eami queue lekapothe null ani print chestudnhi
        System.out.println(pq.contains(22));//only verify
while(!pq.isEmpty()){
    System.out.println(pq.poll());
}









    }
    }