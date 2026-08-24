package strings;

import java.util.Scanner;

public class Arrays {
    public static void main(String args[]) {
       int i[]={2,5,1,9,6 };
       int sum1=0;
        /*int sum = 0;
        for    (int j = 0; j <i.length; j++) {
            System.out.println(i[j]);
            sum = i[j] +sum;
        }
       System.out.println("sum element is:"+sum);*/
        for(int x:i){
            sum1=sum1+x;
        }
        System.out.println("sum element is:"+sum1);
   //     int sum=0;
//        int a[]={2,5,3,9,6};
//        for(int j=0;j<a.length;j++){
//            System.out.println(i[j]);
//            sum = a[j] +sum;
//    }
//        int avg=sum/a.length;
//        System.out.println("the average number is:"+avg);
        //***********even number**********
        /*int a[]={2,5,1,9,6 ,876,567,452};
        //extracting even number
        for(int j=0;j<a.length;j++){
            if(a[j]%2==0)
                System.out.println(" this number is even:"+a[j]);
        }*/
        //enhanced for loop
        /*for(int d:a){
            if(d%2==0)
                System.out.println(d);
        }*/
        //**********odd number******
        /*int b[]={2,5,1,9,6 };
        //extracting even number
        for(int j=0;j<a.length;j++){
            if(a[j]%2!=0)
                System.out.println(" this number is odd:"+a[j]);
        }*/
        // 2 arrays are equal or not
//        int a1[]={1,2,3,4};
//        int a2[]={1,2,3,4};
//        boolean status=Arrays.equals(a1,a2);
        //approach2
        boolean status=true;
        int a1[]={1,2,5,4};
        int a2[]={1,2,3,4};
        if(a1.length==a2.length){
            for(int k=0;k<a1.length;k++){
                if(a1[k]!=a2[k]){
                    status=false;
                }
            }
        }
        else{
            status=false;
        }
        if(status==true){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }
   }
}
