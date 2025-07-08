package Exception;
// finally block contains th code which is always executed whether th exception is handled or not
public class FinallyBlock {
//    public static int greet() {
//        try {
//            int a = 5;
//            int b = 0;
//            int c = a / b;
//            return c;
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("this is the end of this function");
//        }
//        return -1;
//    }

    public static void main(String[] args) {
//       int result=greet();
//        System.out.println(result);
        int a=6;
        int b=5;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("i am finally for value of b :"+b);
            }
            b--;
        }
    }
}
