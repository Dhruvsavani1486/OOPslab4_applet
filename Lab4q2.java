import java.applet.*;
import java.awt.*;
/*<applet code="Lab4q2.class" width=800 height=900></applet>*/
public class Lab4q2 extends Applet {

    Choice color=new Choice();
    public void init()
    {
        color.addItem("White");
        color.addItem("Black");
        color.addItem("Red");
        color.addItem("Blue");
        color.addItem("Yellow");
        color.addItem("Green");
        color.addItem("Pink");
        add(color);
    }

public void paint(Graphics g)
{
    int x=color.getSelectedIndex();
    switch (x){
        case 0:setBackground(Color.white);
                break;
        case 1:setBackground(Color.black);
            break;
        case 2:setBackground(Color.red);
            break;
        case 3:setBackground(Color.blue);
            break;
        case 4:setBackground(Color.yellow);
            break;
        case 5:setBackground(Color.green);
            break;
        case 6:setBackground(Color.pink);
            break;

    }
    repaint();
}

}