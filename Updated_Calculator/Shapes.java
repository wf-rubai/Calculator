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
        
        g1.setColor(c1);  
        
        g1.fillRect(156, 101, 48, 48);
        g1.fillRect(156, 151, 48, 48);
        g1.fillRect(156, 201, 48, 48);
        g1.fillRect(156, 251, 48, 48);
        g1.fillRect(106, 301, 48, 48);
        g1.fillRect(156, 301, 48, 48);
        
        g1.setColor(c2);
        g1.fillRect(0, 101, 54, 48);
        g1.fillRect(56, 101, 48, 48);
        g1.fillRect(106, 101, 48, 48);
        
        
        g1.setColor(c3);
        g1.fillRect(56, 301, 48, 48);
        g1.fillRect(0, 301, 54, 48);
        g1.fillRect(0, 251, 54, 48);
        g1.fillRect(56, 251, 48, 48);
        g1.fillRect(106, 251, 48, 48);
        g1.fillRect(0, 201, 54, 48);
        g1.fillRect(56, 201, 48, 48);
        g1.fillRect(106, 201, 48, 48);
        g1.fillRect(0, 151, 54, 48);
        g1.fillRect(56, 151, 48, 48);
        g1.fillRect(106, 151, 48, 48);
        g1.fillRect(352, 117, 38, 20);
        g1.fillOval(342, 117, 20, 20);
        g1.fillOval(380, 117, 20, 20);
    }
}