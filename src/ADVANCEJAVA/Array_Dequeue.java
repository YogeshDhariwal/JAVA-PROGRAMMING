package ADVANCEJAVA;
import java.util.*;
public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1=new ArrayDeque<>();
        // methods same as arraylist,linkedlist
        a1.add(5);
        a1.add(7);
        a1.add(8);
        System.out.println(a1);
        a1.addFirst(33);
        a1.addLast(21);
        System.out.println(a1);
        a1.removeFirst();
        a1.removeLast();
        System.out.println(a1);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
    }
}
