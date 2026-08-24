package oops;

public interface Atmmachines {
    public void deposit();
    public void balance();
    public void withdraw();
    default void security(){
        System.out.println("atm machine has less security");
    }
}
