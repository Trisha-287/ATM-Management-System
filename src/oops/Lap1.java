package oops;

public class Lap1 {
    private String brand;
    private int price;
    String processor;
    int ram;
    /*public Lap1(String brand,int price,String processor,int ram) {
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
    }*/
    public void setRam(int ram) {
        this.ram = ram;
    }
    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
