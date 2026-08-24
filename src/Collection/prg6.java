package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class prg6 {
    public static void main(String[] args){
        ArrayList<Integer> arl=new ArrayList<>(Arrays.asList(4,1,9,8,0,5,8,1,1,6));
        //identify the unique element
        ArrayList<Integer>ues=new ArrayList<>();
        for(Integer element:arl){
            ues.add(element);
        }
    }
}
