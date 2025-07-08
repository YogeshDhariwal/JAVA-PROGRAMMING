package OOPS.InterfaceAbstraction;
//1. Abstract means existing in the thoughts or as an idea without concrete existence
//2. Abstract method that is declared without an implementation is called abstract method
//3. Abstract class includes abstract methods ,then the class itself must be declared abstract as in abstract in name of class
//4. if you want to  inherit from abstract class then abstract method must be  over ride or declare derived class as abstract class
abstract class  Parent1{
    public Parent1(){
        System.out.println("i am base class constructor");
    }
   abstract public void greet();
}
class Children1 extends Parent1{
    @Override
public void greet() {
        System.out.println("hello,GOOD MORNING");
    }
    public void name(){
            System.out.println("i am yogesh");
        }

}
public class AbstractClass_Method {
    public static void main(String[] args) {
// parent1 p=new parent(); error
        Children1 c1=new Children1();
        c1.greet();
        c1.name();
     Parent1 p1=new Children1();// use reference of abstract class but have to use object of non abstract class
     p1.greet();

    }
}
