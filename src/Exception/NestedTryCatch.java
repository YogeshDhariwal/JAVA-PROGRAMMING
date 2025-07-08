package Exception;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]=8;
        marks[1]=2;
        marks[2]=9;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of index");
        int ind=sc.nextInt();
        try{
            System.out.println("welcome to java programming");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("invalid index");
                System.out.println("exception in level 2");
            }
        }
        catch (Exception e) {
            System.out.println("exception in level 1");
        }
    }
}
