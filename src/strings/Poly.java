package strings;

public class Poly {
    //constructor
    double width,height,depth;
    Poly(){
        width=height=depth=0;
    }
    Poly(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Poly(double len){
        width=height=depth=len;
    }
    double volume(){
        return(width*height*depth);
    }
    private int account;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private String name;
    private double amount;
}
