package ARRAYS;

public class practicesetarray {
    public static void main(String[] args) {
        // 1.array of 5 float and add them
//        float []arry={2.1f,4.2f,5.4f,6.4f,7.5f};
//        float sum=0;
//        for (int i = 0; i < arry.length; i++) {
//          sum=sum+arry[i];
//        }
//        System.out.printf("sum of the given array is :%f",sum);
        //****** 2.find a integer is present in a array or not
//        int [] arry={2,4,5,78,10};
//        int n=1;
//        for (int i = 0; i < arry.length; i++) {
//            if(n==arry[i]){
//                System.out.printf("integer found at index: %d",i);
//                break;
//            }
//            else{
//                System.out.printf("element is not present at index: %d",i);
//                System.out.println()
//            }
//        }
        // 3. calculate average marks from an array containing marks for stdent i physics
//        float[] marks={45.5f,50f,60f,70f,65f};
//        float sum=0;
//        for(float element:marks){
//            sum=sum+element;
//        }
//        System.out.println("the valu of average marks is"+sum/marks.length);
        //4.add matrices of siz 2*3
//        int [][]mat1={{2,4,6},
//                      {8,10,12}};
//        int [][] mat2={{3,6,9},
//                       {12,15,18}};
//        int [][]result={{0,0,0},
//                        {0,0,0}};
//        for(int i = 0; i < mat1.length; i++) {
//            for(int j = 0; j < mat1[i].length; j++) {
//                 result[i][j]=mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j] +"  ");
//            }
//            System.out.println();
//        }
           //5. wap to reverse array
//        int []arr=new int[]{2,5,7,8,9};
//        for (int i =arr.length-1; i >=0; i--) {
//            System.out.println(arr[i]);
//        }
//      int a=Math.floorDiv(arr.length,2);
//        for (int i = 0; i < a; i++) {
//           // swapping
//           int temp=arr[i];
//           arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//        for(int element: arr){
//            System.out.println(element);
//        }
        // 6.wap to find max element in array
//        int [] arr=new int[]{300,50,800,900,10};
//        int max=arr[0];
//        int a=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//                 a=i;
//            }
//        }
//        System.out.printf("maximum element is found at index %d is: %d",a,max);
        //7.finding minimum element
//        int [] arr=new int[]{300,50,800,9,10};
//        int min=arr[0];
//        int a=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min=arr[i];
//                a=i;
//            }
//        }
//        System.out.printf("minimum element is found at index %d is: %d",a,min);
        //8.wap to find a array is sorted or not
        int []arr=new int[]{3,10,50,20};
        for (int i = 0; i < arr.length; i++) {
           if( arr[i]>arr[i+1]){
               System.out.println("array is not sorted");
               break;
           }
           else{
               System.out.println("array is sorted");
           }
        }
    }
}
