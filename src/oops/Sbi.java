package oops;

public class Sbi implements Atmmachines {
    @Override
    public void balance() {
        System.out.println("check balance amount");
    }
    public void withdraw(){
        System.out.println("Successfully completed withdraw amount");
    }

    @Override
    public void deposit() {
        System.out.println("successfully completed deposit money");
    }
    public void  fastcash(){
        System.out.println("completed fast cash amount");
    }
}
