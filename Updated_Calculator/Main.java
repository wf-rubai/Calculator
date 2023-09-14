import java.awt.*;
import javax.swing.*;

public class Main extends JButton {

    protected static double ans = 0;
    protected static double num = 0;
    protected static int mod = 0;
    protected static int cnt = 0;
    protected static boolean sch1 = true;
    protected static boolean sch2 = true;
    protected static String h = new String("");
    protected static String c = new String("");
    protected static JLabel hf1, hf2, hf3, hf4, hf5;
    protected static JTextField tf1, tf2;
    protected static JFrame frame;
    protected static BAction bdlt;

    protected Main(String s){
        super(s);
    }

    public static void main(String[] args) {

        Color c1 = new Color(245, 157, 127);
        Color c2 = new Color(38, 35, 34);
        Color c3 = new Color(181, 178, 168);

        Font f1 = new Font(null, 0, 32);
        Font f2 = new Font(null, 0, 20);
        Font f3 = new Font(null, Font.BOLD, 20);

        JFrame frame = new JFrame( "...CALCULATOR...");
        Main.frame = frame;
        frame.setSize(204, 377);
        frame.getContentPane().setBackground(c2);
        frame.getColorModel();
        frame.setLocation(610, 300);
        frame.setResizable(false);
        // Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        // int y = (int) (size.getHeight()/2);
        // int x = (int) (size.getWidth()/2);
        // frame.setLocation(x, y);

        JLabel l1 = new JLabel("History");
        l1.setBounds(210, 113, 190, 20);
        l1.setForeground(c1);
        l1.setFont(f2);

        JTextField tf1= new JTextField();
        Main.tf1 = tf1;
        tf1.setBounds(0, 40, 410, 60);
        tf1.setBackground(Color.darkGray);
        tf1.setForeground(c3);
        tf1.setFont(f1);
        tf1.setBorder(null);
        tf1.setText("0");

        JTextField tf2= new JTextField();
        Main.tf2 = tf2;
        tf2.setBounds(0, 0, 410, 40);
        tf2.setBackground(Color.darkGray);
        tf2.setForeground(Color.gray);
        tf2.setFont(f2);
        tf2.setBorder(null);
        tf2.setText("");

        JLabel hf1 = new JLabel("");
        JLabel hf2 = new JLabel("");
        JLabel hf3 = new JLabel("");
        JLabel hf4 = new JLabel("");
        JLabel hf5 = new JLabel("");

        Main.hf1 = hf1;
        Main.hf2 = hf2;
        Main.hf3 = hf3;
        Main.hf4 = hf4;
        Main.hf5 = hf5;

        hf1.setBounds(210, 140, 190, 40);
        hf2.setBounds(210, 180, 190, 40);
        hf3.setBounds(210, 220, 190, 40);
        hf4.setBounds(210, 260, 190, 40);
        hf5.setBounds(210, 300, 190, 40);
        
        hf1.setBackground(c2);
        hf2.setBackground(c2);
        hf3.setBackground(c2);
        hf4.setBackground(c2);
        hf5.setBackground(c2);
        
        hf1.setForeground(c3);
        hf2.setForeground(c3);
        hf3.setForeground(c3);
        hf4.setForeground(c3);
        hf5.setForeground(c3);

        hf1.setBorder(null);
        hf2.setBorder(null);
        hf3.setBorder(null);
        hf4.setBorder(null);
        hf5.setBorder(null);
        
        BAction bcls = new BAction("Clear");
        BAction bans = new BAction("Ans");
        BAction babs = new BAction("±");
        BAction beql = new BAction("=");
        BAction bdlt = new BAction("↵");
        BAction bAC = new BAction("AC");
        
        BOperator bper = new BOperator("%");
        BOperator bdev = new BOperator("÷");
        BOperator bpro = new BOperator("×");
        BOperator bsub = new BOperator("-");
        BOperator badd = new BOperator("+");
        
        BDigit bdot = new BDigit(".");
        BDigit b0 = new BDigit ("0");
        BDigit b1 = new BDigit ("1");
        BDigit b2 = new BDigit ("2");
        BDigit b3 = new BDigit ("3");
        BDigit b4 = new BDigit ("4");
        BDigit b5 = new BDigit ("5");
        BDigit b6 = new BDigit ("6");
        BDigit b7 = new BDigit ("7");
        BDigit b8 = new BDigit ("8");
        BDigit b9 = new BDigit ("9");
        
        bAC.setBounds(0, 100, 55, 50);
        bdot.setBounds(55, 300, 50, 50);
        babs.setBounds(55, 100, 50, 50);
        bdlt.setBounds(164, 40, 40, 60);
        bcls.setBounds(340, 117, 60, 20);
        bper.setBounds(105, 100, 50, 50);
        bdev.setBounds(155, 100, 50, 50);
        bpro.setBounds(155, 150, 50, 50);
        bsub.setBounds(155, 200, 50, 50);
        badd.setBounds(155, 250, 50, 50);
        bans.setBounds(105, 300, 50, 50);
        beql.setBounds(155, 300, 50, 50);
        b0.setBounds(0, 300, 55, 50);
        b1.setBounds(0, 250, 55, 50);
        b2.setBounds(55, 250, 50, 50);
        b3.setBounds(105, 250, 50, 50);
        b4.setBounds(0, 200, 55, 50);
        b5.setBounds(55, 200, 50, 50);
        b6.setBounds(105, 200, 50, 50);
        b7.setBounds(0, 150, 55, 50);
        b8.setBounds(55, 150, 50, 50);
        b9.setBounds(105, 150, 50, 50);

        bans.setFont(f2);
        beql.setFont(f3);
        badd.setFont(f3);
        bsub.setFont(f3);
        bpro.setFont(f3);
        bdev.setFont(f3);
        bper.setFont(f3);
        babs.setFont(f3);
        bdot.setFont(f2);
        bdlt.setFont(f3);
        bAC.setFont(f2);
        b0.setFont(f2);
        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);
        
