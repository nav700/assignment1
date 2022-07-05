import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
public class myapplet extends Applet {
        Label l1,l2;
    
       TextField t1,t2;
       Button b1;
       public void init()
       {
           l1=new Label("first number");
           l2=new Label("second number");
           t1=new TextField();
           t2=new TextField();
           b1=new Button("Add");
           setLayout(null);
           l1.setBounds(50, 30, 100, 20);
           l2.setBounds(90, 60, 100, 20);
           t1.setBounds(150, 50, 100, 20);
           t2.setBounds(150,100,100,20);
           b1.setBounds(180,100,100,20);
           add(t1);
           add(t2);
           add(l1);
           add(l2);
           add(b1);
      }
       
       
}