package OOPS.Basic;
class AC{
    int a;

    public AC(int a){
        System.out.println("the value is "+a);
    }
    public AC(){
        System.out.println("i am a base class constructor");
    }
}
class b extends AC{
    int c;

    public b(){
        System.out.println("i am a derived class constructor");
//       super(int a,int b);
    }
    public b(int c){
        super(c);
      this.c=c;
        System.out.println("derived c "+c);
    }


}
public class thisandsuper {
    public static void main(String[] args) {
//        a obj1=new a(3,5);
  b obj=new b(2);

    }
}
