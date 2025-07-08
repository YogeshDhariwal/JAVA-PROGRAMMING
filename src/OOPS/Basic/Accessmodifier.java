package OOPS.Basic;
// private member only accessed by only inside the class or by using methods of class which are public
// protected is same as private but can be inherited to other class
// public can be accessed by outside the class and easy to inherit
class A{
    int side;
private int s;
public int s1;
public void gets(int s2){
    s=s2;
}

}
public class Accessmodifier {
    public static void main(String[] args) {
        A obj=new A();
        obj.side=9;
      obj.gets(2);
    }
}
