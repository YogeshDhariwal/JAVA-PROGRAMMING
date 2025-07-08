package OOPS.Basic;
class phone{
    public void name(){
        System.out.println("i am nokia phone");
    }
    public void greet(){
        System.out.println("you are welcome");
    }
    public void showtime(){
        System.out.println("time is 8 o clock");
    }
}
class smartphone extends phone{
    public void name(){
        System.out.println("i am a samsung smartphone");
    }
    public void swagat(){
        System.out.println("nice to meet you");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//      phone o=new phone();  allowed
//       o.name();
        // smartphone s=new smartphone(); allowed
        phone obj=new smartphone();
        //1. reference must be of superclass and object of subclass is a valid
        //2.methods of superclass can be run using run time polymorphism and overriding method can be used
        //3.obj.swagat not allowed
        // CONCLUSION - only superclass obj will access through using this except overriding method of subclass
        obj.name();
        obj.greet();
        obj.showtime();
    }
}
