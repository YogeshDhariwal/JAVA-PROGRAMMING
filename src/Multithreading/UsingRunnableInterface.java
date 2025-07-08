package Multithreading;
//class MYThreadRunnable implements  Runnable{
//    @Override
//   public void run() {
//    while (true) {
//        System.out.println("thread in runnable class 1");
//    }
//    }
//}
//class MyThreadRunnable2 implements Runnable{
//    @Override
//    public void run() {
//        while(true) {
//            System.out.println("thread in runnable class 2");
//        }
//    }
//}
//public class UsingRunnableInterface {
//    public static void main(String[] args) {
//        MYThreadRunnable BULLET1=new MYThreadRunnable();
//        Thread gun1=new Thread(BULLET1);
//        MyThreadRunnable2 BULLET2=new MyThreadRunnable2();
//        Thread gun2=new Thread(BULLET2);
//        gun1.start();
//        gun2.start();
//
//    }
//}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("hello this is 1 runnable class");
        }
    }
}
  class MyRunnable2 implements Runnable{
      @Override
      public void run() {
          while (true){
              System.out.println("hello this is 2 runnable class");
          }
      }
  }

       public class UsingRunnableInterface{
    public static void main(String[] args) {
         MyRunnable Bullet1=new MyRunnable();
         Thread Gun1=new Thread(Bullet1);
         MyRunnable2 Bullet2=new MyRunnable2();
         Thread Gun2=new Thread(Bullet2);
         Gun1.start();
         Gun2.start();
    }

}