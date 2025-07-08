package OOPS.Inheritance;
// we cannot create object of interface but can create reference of interface
 class cellphone1{
     void call(){
         System.out.println("you can call .... ");
     }
     void showtime(){
         System.out.println("you can watch time ....");
     }
     void message(){
         System.out.println("you can message someone ...");
     }
 }
interface gps{
     void track();
}
interface media{
     void SongsVedios();
}
interface camera{
     void pixels(int a);
}
class smartphone1 extends cellphone1 implements media,gps,camera{
    @Override
    public void pixels(int a) {
        System.out.println("Camera of smartphone have pixels :" +a);
    }

    @Override
    public void SongsVedios() {
        System.out.println("you can watch and listen songs,vedios");
    }

    @Override
    public void track() {
        System.out.println("my can track your location,maps etc. using gps");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
    smartphone1 samsung=new smartphone1();
    samsung.call();
    samsung.message();
    samsung.pixels(23);
    samsung.SongsVedios();
    samsung.track();
    }
}
