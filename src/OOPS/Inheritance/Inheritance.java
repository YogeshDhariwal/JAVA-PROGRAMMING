package OOPS.Inheritance;
class BASE{
int x;

    public void setX(int x) {
        this.x = x;
    }
    public void getX() {
        System.out.println("value of x is "+x);
    }
}
class Derived extends  BASE{
    int y;

    public void getY() {
        System.out.println(" value of y is "+y);
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
Derived d1=new Derived();
d1.setY(5);
d1.setX(3);
d1.getX();
d1.getY();
    }
}
