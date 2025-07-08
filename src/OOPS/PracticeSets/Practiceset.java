package OOPS.PracticeSets;
  class cellphone{
      public void ringing(){
          System.out.println("your phone is ringing");
      }
      public void vibrating(){
          System.out.println("your phone is vibrating");
      }
  }
  class Square{
      public int area(int a){
          return a*a;
      }
      public int perimeter(int s){
          return 4*s;
      }
      public void side(int a){
          System.out.println("sides of given square is:"+a);
      }
  }
  class Rectangle{
     int length;
     int breath;
     public void setdata(int l,int b){
          length=l;
          breath=b;
     }
     public void area(int l,int b){
         System.out.println("The area of rectangle is:"+l*b);
     }
     public void parameter(int l,int b){
         System.out.println("the perimeter of given rectangle is:"+2*(l+b));
     }
     public void getdata(){
         System.out.printf("the length of rectangle is %d and breath is %d ",length,breath);
     }
  }
public class Practiceset {
    public static void main(String[] args) {
//     cellphone p1=new cellphone();
//     p1.ringing();
//     p1.vibrating();
//        Square s1=new Square();
//        int sidelenght=5;
//        s1.side(sidelenght);
//      int p= s1.perimeter(sidelenght);
//        System.out.println("the perimeter of square is:"+p);
//     int a= s1.area(sidelenght);
//        System.out.println("the area of given square is:"+a);
        Rectangle r1=new Rectangle();
        r1.setdata(4,5);
        r1.getdata();
        r1.parameter(4,7);
        r1.area(4,7);

    }
}
