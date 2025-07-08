package OOPS.Basic;
// IN A JAVA FILE THERE IS ALWAYS ONLY ONE PUBLIC CLASS
class Employee{
  // Attributes
    int id;
    int salary;
    String name;
    public void setdetails(int i,int s,String n){
       id=i;
       salary=s;
       name=n;
    }
    public void pritndetail(){
        System.out.println("My Name is "+name);
        System.out.println("My ID is "+id);
        System.out.println("MY salary is "+salary);
    }
}
public class Customclass {
    public static void main(String[] args) {
    Employee yogesh=new Employee();
//    yogesh.name="Yogesh";
//    yogesh.id=122;
//    yogesh.salary=4000;
//        System.out.println("Name: "+yogesh.name);
//        System.out.println("Id: "+ yogesh.id);
//        System.out.println("Salary: "+yogesh.salary);
        yogesh.setdetails(122,15000,"YOGESH");
          yogesh.pritndetail();
    }
}
