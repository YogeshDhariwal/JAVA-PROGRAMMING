package METHODS;

public class MethodsOverloading {
    static void greeting(){
        System.out.println("hello good morning");
    }
    static void greeting(int a){// a is parameter
        System.out.println("hello good morning :"+a);
    }
    static void refrence(int []a){
        a[0]=1;
    }
    public static void main(String[] args) {
      int []marks={3,5,6,7,9};// marks store address of the array
      refrence(marks);
        System.out.println(marks[0]);// m[0] CHANGES it changes the array
        greeting();
        greeting(3);// 3 is actual argument
    }

}
