package oops;

public class AnimalsMd {
    public static void main(String[] args){
        Some_animals  s=new Some_animals();
        s.cow();
        Elephant e=new Elephant();
        e.size();
        e.color();
        e.cow();
        e.sound();
        e.setEating("food");
        System.out.println(e.getEating());

        }
    }

