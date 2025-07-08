package OOPS.InterfaceAbstraction;
interface school{
    int total=670;// we can define properties in interface
    void teachers(int t);
    void students(int s);
}
interface office{
    void InOffice(int r);
    void worker(int w);
}
class TotalNumber implements school,office {
    @Override
    public void teachers(int t){
        System.out.println("The total no. of teachers in school are "+t);
    }
    @Override
    public void students(int s){
        System.out.println("The total no. of students in school are "+s);
    }

    @Override
    public void worker(int w) {
        System.out.println("working number in office "+w);
    }

    @Override
    public void InOffice(int r) {
        System.out.println("total members in office "+r);
    }
}
public class InterfaceVsAbstract {
    public static void main(String[] args) {
        TotalNumber T=new TotalNumber();
        T.students(500);
        T.teachers(100);
        T.InOffice(50);
        T.worker(20);
        System.out.println("TOTAL PEOPLE IN A SCHOOL"+T.total);// print properties but can not modify them
        //1. interface have all abstract function but in  abstract class there may be non-abstract function
  //2.In Interface methods defined in class as public but in abstract they may be default,public,private
  //3.we use interface to form a class what we cannot using multiple inheritance
    }
}
