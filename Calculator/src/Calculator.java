import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class App {

    public static double num = 0;
    public static double ans = 0;
    public static double mod = 0;
    public static void main(String[] args) throws Exception {

        Color c1 = new Color(245, 157, 127);
        Color c2 = new Color(38, 35, 34);

        Font f1 = new Font(null, 0, 32);
        Font f2 = new Font(null, 0, 20);
        Font f3 = new Font(null, Font.BOLD, 20);

        JFrame frame = new JFrame( "...CALCULATOR...");
        frame.setLayout(null);;
        frame.setSize(210, 380);
        frame.getContentPane().setBackground(c2);

        JTextField tf = new JTextField();
        tf.setBounds(0, 0, 210, 100);
        tf.setBackground(Color.darkGray);
        tf.setForeground(Color.white);
        tf.setFont(f1);
        tf.setBorder(null);
        tf.setText("CALCULATOR");
        frame.add(tf);

        JButton bAC = new JButton("AC");
        bAC.setBounds(05, 100, 50, 50);
        bAC.setFont(f2);
        bAC.setBackground(Color.black);
        bAC.setForeground(Color.lightGray);
        bAC.setBorder(null);
        bAC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(null);
                num = 0;
                ans = 0;
            }
        });
        frame.add(bAC);

        JButton babs = new JButton("±");
        babs.setBounds(55, 100, 50, 50);
        babs.setFont(f3);
        babs.setBackground(Color.red);
        babs.setForeground(Color.lightGray);
        babs.setBorder(null);
        babs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ans == 0){
                    ans = num;
                }
                ans *= -1;
                tf.setText(Double.toString( ans));
                num = 0;
            }
        });
        frame.add(babs);

        JButton bper = new JButton("%");
        bper.setBounds(105, 100, 50, 50);
        bper.setFont(f3);
        bper.setBackground(Color.BLACK);
        bper.setForeground(Color.lightGray);
        bper.setBorder(null);
        bper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(mod == 2){
                    ans /= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                }
                ans = num;
                tf.setText(Double.toString( num));
                num = 0;
                mod = 1;
            }
        });
        frame.add(bper);

        JButton bdev = new JButton("÷");
        bdev.setBounds(155, 100, 50, 50);
        bdev.setFont(f3);
        bdev.setBackground(Color.BLACK);
        bdev.setForeground(c1);
        bdev.setBorder(null);
        bdev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(ans != 0){
                    tf.setText(Double.toString( ans));
                    mod = 2;
                }else{
                    ans = num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                    mod = 2;
                }
            }
        });
        frame.add(bdev);

        JButton b7 = new JButton("7");
        b7.setBounds(0, 155, 50, 50);
        b7.setFont(f2);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.white);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 7;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 7;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(55, 150, 50, 50);
        b8.setFont(f2);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.white);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 8;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 8;
                    tf.setText(Double.toString(num));
                }
            }
        });
        frame.add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(105, 150, 50, 50);
        b9.setFont(f2);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.white);
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 9;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 9;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b9);

        JButton bpro = new JButton("×");
        bpro.setBounds(155, 150, 50, 50);
        bpro.setFont(f3);
        bpro.setBackground(Color.BLACK);
        bpro.setForeground(c1);
        bpro.setBorder(null);
        bpro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(mod == 2){
                    ans /= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                }
                if(ans == 0){
                    ans++;
                }
                if(num == 0){
                    num++;
                }
                
                ans *= num;
                tf.setText(Double.toString( ans));
                num = 0;
                mod = 3;
            }
        });
        frame.add(bpro);

        JButton b4 = new JButton("4");
        b4.setBounds(5, 200, 50, 50);
        b4.setFont(f2);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.white);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 4;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 4;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(55, 200, 50, 50);
        b5.setFont(f2);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.white);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 5;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 5;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(105, 200, 50, 50);
        b6.setFont(f2);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.white);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 6;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 6;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b6);

        JButton bsub = new JButton("-");
        bsub.setBounds(155, 200, 50, 50);
        bsub.setFont(f3);
        bsub.setBackground(Color.BLACK);
        bsub.setForeground(c1);
        bsub.setBorder(null);
        bsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(mod == 2){
                    ans /= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                }
                ans -= num;
                tf.setText(Double.toString( ans));
                num = 0;
                mod = 4;
            }
        });
        frame.add(bsub);

        JButton b1 = new JButton("1");
        b1.setBounds(5, 250, 50, 50);
        b1.setFont(f2);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 1;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 1;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(55, 250, 50, 50);
        b2.setFont(f2);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 2;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 2;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(105, 250, 50, 50);
        b3.setFont(f2);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 3;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    num += 3;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b3);

        JButton badd = new JButton("+");
        badd.setBounds(155, 250, 50, 50);
        badd.setFont(f3);
        badd.setBackground(Color.BLACK);
        badd.setForeground(c1);
        badd.setBorder(null);
        badd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(mod == 2){
                    ans /= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                }
                ans += num;
                tf.setText(Double.toString( ans));
                num = 0;
                mod = 5;
            }
        });
        frame.add(badd);

        JButton b0 = new JButton("0");
        b0.setBounds(5, 300, 100, 50);
        b0.setFont(f2);
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.white);
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(num == 0){
                    num = 0;
                    tf.setText(Double.toString(num));
                }else{
                    num *= 10;
                    tf.setText(Double.toString( num));
                }
            }
        });
        frame.add(b0);

        JButton bans = new JButton("Ans");
        bans.setBounds(105, 300, 50, 50);
        bans.setFont(f2);
        bans.setBackground(Color.BLACK);
        bans.setForeground(c1);
        bans.setBorder(null);
        bans.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(Double.toString( ans));
                num = 0;
            }
        });
        frame.add(bans);

        JButton beql = new JButton("=");
        beql.setBounds(155, 300, 50, 50);
        beql.setFont(f3);
        beql.setBackground(Color.BLACK);
        beql.setForeground(c1);
        beql.setBorder(null);
        beql.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(mod == 1){
                    double d = ((ans- num)/ans);
                    ans = 100-(d*100);
                    tf.setText(Double.toString( ans));
                    num = 0;
                }else if(mod == 2){
                    ans /= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                    mod = 0;
                }else if(mod == 3){
                    if(ans == 0){
                        ans++;
                    }
                    ans *= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                    mod = 0;
                }else if(mod == 4){
                    ans -= num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                    mod = 0;
                }else if(mod == 5){
                    ans += num;
                    tf.setText(Double.toString( ans));
                    num = 0;
                    mod = 0;
                }else{
                    tf.setText(Double.toString(num));
                }
            }
        });
        frame.add(beql);
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

        frame.setVisible(true);
    }
}
