package METHODS;

public class Practiceset {
    static void table(int a){

        for (int i = 1; i <=10; i++) {

            System.out.println(a*i);
        }
    }
    //2. printing pattern
    static void pattern(int r){
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //3. sum of n natural number
    static int sum(int n){
        if (n == 0) {
            System.out.println("0 is not a natural number ");
            return -1;
        }
        if(n==1){
            return 1;
        }
      return n+sum(n-1);
    }
    // 4. printing pattern
    static void patt(int c){
        for(int i = 0; i < c; i++) {
            for (int j =c-i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //5.pattern printing using recursion
    static void pattern1(int r){

        if(r>0){
            pattern1(r-1);
            for (int i = 0; i < r; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //6.pattern printing using recursion
    static void pattern2(int r){
        if(r>0){
//            pattern2(r+1);

            for (int i =r; i >0; i--) {
                System.out.print("*");
            }

        }
    }
    public static void main(String[] args) {
        // 1. table of a given integer
//        int n=8;
//        table(8);
//        pattern(4);
//        int n=6;
//        int nat=sum(n);
//        System.out.printf("the sum of %d natural number is:%d ",n,sum(n));
//        patt(6);
//        pattern1(5);
        pattern2(4);

    }
}
