package atm.management.system;

public class VoiceAssistant {
    public void welcomemessage() {
        System.out.println("\n*****ATM VOICE ASSISTANCE*****");
        System.out.println("welcome to the atm please enter you pin using the secure keypad");
    }
    public void say(String message){
        System.out.println("[VOICE]:"+message);
    }
    public void showInstructions(){
        System.out.println("atm instruction");
        System.out.println("withdraw-withdraw cash");
        System.out.println("balance-check account balance");
        System.out.println("deposit-deposit money");
        System.out.println("transfer-transfer money");
        System.out.println("exit-logout from ATM");
        System.out.println("pin must be entered using the secure keypad");
    }
}
