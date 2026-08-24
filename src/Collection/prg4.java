package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class prg4 {
    public static void main(String[] args){
        ArrayList<Integer>a1=new ArrayList<>(Arrays.asList(4,9,8));
        ArrayList<Integer>a2=new ArrayList<>(Arrays.asList(5,0,10));
        ArrayList<Integer>a3=new ArrayList<>();
//        a3.addAll(a1);
//        a3.addAll(a2);
        //approach 2 like logical building
        for(Integer number:a1){
           a3.add(number);
        }
        for(Integer number:a2){
         a3.add(number);
        }
        System.out.println(a3);
    }

}
