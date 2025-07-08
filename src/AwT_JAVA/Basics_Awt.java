package AwT_JAVA;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class MyButton extends Button{
//    public MyButton(String s1){
//        System.out.println(s1);
//    }
//
//    @Override
//    public void setBackground(Color c) {
//        super.setBackground(c);
//    }
//}
//     using extend
// class MyFrame extends Frame{
//     public MyFrame(){
//         setSize(200,300);
//         setVisible(true);
//
//     }
//}
class MyFrame implements WindowListener {
    public MyFrame(){
        Frame frame=new Frame("hello frame component");
        /* 2. addition of button in a frame*/

        Button button=new Button("click me");
        button.setBounds(100,150,70,70);
      //  button.setVisible(true);
        button.setBackground(Color.red);
        /*  3. adding labels to frame*/
        Label label=new Label("hello label",2);
        label.setBounds(50,75,150,70);
        label.setBackground(Color.green);

        /*   adding textfield  to the frame*/
        TextField textField =new TextField("comments...",4);
        textField.setBounds(150,200,100,50);
        textField.setText("comments");

     //   textField.setBackground(Color.cyan);

        frame.add(label);
        frame.add(button);/*   used to add button to frame*/
        frame.add(textField);
           frame.setLayout(null); /* means the component doesn't take whole layout but set as given dimension*/

      frame.setSize(200,300);
      frame.setVisible(true);
      /*  adding event listener means add event to a frame */
//      frame.addWindowListener(new WindowAdapter() {
//          @Override
//          public void windowClosing(WindowEvent e) {
//          /*  dispose used to close the window after event*/
//              frame.dispose();
//              System.out.println(e);
//          }
//      });

     frame.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing");
        Frame frame=(Frame)e.getSource();
        frame.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deactivated");
    }
}
public class Basics_Awt {
    public static void main(String[] args) {
//       MyButton b1=new MyButton("OK");
//        b1.setBackground(Color.red);
//        System.out.println(b1);
//        System.out.println( b1.getBackground());
//        System.out.println(b1.getName());
//        b1.addNotify();
//        System.out.println(b1);

       //  new MyFrame();
        MyFrame f1=new MyFrame();
    }
}
