package OOPS.Basic;
class Phone29{
    public void call(){
        System.out.println("calling via phone.....");
    }
    public void Message(){
        System.out.println("Messaging.....");
    }
}
class SmartPhone29 extends Phone29{
//    @Override
    public void call(){
        System.out.println("calling via smartphone");
    }
    public void song(){
        System.out.println("listening songs...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
//       SmartPhone s1=new SmartPhone();
//       s1.call();
        Phone29 p1=new SmartPhone29();
      p1.call();
      p1.Message();

    }
}
