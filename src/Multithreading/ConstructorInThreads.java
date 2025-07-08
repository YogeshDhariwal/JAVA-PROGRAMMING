package Multithreading;
//class Mythr extends Thread{
// public Mythr(String name){
//     super(name);
//     System.out.println("i am string name constructor");
// }
//
//    @Override
//    public void run() {
//        super.run();
//    }
//}
  class Th1 extends Thread{

      public Th1(String name){
          super(name);
          System.out.println("i am a constructor");

      }

    @Override
    public void run() {
        super.run();
    }
}

public class ConstructorInThreads {
    public static void main(String[] args) {
     Th1 t1=new Th1("Yogesh Dhariwal");
    Th1 t2=new Th1("titu");

     t1.start();
     t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        System.out.println(t1.threadId());
        System.out.println(t2.threadId());
    }
}
