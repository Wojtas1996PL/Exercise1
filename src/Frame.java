import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    public void frame(){
        JFrame f = new JFrame("Exercise 1");
        f.setSize(400, 200);
        f.setLocation(100, 100);
        f.setVisible(true);
        JButton a = new JButton("1a");
        JButton b = new JButton("1b");
        JButton c = new JButton("1c");
        JButton d = new JButton("1d");
        JButton e = new JButton("1e");
        JButton f1 = new JButton("1f");
        JButton g = new JButton("1g");
        JButton h = new JButton("1h");
        JButton i = new JButton("1i");
        f.setLayout(new FlowLayout());
        f.add(a);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(f1);
        f.add(g);
        f.add(h);
        f.add(i);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1a method = new Ex1a();
                method.method1a();
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1b method = new Ex1b();
                method.method1b();
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1c method = new Ex1c();
                method.method1c();
            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1d method = new Ex1d();
                method.method1d();
            }
        });
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1e method = new Ex1e();
                method.method1e();
            }
        });
        f1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1f m = new Ex1f();
                m.method1f();
            }
        });
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1g g = new Ex1g();
                g.method1g();
            }
        });
        h.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1h h = new Ex1h();
                h.method1h();
            }
        });
        i.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ex1i i = new Ex1i();
                i.method1i();
            }
        });
        f.setDefaultCloseOperation(3);
    }
}
