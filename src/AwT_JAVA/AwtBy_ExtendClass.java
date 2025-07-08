package AwT_JAVA;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class NewFrame extends Frame{
    public NewFrame(){
        System.out.println("hello welcome to the new frame created by me");
         Button button=new Button("click me");
         button.setBounds(100,100,100,100);
         button.setBackground(Color.red);
         add(button);
         setLayout(null);
    }

}

public class AwtBy_ExtendClass {
    public static void main(String[] args) {
        NewFrame newFrame=new NewFrame();
        newFrame.setSize(400,400);
        newFrame.setVisible(true);


    }

}
