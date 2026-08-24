package trisha;
public class Calapp {
    int num1=2;
    int num2=3;
    static int num3=6;
    static int num4=9;
    public void substraction(){
        System.out.println(num1-num2);
    }
    public static void main(String args[]){
        addition();
    Calapp cal=new Calapp();
        cal.substraction();
        cal.multiplication();
        cal.division();
    }
       public static void addition() {
        System.out.println(num3+num4);
    }
        public void division(){
        System.out.println(num1/num2);
    }
        public void multiplication(){
        System.out.println(num1*num2);
    }

}

