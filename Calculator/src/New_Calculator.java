import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class App {

    private static double num = 0;
    private static double ans = 0;
    private static int mod = 0;
    private static int cnt = 0;
    private static boolean sch = true;
    private static String s = new String("");
    private static String h = new String("");
    public static void main(String[] args) {

        Color c1 = new Color(245, 157, 127);
        Color c2 = new Color(38, 35, 34);
        Color c3 = new Color(181, 178, 168);

        Font f1 = new Font(null, 0, 32);
        Font f2 = new Font(null, 0, 20);
        Font f3 = new Font(null, Font.BOLD, 20);

        JFrame frame = new JFrame( "...CALCULATOR...");
        frame.setSize(210, 383);
        frame.getContentPane().setBackground(c2);
        frame.getColorModel();
        frame.setLocation(610, 300);
        frame.setResizable(false);

        JLabel l1 = new JLabel("History");
        l1.setBounds(210, 113, 190, 20);
        l1.setForeground(c1);
        l1.setFont(f2);

        JTextField tf = new JTextField();
        tf.setBounds(0, 0, 410, 100);
        tf.setBackground(Color.darkGray);
        tf.setForeground(c3);
        tf.setFont(f1);
        tf.setBorder(null);
        tf.setText(0 + "");

        JTextField hf1 = new JTextField();
        hf1.setBounds(210, 140, 190, 40);
        hf1.setBackground(c2);
        hf1.setForeground(c3);
        hf1.setBorder(null);

        JTextField hf2 = new JTextField();
        hf2.setBounds(210, 180, 190, 40);
        hf2.setBackground(c2);
        hf2.setForeground(c3);
        hf2.setBorder(null);

        JTextField hf3 = new JTextField();
        hf3.setBounds(210, 220, 190, 40);
        hf3.setBackground(c2);
        hf3.setForeground(c3);
        hf3.setBorder(null);

        JTextField hf4 = new JTextField();
        hf4.setBounds(210, 260, 190, 40);
        hf4.setBackground(c2);
        hf4.setForeground(c3);
        hf4.setBorder(null);

        JTextField hf5 = new JTextField();
        hf5.setBounds(210, 300, 190, 40);
        hf5.setBackground(c2);
        hf5.setForeground(c3);
        hf5.setBorder(null);

        JButton bcls = new JButton("Clear");
        JButton bans = new JButton("Ans");
        JButton babs = new JButton("±");
        JButton bper = new JButton("%");
        JButton bdev = new JButton("÷");
        JButton beql = new JButton("=");
        JButton badd = new JButton("+");
        JButton bsub = new JButton("-");
        JButton bpro = new JButton("×");
        JButton bdot = new JButton(".");
        JButton bdlt = new JButton("↵");
        JButton bAC = new JButton("AC");
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        
        bAC.setBounds(05, 100, 50, 50);
        bdot.setBounds(55, 300, 50, 50);
        babs.setBounds(55, 100, 50, 50);
        bdlt.setBounds(170, 00, 40, 100);
        bcls.setBounds(340, 117, 60, 20);
        bper.setBounds(105, 100, 50, 50);
        bdev.setBounds(155, 100, 50, 50);
        bpro.setBounds(155, 150, 50, 50);
        bsub.setBounds(155, 200, 50, 50);
        badd.setBounds(155, 250, 50, 50);
        bans.setBounds(105, 300, 50, 50);
        beql.setBounds(155, 300, 50, 50);
        b0.setBounds(5, 300, 50, 50);
        b1.setBounds(5, 250, 50, 50);
        b2.setBounds(55, 250, 50, 50);
        b3.setBounds(105, 250, 50, 50);
        b4.setBounds(5, 200, 50, 50);
        b5.setBounds(55, 200, 50, 50);
        b6.setBounds(105, 200, 50, 50);
        b7.setBounds(5, 150, 50, 50);
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
        // b9.setBackground(Color.red);
        // b9.setOpaque(true);
        // b9.setBorderPainted(false);
        // bdlt.setBorderPainted(false);
        bdlt.setBackground(new Color( 0, 0, 0, 30));
        bdlt.setOpaque(true);

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

        bcls.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hf1.setText(null);
                hf2.setText(null);
                hf3.setText(null);
                hf4.setText(null);
                hf5.setText(null);
                cnt = 0;
                frame.setSize(210, 383);
                bdlt.setBounds(170, 00, 40, 100);
            }
        });

        bdlt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(s.length()-1);
                s = sb.toString();
                tf.setText(s);
                sch = false;
            }
        });

        bdot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("0");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + ".");
            }
        });

        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "0");
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "1");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "2");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "3");
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "4");
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "5");
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "6");
            }
        });

        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "7");
            }
        });

        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "8");
            }
        });

        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(sch){
                    tf.setText("");
                    sch = false;
                }
                s = tf.getText();
                tf.setText(s + "9");
            }
        });

        bAC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("0");
                mod = 0;
                num = 0;
                ans = 0;
                h = "";
                sch = true;
            }
        });

        babs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ans = Double.parseDouble(tf.getText());
                ans *= -1;
                tf.setText(ans + "");
                num = 0;
            }
        });

        bper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                modifiar(s, mod);
                tf.setText(ans + "");
                mod = 1;
            }
        });

        bdev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                modifiar(s, mod);
                tf.setText(ans + "");
                mod = 2;
            }
        });

        bpro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                modifiar(s, mod);
                tf.setText(ans + "");
                mod = 3;
            }
        });

        bsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                modifiar(s, mod);
                tf.setText(ans + "");
                mod = 4;
            }
        });
                        
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                modifiar(s, mod);
                tf.setText(ans + "");
                mod = 5;
            }
        });
                        
        bans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(num + "");
                num = 0;
            }
        });

        beql.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s = tf.getText();
                modifiar(s, mod);
                num = ans;
                tf.setText(ans + "");
                mod = 0;
                h = h + " = " + ans;
                
                cnt++;
                if(cnt == 1){
                    hf1.setText(h);
                }else if(cnt == 2){
                    hf2.setText(h);
                }else if(cnt == 3){
                    hf3.setText(h);
                }else if(cnt == 4){
                    hf4.setText(h);
                }else if(cnt == 5){
                    hf5.setText(h);
                }else if(cnt > 5){
                    hf1.setText(hf2.getText());
                    hf2.setText(hf3.getText());
                    hf3.setText(hf4.getText());
                    hf4.setText(hf5.getText());
                    hf5.setText(h);
                }
                h = "";
                frame.setSize(410, 383);
                bdlt.setBounds(370, 00, 40, 100);

            }
        });

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
        frame.add(tf);
        frame.getContentPane().add(new Shapes());
        
        frame.setVisible(true);
    }

    private static void modifiar(String ms, int m){
        double ii = Double.parseDouble(ms);
        if(m == 0){
            ans = ii;
            h = h + ii;
        }else if(m == 1){
            ans = (ans/100)*ii;
            h = h + "%" + ii;
        }else if(m == 2){
            ans /= ii;
            h = h + "÷" + ii;
        }else if(m == 3){
            ans *= ii;
            h = h + "×" + ii;
        }else if(m == 4){
            ans -= ii;
            h = h + "-" + ii;
        }else if(m == 5){
            ans += ii;
            h = h + "+" + ii;
        }

        long temp;
        ans *= 100000000;
        temp = (long)ans;
        if(ans-temp > 0.5){
            temp++;
        }
        ans = (double)temp;
        ans /= 100000000;
        sch = true;
    }
}
