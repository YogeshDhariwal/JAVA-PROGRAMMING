package OOPS.InterfaceAbstraction;
interface bowler{
    void DoBowl();
}
interface batsman{
    void DoBat();
}
interface fielder{
    void DoField();
}
class cricketer{
    void name(String s){
        System.out.println("Name of player is "+s);
    }
    void ExtraPlayer(){
        System.out.println("he is also a cricketer");
    }
    void Retire(){
        System.out.println("they are retired cricketer");
    }
    void Active(){
        System.out.println("he is a active player");
    }
}
class Athlete extends cricketer implements bowler,fielder,batsman{
    @Override
    public void DoBat() {
        System.out.println("he is a batsman");
    }

    @Override
    public void DoField() {
        System.out.println("he is a fielder");
    }

    @Override
    public void DoBowl() {
        System.out.println("he is a bowler");
    }
    void stamina(){
        System.out.println("he has a better stamina");
    }
}
public class PolymorphismInInterface {
    public static void main(String[] args) {
//        Athlete steve=new Athlete();
//        steve.name("steve smith");
//       steve.Active();
//        steve.DoBat();
//        steve.DoBowl();
//        steve.DoField();
//        steve.stamina();
  //      bowler b=new Athlete(); // it use  only as bowler access bowler methods oNly
   //   cricketer c1=new Athlete();  // it use only as cricketer and use cricketer method only

    }
}
