package Multithreading;
class NewThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<50){
        System.out.println("hello");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            i++;
        }

    }
}
class NewThread2 extends Thread{
    @Override
    public void run() {
        int i=0; 
        while(i<50){
            System.out.println("thank you");
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        NewThread1 t1 =new NewThread1();
        NewThread2 t2=new NewThread2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
           System.out.println(e);
       }
        t2.start();
    }
}
