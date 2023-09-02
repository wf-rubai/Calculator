import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Shapes extends JComponent{

    public void paint(Graphics g){
        Color c1 = new Color(252, 171, 121, 200);
        Color c2 = new Color(92, 90, 90, 130);
        Color c3 = new Color(92, 90, 90);

        Graphics2D g1 = (Graphics2D) g;
        
        
        g1.setColor(c2);
        g1.fillOval(06, 101, 48, 48);
        g1.fillOval(56, 101, 48, 48);
        g1.fillOval(106, 101, 48, 48);
        
        g1.setColor(c1);  
        g1.fillOval(156, 101, 48, 48);
        g1.fillOval(156, 151, 48, 48);
        g1.fillOval(156, 201, 48, 48);
        g1.fillOval(156, 251, 48, 48);
        g1.fillOval(106, 301, 48, 48);
        g1.fillOval(156, 301, 48, 48);

        g1.setColor(c3);
        g1.fillOval(56, 301, 48, 48);
        g1.fillOval(06, 301, 48, 48);
        g1.fillOval(06, 251, 48, 48);
        g1.fillOval(56, 251, 48, 48);
        g1.fillOval(106, 251, 48, 48);
        g1.fillOval(06, 201, 48, 48);
        g1.fillOval(56, 201, 48, 48);
        g1.fillOval(106, 201, 48, 48);
        g1.fillOval(06, 151, 48, 48);
        g1.fillOval(56, 151, 48, 48);
        g1.fillOval(106, 151, 48, 48);
    }
}
