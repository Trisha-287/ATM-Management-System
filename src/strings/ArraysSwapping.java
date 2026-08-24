package strings;

public class ArraysSwapping {
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println("before swapping values are:"+a+" "+b);
        //logic 1
        /*int t=a;
        a=b;
        b=t;*/
        //logic 2--use (addition and substract)without using 3rd variable
       /* a=a+b;//10+20=30
        b=a-b;//30-20=10
        a=a-b;*///30-10
        //logic 3--use (* and /)without using 3rd variable
        //here a &b values shouild not be zero
        /*a=a*b;//10*20=200
        b=a/b;//200/20=10
        a=a/b;//200/10=20*/
        //logic 3--bitwise xor(^)
        a=a^b;
        b=a^b;
        a=a^b;
        //logic 5 sinle stmt
        b=a+b-(a=b);

        System.out.println("after swapping values are:"+a+" "+b);
    }
}
