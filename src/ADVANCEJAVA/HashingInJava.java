package ADVANCEJAVA;

import java.util.HashSet;

public class HashingInJava {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(3,.6f);
        // same methods as other /** loaf factor is calculate to increase the size of hashtable at which moment
        h1.add(5);
        h1.add(4);
        h1.add(3);
        h1.add(18);
        h1.add(5);
        System.out.println(h1);// output 18 ,3,4,5
     //   System.out.println( h1.toString());// same hashset
        System.out.println(h1.size());
    }
}