        bcls.setForeground(Color.lightGray);
        babs.setForeground(Color.white);
        bper.setForeground(Color.white);
        bdlt.setForeground(Color.white);
        bdot.setForeground(Color.white);
        bdev.setForeground(Color.white);
        bpro.setForeground(Color.white);
        bsub.setForeground(Color.white);
        badd.setForeground(Color.white);
        beql.setForeground(Color.white);
        bans.setForeground(Color.white);
        bAC.setForeground(Color.white);
        b0.setForeground(Color.white);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        
        // bdlt.setBackground(new Color( 0, 0, 0, 30));
        // bdlt.setOpaque(true);
        Main.bdlt = bdlt;

        babs.setBorder(null);
        bper.setBorder(null);
        bdev.setBorder(null);
        bpro.setBorder(null);
        bsub.setBorder(null);
        badd.setBorder(null);
        bans.setBorder(null);
        beql.setBorder(null);
        bcls.setBorder(null);
        bdot.setBorder(null);
        bdlt.setBorder(null);
        bAC.setBorder(null);
        b0.setBorder(null);
        b1.setBorder(null);
        b2.setBorder(null);
        b3.setBorder(null);
        b4.setBorder(null);
        b5.setBorder(null);
        b6.setBorder(null);
        b7.setBorder(null);
        b8.setBorder(null);
        b9.setBorder(null);
        
        frame.add(bcls);
        frame.add(babs);
        frame.add(bper);
        frame.add(bdev);
        frame.add(bans);
        frame.add(beql);
        frame.add(badd);
        frame.add(bsub);
        frame.add(bpro);
        frame.add(bdot);
        frame.add(bdlt);
        frame.add(hf1);
        frame.add(hf2);
        frame.add(hf3);
        frame.add(hf4);
        frame.add(hf5);
        frame.add(bAC);
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(l1);
        frame.add(tf1);
        frame.add(tf2);
        frame.getContentPane().add(new Shapes());
        
        frame.setVisible(true);
    }
}
