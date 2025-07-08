package BASICS;

import java.util.Scanner;
public class Userinput05 {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc=new Scanner(System.in);
//        System.out.print("the 1 number entered by user is:");
//            int a=sc.nextInt();
//        System.out.print("the 2 number entered by user is:");
//        int b=sc.nextInt();
//       int sum=a+b;
//        System.out.print("the sum of entered two number is:");
//        System.out.println(sum);
//        boolean b=sc.hasNextInt();
//        System.out.println(b);
//        String str=sc.next();// for single word
        String str=sc.nextLine();
        System.out.println(str);
    }
}
