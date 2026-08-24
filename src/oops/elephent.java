package oops;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public abstract class elephent implements Animals {
    public abstract void size();
    public abstract void color();
    private String eating;

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }

    public void sound(){
        List<String> l=new ArrayList<>();
        l.add("snake1");
        l.add("centipeda");
        l.add("cryptos");
        l.add("snake2");
        l.add(1,"snake");
        System.out.println(l);
        Scanner sc=new Scanner(System.in);
        System.out.print("which animal is sound that anima name is enter:");
        String str=sc.nextLine();
        if(l.contains(str)){
            System.out.println("this animal is posion" );
        }else{
                System.out.println("this animal is not a posion");
            }
        }
    }
