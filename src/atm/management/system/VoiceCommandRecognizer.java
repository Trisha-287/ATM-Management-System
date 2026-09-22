package atm.management.system;

import java.util.Scanner;

public class VoiceCommandRecognizer {
    private Scanner sc;
    public VoiceCommandRecognizer(Scanner scanner){
        this.sc=sc;
    }
    public String ListenForCommand(){
        System.out.println("voice command node");
        System.out.println("say/type:withdraw,Balance,Deposit,Transfer,Exit");
        System.out.println("command");
        String Command=sc.nextLine();
        return Command.toLowerCase().trim();
    }

}
