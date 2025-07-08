package Multithreading;

//class SharedData {
//    boolean ready = false;
//
//    synchronized void waitForSignal() {
//        System.out.println("Waiting thread: Waiting for signal...");
//        while (!ready) {
//            try {
//                wait(); // wait until notified
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Waiting thread: Got the signal!");
//    }
//
//    synchronized void sendSignal() {
//        try {
//            Thread.sleep(3000); // simulate delay
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        ready = true;
//        System.out.println("Notifier thread: Sending signal...");
//        notify(); // wake up the waiting thread
//    }
//}

class SharedData{
     boolean ready=false;
     synchronized void waitForSignal(){
         System.out.println("waiting thread: wait for signal");
         while(!ready){
             try{
                wait();
             }
             catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
         System.out.println("waiting thread got the signal");
     }

     synchronized  void sendSignal(){
         try{
             Thread.sleep(5000);
             System.out.println("thread wait for 5 sec");
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         ready=true;
         System.out.println("notifier thread: sending signal");
         notify();

     }
}


public class MethodsInMultithreading {
    public static void main(String[] args) {

        SharedData data = new SharedData();

        Thread waitingThread = new Thread(() -> data.waitForSignal());
        Thread notifyingThread = new Thread(() -> data.sendSignal());

        waitingThread.start();
        notifyingThread.start();
    }

}
