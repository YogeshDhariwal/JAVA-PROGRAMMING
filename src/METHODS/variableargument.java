package METHODS;

public class variableargument {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    // we want to add on more parameter then this method will not work
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int ...arr){// ... will form array of parameter
        // available as int[]arr
        int sum=0;
        for(int element:arr){
           sum=sum+element;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("solving varargs tutorial");
        System.out.println("the sum of 2 and 3 :"+sum(2,3));
        System.out.println("the sum of 2 and 3,6 :"+sum(2,3,6));

    }
}
