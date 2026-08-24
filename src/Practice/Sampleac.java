package Practice;

public abstract class Sampleac implements Laptop {
    public void copy() {
        System.out.println("lenovo copy code");
    }
    public void keyboard() {
        System.out.println("lenovo keyboard");
    }
    public  abstract void paste();
    public abstract void cut();
}
