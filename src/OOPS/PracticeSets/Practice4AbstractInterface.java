package OOPS.PracticeSets;
// 1 and 2 question-
// abstract class pen{
//    abstract void write();
//    abstract void refill();
//}
//class FountainPen extends pen{
//    void write(){
//        System.out.println("this pen used to write");
//    }
//    void refill(){
//        System.out.println("this pen is refillable");
//    }
//   void ChangeNib(){
//       System.out.println("we can change nib of this pen");
//   }
//}
// question 3
class monkey{
    void jump(){
        System.out.println("he/she can jump");
    }
    void bite(){
        System.out.println("he/she can bite");
    }
}
interface BasicAnimal{
    void Eat();
    void Sleep();

}
class human extends monkey implements BasicAnimal{
    @Override
    public void Eat() {
        System.out.println("he/she can eat");
    }

    @Override
    public void Sleep() {
        System.out.println("he/she can sleep");
    }
    void Money(){
        System.out.println("they earns money");
    }
}
// question 4
//abstract class Telephone{
//    abstract void Ring();
//    abstract void Lift();
//    abstract void Disconnect();
//}
//class Smartphone extends Telephone{
//    @Override
//    void Ring() {
//        System.out.println("phone is Ringing ...");
//    }
//
//    @Override
//    void Lift() {
//        System.out.println("Attending phone ... ");
//    }
//
//    @Override
//    void Disconnect() {
//        System.out.println("Disconnecting phone ... ");
//    }
//    void Songs(){
//        System.out.println("you can listen songs");
//    }
//}
public class Practice4AbstractInterface {
    public static void main(String[] args) {
//        FountainPen p1=new FountainPen();
//        p1.write();
//        p1.refill();
//        p1.ChangeNib();
      human h1=new human();
      h1.jump();
      h1.bite();
      h1.Eat();
      h1.Sleep();
      h1.Money();
        monkey m1=new human();// using human as a monkey use only monkey methods
        m1.bite();
        BasicAnimal b1=new human();// using human as basic animal use only basicanimal methods
        b1.Sleep();
//        Telephone t1=new Smartphone(); // using smartphone as telephone
//        t1.Ring();
//        t1.Lift();
//        t1.Disconnect();
      //  t1.Songs(); invalid
//        Smartphone s1=new Smartphone();// using smartphone as smartphone
//        s1.Songs();
    }
}
