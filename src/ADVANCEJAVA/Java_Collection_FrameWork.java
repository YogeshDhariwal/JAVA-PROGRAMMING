package ADVANCEJAVA;
 import java.util.ArrayList;
 import java.util.Collection;
/* COLLECTION(INTERFACE) is a group of object store in efficient way
 * IT contain classes,interface,static methods
* why collection?
/*  Efficient storage and better manipulation of data in java
* */
public class Java_Collection_FrameWork {
    public static void main(String[] args) {
//        ArrayList- resizeable array
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(3);
        l1.add(2);
        l1.add(5);
        l1.add(3);
//        System.out.println(l1.size());
//        System.out.println(l1);
//        l1.add(0,4);
//        System.out.println(l1);
//        System.out.println(l1.size());
//        l1.add(0,4);
//        System.out.println(l1);
//        System.out.println(l1.size());
        System.out.println(l1.indexOf(4));// shows only index of first occurence
        System.out.println(l1.indexOf(3));
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.contains(2));
        System.out.println(l1.contains(0));
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(13);
        l2.add(12);
        l2.add(15);
        l2.add(13);
        System.out.println(l1.equals(l2));//list l1=l2 exact same
//        l1.sort(1);
        System.out.println(l1);
        l1.addAll(1,l2);// add another list to other
        System.out.println(l1);
        l1.clear();
        System.out.println("cleared list"+l1);// clear all element from the list
        System.out.println(l1.clone());// return copy of list
        
        //        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }
    }
}
