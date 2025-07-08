package Files;
import java.io.*;

public class InputStreams {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("Files/f1");
            System.out.println(f1.read());
            System.out.println("hello file input stream");
        }
catch (Exception e){
    System.out.println(e);
}
    }
}
