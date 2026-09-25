package atm.management.system;

public class CashManager {
    int notes500=100;
    int notes200=100;
    int notes100=100;
    int atmCash;

    //constructor
    CashManager(){
        atmCash=(notes500*500)+(notes200*200)+(notes100*100);
    }
    //withdrawal Method
    boolean withdraw(int amount){
        try{
            if(amount<=0){
                throw new Exception("amount must be greater than zero");
            }
            if(amount %100!=0){
                throw new Exception("enter amounts in multiples of 100");
            }
            if(amount>atmCash){
                throw new Exception("atm has insufficient cash");
            }
            int remainingAmount=amount;
            int give500=0;
            int give200=0;
            int give100=0;
            //500 notes
            give500=Math.min(remainingAmount/500,notes500);
            remainingAmount=remainingAmount-(give500*500);
            //200 notes
            give200=Math.min(remainingAmount/200,notes200);
            remainingAmount=remainingAmount-(give200*200);
            //100 notes
            give100=Math.min(remainingAmount/100,notes100);
            remainingAmount=remainingAmount-(give100*100);
            if(remainingAmount!=0){
                throw new Exception("atm cannot dispense this amount with available notes");
            }
            //updated Atm notes
            notes500=notes500-give500;
            notes200=notes200-give200;
            notes100=notes100-give100;
            atmCash=atmCash-amount;
            System.out.println("\n cash dispensed");
            System.out.println("withdrawal amount:"+amount);
            System.out.println("500 notes:"+give500);
            System.out.println("200 notes:"+give200);
            System.out.println("100 notes:"+give100);
            System.out.println("remaining atm cash:"+atmCash);
            return true;
        }
        catch (IllegalArgumentException e){
            System.out.println("withdrawal failed"+e.getMessage());
            return false;
        }
        catch (ArithmeticException e){
            System.out.println("withdrawal failed"+e.getMessage());
            return false;
        }
        catch (Exception e){
            System.out.println("withdrawal failed"+e.getMessage());
            return false;
        }

    }
    boolean depositCash(int deposited500,int deposited200,int deposited100){
        try{
            //notes validation
            if(deposited500<0||deposited200<0||deposited100<0){
                throw new IllegalArgumentException("number of nodes cannot be negative");
            }
            int depositedAmount=(deposited500*500)+(deposited200*200)+(deposited100*100);
            //at least one note should be deposited
            if(depositedAmount<=0){
                throw new IllegalArgumentException("please deposited at least one note");
            }
            //add notes to Atm
            notes500=notes500+deposited500;
            notes200=notes200+deposited200;
            notes100=notes100+deposited100;
            //add cash to atm
            atmCash =atmCash+depositedAmount;
            System.out.println("\n cash deposited");
            System.out.println("500 notes:"+deposited500);
            System.out.println("200 notes:"+deposited200);
            System.out.println("100 notes:"+deposited100);
            System.out.println("deposited cash:"+depositedAmount);
            System.out.println("remaining atm cash:"+atmCash);
            return true;
        }catch (IllegalArgumentException e){
            System.out.println("deposited failed:"+e.getMessage());
            return false;
        }
    }

}
