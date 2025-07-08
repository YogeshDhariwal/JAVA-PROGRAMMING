package AwT_JAVA;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class YFrame extends Frame{
    public YFrame(){
        Frame frame=new Frame("new frame");
        frame.setSize(400,400);
        frame.setVisible(true);

        Button button=new Button(" Click Me");
        button.setBounds(40,100,200,100);
        button.setBackground(Color.red);
        button.setLabel("CLICK TO SUBMIT");

         TextField textField=new TextField("WRITE COMMENTS...",5);
         textField.setBounds(40,200,300,100);
         textField.setBackground(Color.cyan);

        Clipboard clipboard=new Clipboard("check if you done it");
      

        frame.setLayout(null);
        frame.add(button);
        frame.add(textField);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

public class Awt_3 {
    public static void main(String[] args) {
      YFrame f1=new YFrame();
    }
}
