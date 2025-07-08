package OOPS.PracticeSets;
class Circle{
    int radius;
   public Circle(int radius){
        this.radius=radius;
        System.out.println("radius of circle is:"+radius);
    }
    public void area(){
        System.out.printf("area of circle with given radius is :%f",3.14*radius*radius);
        System.out.println();
    }
        }
        class Cylinders extends  Circle {
      int height;
     public Cylinders(int height,int r){
         super(r);
         this.height=height;
         System.out.printf("radius and height of cylinder is %d and %d",r,height);
         System.out.println();
     }
     public void volume(){
         System.out.printf("volume of cylinder with given radius and height is %f",3.14*radius*radius*height);
     }
        }
public class PracticeSet3 {
    public static void main(String[] args) {
        Cylinders c1=new Cylinders(2,4);
        c1.area();
        c1.volume();
    }
}
