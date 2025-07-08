package AwT_JAVA;


import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class My1Frame implements  WindowListener {
    public My1Frame(){
        Frame frame=new Frame("made by yogesh dhariwal");
        Button button=new Button();
        button.setBounds(200,50,30,30);
        button.setBackground(Color.red);

        Label label=new Label("hello label");
        label.setBounds(200,100,30,30);
        label.setBackground(Color.green);

        Checkbox checkbox =new Checkbox("check me");
        checkbox.setBounds(200,150,30,30);
        checkbox.setBackground(Color.MAGENTA);

        TextField textField=new TextField("WRITE COMMENTS ");
        textField.setBounds(200,200,30,30);
        textField.setBackground(Color.YELLOW);

        frame.add(textField);
        frame.add(checkbox);
        frame.add(label);
        frame.add(button);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.addWindowListener(this);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window opened");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
        Frame frame=(Frame)e.getSource();
        frame.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }
}

public class PracticeAwt {
    public static void main(String[] args) {
        My1Frame obj=new My1Frame();
    }
}
