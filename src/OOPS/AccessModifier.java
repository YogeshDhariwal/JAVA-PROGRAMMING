package OOPS;
class A {
    public int a = 3;
    private int b = 4;
    int c = 8;
    public void getb(){
        System.out.println(b);
    }
    protected int f=8;
}
class B extends A{
    int d=8;
}
public class AccessModifier {
    public static void main(String[] args) {
        A ibj2=new A();
      ibj2.getb();
       B obj1=new B();
        System.out.println(obj1.a);
        System.out.println(obj1.c);
        System.out.println(obj1.f);
    }
}
