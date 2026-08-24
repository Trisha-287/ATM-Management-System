package Practice;

public interface Laptop {
    public void copy();
    public void paste();
    public void cut();
    public void keyboard();
    default void security(){
        System.out.println();
    }

}
