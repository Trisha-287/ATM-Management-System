package oops;

public class Hdfc implements Atmmachines{
    public void miniStatements(){
        System.out.println(" view recnt transaction ");
    }
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
}
