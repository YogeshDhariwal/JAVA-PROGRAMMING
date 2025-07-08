package ARRAYS;

public class multidimesionalarray {
    public static void main(String[] args) {
        int [][] flat=new int[2][3];
        flat [0][0]=101;
        flat [0][1]=102;
        flat[0][2]=103;
        flat [1][0]=201;
        flat [1][1]=202;
        flat [1][2]=203;
        // display 2-d array using for loop
        System.out.println(flat.length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(flat[i][j]);
            }
        }
    }
}
