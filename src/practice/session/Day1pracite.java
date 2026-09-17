package practice.session;

public class Day1pracite {
    public static  void main(String[] args) {
        int number[]={2,6,11,44,3,9,8};
        for(int i=0;i< number.length;i++) {
            if (number[i] % 2 == 0) {
                System.out.println("number is divide by:" + number[i]);
            }
        }
    }
}
