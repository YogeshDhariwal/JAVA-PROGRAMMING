package LOOPS;
import java.util.Scanner;
public class switchcase2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of a person");
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to be A adult");
                break;
            case 23:
                System.out.println("you are going to join a job");
                break;
            case 60:
                System.out.println("you are going to retire ");
                break;
            default:
                System.out.println("enjoy your life");
        }
    }
}
