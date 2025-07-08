package Exception;
import java.util.Scanner;
public class HandlingSpecificException {
    public static void main(String[] args) {
        int [] marks= new int[3];
      marks[0]=8;
      marks[1]=2;
      marks[2]=9;
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the array index");// arrayunbound exception
        int ind=sc.nextInt();
        System.out.println("enter the number you want to divide the value with");
        int number=sc.nextInt(); // arithmetic exception
        try{
            System.out.println("the value at array index entered is:"+marks[ind]);
            System.out.println("the value of array value/number is :"+ marks[ind]/number);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound exception occured");
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("arithmetic exception occured");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("some other exception occured");
            System.out.println(e);
        }
    }
}
