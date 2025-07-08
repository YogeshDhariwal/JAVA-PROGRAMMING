package OOPS.PracticeSets;
class Cylinder{
    private int radius;
    private int height;
//    public void Setd(int radius,int height) {
//        this.radius=radius;
//        this.height=height;
//    }
    public Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
    public void getd(){
        System.out.println("the radius of cylinder is:"+radius );
        System.out.println("the height of cylinder is:"+height );
    }
public void area(){
    System.out.println("Area of cylinder is:"+3.14*radius*radius);
}
public void perimeter(){
        int p=(4*radius)+(2*height);
    System.out.println("perimeter of cylinder is:"+p);
}
}
public class practiceset2 {
    public static void main(String[] args) {
         Cylinder c1=new Cylinder(4,5);
         c1.getd();
         c1.perimeter();
         c1.area();
    }
}
