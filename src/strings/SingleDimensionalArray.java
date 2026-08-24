package strings;

public class SingleDimensionalArray {
    public static void main(String[] args){
        //declare array
        //approach1
        /*int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/
        //approach2
        int b[]={100,200,300,400,500};
        //find length of an array
        System.out.println(b.length);//5
        //read single value from an array
        System.out.println(b[3]);//here  3 is index
        //reading all the values from array
        //normal for loop
        /*for(int i=0;i<b.length;i++){// or  i<=4 i<5 i<=b.length-1;  i<b.lenth

        System.out.println(b[i] );//100 200 300 400 500

        }
         */
        //enhanced for loop or for each loop
        for(int x:b){
            System.out.println(x);
        }
    }
}
