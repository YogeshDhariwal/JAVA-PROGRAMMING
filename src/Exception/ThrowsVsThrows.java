package Exception;
/*throw keyword is used to throw exception explicitly by the programmer
* */

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "radius must be positive";
    }

    @Override
    public String getMessage() {
        return "radius must be positive";
    }
}

public class ThrowsVsThrows {

 public static double area(int r) throws NegativeRadiusException {
     if(r<0){
         throw new NegativeRadiusException();
     }
     double result=Math.PI*r*r;
     return result;
 }

//public static int divide(int a,int b) throws ArithmeticException{
//        int result=a/b;
//        return result;
//    }
    public static void main(String[] args) {
//      try {
//          int c = divide(5, 0);
//          System.out.println(c);
//      }
//      catch(Exception e){
//          System.out.println("exception "+e);
//      }
      try{
          double ar=area(-1);
          System.out.println(ar);
      }
      catch(Exception e){
          System.out.println("Exception");
          System.out.println(e);
      }
    }
}
