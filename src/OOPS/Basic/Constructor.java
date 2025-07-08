package OOPS.Basic;
//1.same name as class ,explicit call
// 2.constructor does not have any return type
// 3. default,parameterised,copy constructor
// 4. constructor can be overloaded
class Cricketer{
    String name;
    int runs;
    String team;
    public Cricketer(String name,int runs,String team){
        this.name=name;
        this.runs=runs;
        this.team=team;
    }
    public void getdata(){
        System.out.println("NAME:"+name);
        System.out.println("RUNS:"+runs);
        System.out.println("TEAM :"+team);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Cricketer c1=new Cricketer("Steve smith",9999,"Australia");

        c1.getdata();
    }
}
