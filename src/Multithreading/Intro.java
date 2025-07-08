package Multithreading;
// Multithreading is used for multitasking(multitasking while multitasking, LIGHTWEIGHT)
// THREADS USE TO STORE MEMORY AREA
// FASTER CONTENT SWITCHING
//multiprocessing(heavyweight)
// TWO TYPES TO CREATE THREADS-
//1.By extending thread class
//2.By implementing run able
//  ******  Concurrency  vs parallelism
// Concurrency- is task of running and managing the multiple computation
//working on one work at a time but managing multiple works
// parallelism- working on multiple task at a particular instant
// using extending thread class
class Mythread extends Thread{
    @Override
    public void run(){
        int i=0;
       while(i<4) {
           System.out.println("my thread 1 is running");
           i++;
       }
    }
}
class Mythread2 extends Thread{
    int n=0;
    @Override

    public void run() {
        while (n<5) {
            System.out.println("my thread 2 is running");
            n++;
        }
    }
}

public class Intro {
    public static void main(String[] args) {
    Mythread t1=new Mythread();
    Mythread2 T1=new Mythread2();
    t1.start();
    T1.start();
        System.out.println(t1.isAlive());
    }
}

