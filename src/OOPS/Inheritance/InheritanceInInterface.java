package OOPS.Inheritance;
// We can extends  multiple interface
// but we cannot extend interface in class
interface Boxer{
    void PunchPower(int punch);
    void Footwork();
}
interface wrestler{
    void moves();
    void practice();
}
interface Grappler{
   void grapplegame();
   void learnskill();
}

interface MMA extends Boxer,wrestler,Grappler{
    void cardio();
    void coaching();
}
// class bestfighter extends mma - not allowed
class BestFighter implements MMA{
    @Override
    public void cardio() {
        System.out.println("the one have the best cardio");
    }

    @Override
    public void coaching() {
        System.out.println("have the best coaching staff");
    }

    @Override
    public void PunchPower(int punch) {
        System.out.println("the best boxer have punch power "+punch);
    }

    @Override
    public void Footwork() {
        System.out.println("have best footwork");
    }

    @Override
    public void moves() {
        System.out.println("have best moves of wrestling");
    }

    @Override
    public void practice() {
        System.out.println("practice the moves million times");
    }

    @Override
    public void grapplegame() {
        System.out.println("ju-jitsu as grapple game");
    }

    @Override
    public void learnskill() {
        System.out.println("know how to chock,armbar,twister etc");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        BestFighter TomAspinal=new BestFighter();
        System.out.println("One of the best fighter TOM ASPINAL have skills :");
        TomAspinal.cardio();
        TomAspinal.coaching();
        TomAspinal.Footwork();
        TomAspinal.grapplegame();
        TomAspinal.PunchPower(800);
    }
}
