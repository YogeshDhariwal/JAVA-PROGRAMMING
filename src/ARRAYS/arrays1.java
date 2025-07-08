package ARRAYS;
// array can be of different  datatype int,float,string,char
public class arrays1 {
    public static void main(String[] args) {
        int [] arry; // declare
       int [] arr=new int[5];// declare and memory allocate
        int[] marks={3,6,7,8,9};// declare and initialise
      int []m={3,5,6,7,8,9};// declare,memory allocate,initialise
        System.out.println(m[4]);
        System.out.println(m.length);
        for(int i = 0; i < m.length; i++) {
            System.out.printf(" %d ",m[i]);
        }
        // for each loops is best way to traversal of array
        for(int elements: m){
            System.out.println(elements);
        }
    }
}
