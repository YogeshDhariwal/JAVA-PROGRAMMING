package LOOPS;
import java.util.Scanner;
public class practicset2 {
    public static void main(String[] args) {
        // 1. student pass or fail - total 40% and 33% in each subject
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter total marks");
//        float totalmarks=sc.nextInt();
//        System.out.println("Enter marks for subject 1:");
//        float subject1=sc.nextInt();
//        System.out.println("Enter marks for subject 2:");
//        float subject2=sc.nextInt();
//        System.out.println("Enter marks for subject 3:");
//        float subject3=sc.nextInt();
//        float percentage=(subject1+subject2+subject3)/totalmarks*100;
//        if(percentage>=40){
//            System.out.println("PASS");
//            System.out.println(percentage);
//        }
//        else {
//            System.out.println("FAIL");
//        }
//        int numberofsubject=3;
//        float markssubject=totalmarks/numberofsubject;
//        if((subject1/markssubject*100)>=33){
//            System.out.println("PASS IN SUBJECT 1");
//        }
//        else {
//            System.out.println("FAIL IN SUBJECT 1");
//        }
//        if((subject2/markssubject*100)>=33){
//            System.out.println("PASS IN SUBJECT 2");
//        }
//        else{
//            System.out.println("FAIL IN SUBJECT 2");
//        }
//        if((subject2/markssubject*100)>=33){
//            System.out.println("PASS IN SUBJECT 3");
//        }
//        else{
//            System.out.println("FAIL IN SUBJECT 3");
//        }
        // 2.calculate income text
        System.out.println("Enter your income");
        float income=sc.nextFloat();
        if(income>=250000 && income<=500000){
            float tax1=income*5/100;
            System.out.printf("you have to pay tAX: %f\n",tax1);
        }
        else if(income>500000 && income<=1000000){
            float tax2=income*20/100;
            System.out.printf("you have to pay tax : %f\n",tax2);
        }
        else if(income>1000000){
            float tax3=income*30/100;
            System.out.printf("you have to pay text :%f\n",tax3);
        }
        else{
            System.out.println("YOU ARE EXCLUDED FROM TEXT PAYING");
        }
    }

}
