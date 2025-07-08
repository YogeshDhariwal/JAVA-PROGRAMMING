package METHODS;
// methods can be created by using static methods and if we do not want to use static methods
// for creating methods, we use object to run programme
public class Methodsinjava {
//    static int logic(int a,int b){
//        return a*b;
//    }
int logic(int a,int b){
    return a*b;
}

    public static void main(String[] args) {
       int x=8;
       int y=7;
//      int result= logic(x,y); // using static
        Methodsinjava obj=new Methodsinjava();
        int result=obj.logic(x,y);// using object
        System.out.println("Multiplication of given two number is:"+result);
    }
}
