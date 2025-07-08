package LOOPS;

public class IFELSE1 {
    public static void main(String[] args) {
        int a=4;
        int b=1;
        if(a>b){
            System.out.println("A is greater than B");
        }
         else{
            System.out.println("B is greater than A");
        }
        System.out.println(a>b?true:false);
         if(a>=b && b<=a){
             System.out.println("T");
         }
         else{
             System.out.println("f");
         }
    }
}
