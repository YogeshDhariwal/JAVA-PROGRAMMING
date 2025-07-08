package METHODS;

public class Recurssion {
    static int factorial(int n){
       if(n==0 || n==1) {// base condition
           return 1;
       }
       return n*factorial(n-1);
    }
    static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int a=8;
       int result= factorial(a);
        System.out.println("the factorial of a given number is: "+result);
        int r=fibonacci(a);
        System.out.printf("the integer at index %d is %d :",a,fibonacci(a));
    }
}
