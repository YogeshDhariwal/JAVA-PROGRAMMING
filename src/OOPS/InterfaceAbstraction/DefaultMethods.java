package OOPS.InterfaceAbstraction;

class cellphone2{
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
interface mygps{
    void track();
    default void location(){   // default methods are used when we want to change something in interface
        System.out.println("used to get location");
    }
}
interface mymedia{
    void SongsVedios();
}
interface mycamera{
    void pixels(int a);
}
class smartphone2 extends cellphone2 implements mymedia,mygps,mycamera{
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
public class DefaultMethods {
    public static void main(String[] args) {
        smartphone2 samsung=new smartphone2();
        samsung.call();
        samsung.message();
        samsung.pixels(23);
        samsung.SongsVedios();
        samsung.track();
        samsung.location();// WE CAN OVERWRITE DEFAULT METHOD IN CLASS
    }
}
