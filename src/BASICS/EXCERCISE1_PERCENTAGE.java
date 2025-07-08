package BASICS;

import java.util.Scanner;
public class EXCERCISE1_PERCENTAGE {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks");
        int totalmarks=sc.nextInt();
        System.out.println("Enter the marks of subject 1:");
       float m1=sc.nextFloat();
        System.out.println("Enter the marks of subject 2:");
        float m2=sc.nextFloat();
        System.out.println("Enter the marks of subject 3:");
        float m3=sc.nextFloat();
        System.out.println("Enter the marks of subject 4:");
        float m4=sc.nextFloat();
        System.out.println("Enter the marks of subject 5:");
        float m5=sc.nextFloat();
        float percentage= ((m1+m2+m3+m4+m5)/totalmarks)*100;
        System.out.println("THE PERCENTAGE OF GIVEN STUDENTS MARKS IS:");
        System.out.println(percentage);

    }
}
