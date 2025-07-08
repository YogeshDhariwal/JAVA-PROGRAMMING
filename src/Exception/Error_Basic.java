package Exception;
import java.util.Scanner;
// there are three type of errors-
/* 1.syntax error
  2. logical error
  3. runtime error
* */
public class Error_Basic {
    public static void main(String[] args) {
//        int a=5;
//        int b=0;
//       int c;
//
//            try {
//                System.out.println(c=a/b);
//            } catch (Exception e) {
//                System.out.println(e);
//                // throw new RuntimeException(e);
//            }
//        finally {
//                System.out.println("hello i am finally");
//            }
        int k;
        Scanner sc=new Scanner(System.in);
        k= sc.nextInt();
        try {
            System.out.println("Integer part of 1000 division by k is " + 1000 / k);
        }
        catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
