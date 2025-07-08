package OOPS.Inheritance;
// Base class constructor will run first and then derived class constructor
class Base1{
    int x;
    int y;
    public Base1(int x,int y){
        System.out.println(x);
        System.out.println(y);
    }
    public Base1(){
        System.out.println("i am a base class constructor");
    }
    public void printdetail(){
        System.out.println("value of x is "+x);
        System.out.println("value of y is "+y);
    }
}
 class derived1 extends Base1{
    int d;
    int f;

    public derived1(){
        super(4,6);// super keyword is used to run overloaded constructor with argument
        System.out.println("i am a derived class constructor");
    }
    public derived1(int a,int b){
        super(a,b);
        System.out.printf("overloaded derived class having value x %d and y %d ",a,b);
    }
 }
public class CONSTRUCTORINHRIT {
    public static void main(String[] args) {
//        Base1 b=new Base1(2,4);
       derived1 d=new derived1(1,4);

    }
}
