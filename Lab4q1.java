import java.applet.*;
import java.awt.*;
/*<applet code="Lab4q1.class" width=800 height=900></applet>*/

import javax.xml.soap.Text;

public class Lab4q1 extends Applet {
    Label lb1 = new Label("Enter your name: ");
    TextField t1 = new TextField(25);

    public void init() {
//    t1.setEditable(true);
       
        add(lb1);
        add(t1);

    }

    public void start() {
        t1.requestFocus();
    }

    public void paint(Graphics g) {
        String text = t1.getText();
        g.drawString("Result:" + t1.getText(), 80, 50);
    }


}
