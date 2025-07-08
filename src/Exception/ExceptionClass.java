package Exception;
// Exception   is a event that occur when there is something wrong with programme
//
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return "i am to sting()";
    }
   @Override
    public String getMessage(){
        return "i am get message()";
    }
}
public class ExceptionClass  {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<99){
            try{
              //  throw new MyException();
                throw new ArithmeticException("this is an exception");
            }
           catch (Exception e){
               System.out.println(e.getMessage());
               System.out.println(e.toString());
               e.printStackTrace();
               System.out.println(e);// string method run
               System.out.println("finished");
           }
        }
    }
}
