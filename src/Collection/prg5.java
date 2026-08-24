package Collection;


import java.util.*;

public class prg5 {
    public static void main(String[] args) {
        ArrayList<String>arl=new ArrayList<>(Arrays.asList("siva","siva","janu","rani","raju","luckky","rani","raju"));
        ArrayList<String>ues=new ArrayList<>();
        //wtithouthashset
        //ieteration

        int sum=0;
        for(String element:arl){
            if(!ues.contains(element))
            ues.add(element);
            else{
                sum++;
            }
        }
        System.out.println(ues);
        System.out.println(sum);
        //with hashet

//        Set<String>ues=new HashSet<>(arl);
        for(String ue:ues){
            int repeatedCount=0;
            for(String element:arl) {
                if (ue.equals(element)) {
                    repeatedCount++;
                }
            }
                if(repeatedCount >1) {
                    System.out.println(ue + ">>>" + repeatedCount);
                }

        }
    }
}
