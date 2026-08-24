package trisha;

public class Dog {
    String color="black";
    static double weight=23.34;
    String food="1kg";
    public static void main(String args[]){
        System.out.println("dog detais");
        Dog d=new Dog();
        System.out.println("color is:"+d.color);
        System.out.println("dog weight is:"+d.weight);
        System.out.println("how much food dog is the eating:"+d.food);
         d.eating();
        d.sleeping();
        walking();
    }
    private static void walking(){
        System.out.println("dog is walking");
    }

    public void eating(){
            System.out.println("dog is eating is");
    }
        public void sleeping(){
            System.out.println("dog is sleeping");
    }
}
