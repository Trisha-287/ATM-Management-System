package Exception;

public class lambdaexp62 {
    public static void main(String[] args){
//        Audi a=new Audi();
//        a.drive(50,"pa");
//        car c1=new car()
//        {
//            public void drive(int speed,String model) {
//                System.out.println("driving audio");
//            }
//        };
  //      c1.drive(70,"Tata");
        //lambda expression with anonymous function
        car c2=()-> {
            System.out.println("driving tata");
            System.out.println("car is driving very smothly");
            return 40;
        };
        System.out.println(c2.getspeed());
        /*if(5<6){
            System.out.println("lesser");
            System.out.println("hello");
        }
        else{
            System.out.println("greater");
        }*/
    }
}
class Audi implements car{

    @Override
    public int getspeed() {
   return 50;
    }
}
@FunctionalInterface
interface car {
    public int getspeed();

}
