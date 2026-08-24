package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class prg3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 9, 8, 5, 0, 10, 15));
        int list1Size = al.size() / 2;
        int list2Size = al.size() - list1Size;
        /*ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < list1Size; i++) {
            al1.add(al.get(i));
        }
        for (int i = 0; i < list2Size; i++) {
            al2.add(al.get(list1Size+i));
        }
        System.out.println(al1);
        System.out.println(al2);*/
        ///another way method
        ArrayList<Integer> a11 = new ArrayList<>(Arrays.asList(4,9,8));
        ArrayList<Integer> a12 = new ArrayList<>(Arrays.asList(5,0,10));
        ArrayList<Integer> a13 = new ArrayList<>();
//        a13.addAll(a11);
//        a13.addAll(a12);
        /*for(Integer element:a11){
            a13.addAll(element);
        }
        for(Integer element:a12){
            a13.addAll(element);

        }*/
        System.out.println(a13);
    }
}

