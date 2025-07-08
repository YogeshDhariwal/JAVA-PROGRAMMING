package LOOPS;

public class breakcontinue {
    public static void main(String[] args) {
        // break and continue using loops
        for (int i=0;i<=5;i++){
//            System.out.println(i);
//            System.out.println("java is a good language");
//            if(i==2){
//                System.out.println("exiting the loop");
//                break;
//            }
//            if(i==1){
//                System.out.println("continue to next");
//                continue;
//            }
            if(i%2!=0){
                System.out.println("continue statement is running");
               continue;
            }
            System.out.println(i);
        }
    }
}
