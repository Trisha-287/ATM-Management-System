package threads;

public class part64 {
    public static void main(String[] args){
       /* Thread t1=new Thread();
        t1.start();
        Thread t2=new Thread();
        t2.start();
        Thread t3=new Thread();
        t3.start();
        System.out.println(Thread.activeCount());*/
        employee e=new employee();
       Thread t1=new Thread(e);
   t1.start();
        manager m=new manager();
        m.start();
        System.out.println(Thread.activeCount());
    }
}
class employee implements Runnable{
//    public void run(){
//        System.out.println("hi");
//    }
    @Override
    public void run(){
        System.out.println("hii");
    }
}
class manager extends Thread{
    public void run(){
        System.out.println("welcome");
    }
}
