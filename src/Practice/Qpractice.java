package Practice;

import java.util.*;

public class Qpractice {
    public static void main(String[] args) {
        //priority queue
        Queue<Integer> q = new PriorityQueue<>();//capacity11
        q.add(3);
        q.add(4);
        q.add(22);
        q.add(1);
        q.offer(10);
        System.out.println(q);
        //peek() head lo una element ni chustundhi but remove avdhu
        //poll()head lo una value ni remove chestundhi this one
        System.out.println(q.contains(9));//true or false
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        for (Integer x : q) {
            System.out.println(x);
        }
        /*while(!q.isEmpty()){
            System.out.println(q.poll());
        }*/
        //highest proity to lowest
        //**********array deque**********
        Deque<String> ad1 = new ArrayDeque<>();//two side quqe capacity 17
        ad1.add("bana");
        ad1.addFirst("cherry");
        ad1.addLast("apple");
        ad1.offerFirst("kiwi");
        ad1.offer("pear");
        ad1.offerLast("mango");
        System.out.println(ad1);
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.peekLast());
        System.out.println(ad1.poll());
        System.out.println(ad1);
        System.out.println(ad1.pollFirst());
        System.out.println(ad1);
        System.out.println(ad1.pollLast());
        System.out.println(ad1);
        ad1.isEmpty();
        System.out.println(ad1.size());


    }

}
