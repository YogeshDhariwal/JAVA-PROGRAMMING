package ADVANCEJAVA;
 import java.util.*;

public class linklist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        // some methods are same as arraylist
        l1.add(5);
        l1.add(6);
        l1.add(4);
        l1.add(0,11);
        System.out.println(l1);
        l1.size();
        l1.addLast(8);
        System.out.println(l1);
        l1.set(1,7);
        System.out.println(l1);
    }
}
