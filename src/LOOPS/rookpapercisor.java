package LOOPS;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class rookpapercisor {
    public static void main(String[] args) {
        RandomGenerator rand=new RandomGenerator() {
            @Override
            public long nextLong() {
                return 0;
            }
        };
        int computerturn=rand.nextInt();
        System.out.println("enter 0 for choosing rock");
        Scanner sc=new Scanner(System.in);
        int myturn=sc.nextInt();



    }


}
