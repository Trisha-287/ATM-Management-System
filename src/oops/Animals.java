package oops;

public interface Animals {
    public void cow();

    default void dog(){
        System.out.println(" dog is sleeping");
    }
}
