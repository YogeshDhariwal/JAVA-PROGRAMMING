package OOPS.InterfaceAbstraction;
// Interface is a point  where two system meet and interact
// In java interface is a group of related methods with empty bodies
// multiple base class cannot used to create a derived class but interface used for create a new class
 interface bicycle{
     void ApplyBrake(int d);
    void SpeedUp(int i);
}
class Atlas implements bicycle{
     int speed=7;
   @Override
   public  void ApplyBrake(int d){
         speed-=d;
       System.out.println(speed);
     }
     @Override
   public  void SpeedUp(int i){
         speed+=i;
       System.out.println(speed);
     }
}
public class Interfaces {
    public static void main(String[] args) {
Atlas a1=new Atlas();
a1.ApplyBrake(2);
a1.SpeedUp(2);
    }
}
