import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Kalkulator_GUI extends JFrame implements ActionListener {
    static JFrame f;

    static JTextField l;

    String s0, s1, s2;

    Kalkulator_GUI() {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[]) {

        f = new JFrame("Kalkulator");

        try {
    
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        Kalkulator_GUI c = new Kalkulator_GUI();


        l = new JTextField(16);


        l.setEditable(false);


        JButton tombol0, tombol1, tombol2, tombol3, tombol4, tombol5, tombol6, tombol7, tombol8, tombol9, tambah, kurang, bagi, kali, koma, balik, hasil;


        tombol0 = new JButton("0");
        tombol1 = new JButton("1");
        tombol2 = new JButton("2");
        tombol3 = new JButton("3");
        tombol4 = new JButton("4");
        tombol5 = new JButton("5");
        tombol6 = new JButton("6");
        tombol7 = new JButton("7");
        tombol8 = new JButton("8");
        tombol9 = new JButton("9");


        hasil = new JButton("=");


        tambah = new JButton("+");
        kurang = new JButton("-");
        bagi = new JButton(":");
        kali = new JButton("*");
        balik = new JButton("C");


        koma = new JButton(".");


        JPanel p = new JPanel();


        kali.addActionListener(c);
        bagi.addActionListener(c);
        kurang.addActionListener(c);
        tambah.addActionListener(c);
        tombol9.addActionListener(c);
        tombol8.addActionListener(c);
        tombol7.addActionListener(c);
        tombol6.addActionListener(c);
        tombol5.addActionListener(c);
        tombol4.addActionListener(c);
        tombol3.addActionListener(c);
        tombol2.addActionListener(c);
        tombol1.addActionListener(c);
        tombol0.addActionListener(c);
        koma.addActionListener(c);
        balik.addActionListener(c);
        hasil.addActionListener(c);


        p.add(l);
        p.add(tambah);
        p.add(tombol1);
        p.add(tombol2);
        p.add(tombol3);
        p.add(kurang);
        p.add(tombol4);
        p.add(tombol5);
        p.add(tombol6);
        p.add(kali);
        p.add(tombol7);
        p.add(tombol8);
        p.add(tombol9);
        p.add(bagi);
        p.add(koma);
        p.add(tombol0);
        p.add(balik);
        p.add(hasil);


        f.add(p);

        f.setSize(200, 220);
        f.show();
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();


        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
    
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

    
            l.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'C') {
    
            s0 = s1 = s2 = "";

    
            l.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {

            double te;

    
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

    
            l.setText(s0 + s1 + s2 + "=" + te);

    
            s0 = Double.toString(te);

            s1 = s2 = "";
        } else {
    
            if (s1.equals("") || s2.equals(""))
                s1 = s;
    
            else {
                double te;

        
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

        
                s0 = Double.toString(te);

        
                s1 = s;

        
                s2 = "";
            }
            l.setText(s0 + s1 + s2);
        }
    }
}