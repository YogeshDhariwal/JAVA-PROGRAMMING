package LOOPS;

public class practicesetloop3 {
    public static void main(String[] args) {
        // 1.print question
//        int n=4;
//        for (int i = 0; i < n; i++) {
//            for (int j=n-i;j>0;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //2.printing pattern
//        int n=4;
//        for (int i = 0; i < n; i++) {
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // 3.sum of first n even numbers using while loop
//        int n=4;
//        int sum=0;
//        for(int i = 0; i < n; i++) {
//           sum=sum+2*i;
//        }
//        System.out.println("sum of even number is:");
//        System.out.println(sum);
        // 4.multiplication table of given number
//        int n=5;
//        System.out.println("table of a given number is:");
//        for (int i = 1; i <=10; i++) {
//
//            System.out.println(n*i);
//        }
        // 5. factorial of a given number
//        int n=4;
//        int fact =1;
//        while(n>0){
//            fact=fact*n;
//            n--;
//        }
//        System.out.println(fact);
        // using for loop
//        for (int i = 1; i <=n; i++) {
//            fact*=i;
//        }
//        System.out.printf("factorial of a given number is :%d",fact);
        //6.sum of table of 8
        int n=8;
        int sum=0;
        for (int i = 1; i<=10; i++) {
           sum=sum+n*i;
        }
        System.out.printf("sum of table of 8 is: %d",sum);
    }
}
