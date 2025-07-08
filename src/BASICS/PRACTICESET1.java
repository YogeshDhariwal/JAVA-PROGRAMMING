package BASICS;

import java.util.Scanner;
public class PRACTICESET1 {
    public static void main(String[] args) {
//     1.   float a=7/4.0f*9/2.0f;
//        System.out.println(a);
        //2. finding grade by adding 8 in it
//        char grade='B';
//        grade=(char)(grade+8);
//        System.out.println(grade);
        // 3.use comparision operator to find out whether a given number is greater than the user
        // entered or not
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a=sc.nextInt();
        int b=10;
      if (a>b){
          System.out.println("Entered number is greater ");
      }
      else if(a==b){
          System.out.println("ENTERED NUMBER IS EQUAL ");
      }
      else {
          System.out.println("Entered number is smaller");
      }
    }

}
