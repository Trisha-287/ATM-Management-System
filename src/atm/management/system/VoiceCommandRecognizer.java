package atm.management.system;

import java.util.Scanner;
public class VoiceCommandRecognizer {
    Scanner sc;
    // Constructor
    public VoiceCommandRecognizer(Scanner sc) {
        this.sc = sc;
    }
    // Listen for COMMAND
    public String ListenForCommand() {
        System.out.println("Enter command:");
        String command = sc.nextLine().toLowerCase().trim();
        if (command.contains("balance")) {
            return "balance";
        }
        else if (command.contains("deposit")) {
            return "deposit";
        }
        else if (command.contains("withdraw")) {
            return "withdraw";
        }
        else if (command.contains("transfer")) {
            return "transfer";
        }
        else if (command.contains("exit")) {
            return "exit";
        }
        else {
            return "unknown";
        }
    }
}

