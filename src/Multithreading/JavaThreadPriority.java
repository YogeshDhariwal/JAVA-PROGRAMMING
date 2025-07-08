package Multithreading;
// jvm have a ready queue for the threads have to run using this queue
// we can use these threads which have to run first using thread priority

class Th extends Thread{
    public Th(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName());
    }
}
public class JavaThreadPriority {
    public static void main(String[] args) {
     Th T1=new Th("yogi1");
     Th T2=new Th("yogi2");
     Th T3=new Th("yogi3");
     Th T4=new Th("yogi4");
     T4.setPriority(Thread.MAX_PRIORITY);
     T1.setPriority(Thread.MIN_PRIORITY);
     T1.start();
     T2.start();
     T3.start();
     T4.start();

    }
}
