package Exception;

public class part41p1 {
    public static void main(String args[]) {
        System.out.println("prgoram execution start");
        /*method2();

    }
    public static void method2(){
        method1();
    }

    public static void method1(){
        int fnumber=5;
        int snumber=0;
        int result = fnumber / snumber;
        System.out.println("output is:"+result);
        System.out.println("prgoram execution end");*/
        int fnumber = 5;
        int snumber = 0;
        int result = 0;
        try {
            result = fnumber / snumber;
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());//write a logic to enter this message into log files
            throw ae;
        } finally {
            System.out.println("finally block");
        }
        System.out.println("prgoram execution end");
        System.out.println("output is:" + result);
    }
}
