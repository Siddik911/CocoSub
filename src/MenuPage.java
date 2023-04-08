//package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;


public class MenuPage extends JFrame {

    private Container c;
    private ImageIcon img,icon,icon1,cf1,cf2,cf3,cf4,cf5,cf6,p1;
    private JLabel imgLabel,img1,c1,c2,c3,c4,c5,c6,pp1;
    private JButton b1,b2,b3,s1,s2,s3,s4,s5,s6;
    private JTextField t1;
    private Font f1,f2;


    MenuPage() {
        initComponents();
    }

    private void initComponents() {
        c = this.getContentPane();
        //fonts
        f1 = new Font("Sans Serif",Font.BOLD,12);
        f2 = new Font("Sans Serif",Font.BOLD,16);
        //button colors
        Color button= new Color(167,77,37);
        Color button2= new Color(73,56,51);
        //text-field
        t1= new JTextField("SIRAJUM MUNIR");
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.setFont(f2);
        t1.setBackground(button2);
        t1.setForeground(Color.white);
        t1.setBounds(70,10,150,30);
        c.add(t1);

        //images of coffee items
        cf1= new ImageIcon(getClass().getResource("1.jpg"));
        c1= new JLabel(cf1);
        c1.setBounds(100,100,100,100);
        c.add(c1);

        cf2= new ImageIcon(getClass().getResource("2.jpg"));
        c2= new JLabel(cf2);
        c2.setBounds(300,100,100,100);
        c.add(c2);

        cf3= new ImageIcon(getClass().getResource("3.jpg"));
        c3= new JLabel(cf3);
        c3.setBounds(500,100,100,100);
        c.add(c3);

        cf4= new ImageIcon(getClass().getResource("4.jpg"));
        c4= new JLabel(cf4);
        c4.setBounds(100,260,100,100);
        c.add(c4);

        cf5= new ImageIcon(getClass().getResource("5.jpg"));
        c5= new JLabel(cf5);
        c5.setBounds(300,260,100,100);
        c.add(c5);

        cf6= new ImageIcon(getClass().getResource("6.jpg"));
        c6= new JLabel(cf6);
        c6.setBounds(500,260,100,100);
        c.add(c6);


        //Buttons
        s1= new JButton("Select");
        s1.setBounds(100,210,100,30);
        s1.setBackground(button2);
        s1.setForeground(Color.WHITE);
        s1.setFont(f1);
        c.add(s1);

        s2= new JButton("Select");
        s2.setBounds(300,210,100,30);
        s2.setBackground(button2);
        s2.setForeground(Color.WHITE);
        s2.setFont(f1);
        c.add(s2);

        s3= new JButton("Select");
        s3.setBounds(500,210,100,30);
        s3.setBackground(button2);
        s3.setForeground(Color.WHITE);
        s3.setFont(f1);
        c.add(s3);

        s4= new JButton("Select");
        s4.setBounds(100,375,100,30);
        s4.setBackground(button2);
        s4.setForeground(Color.WHITE);
        s4.setFont(f1);
        c.add(s4);

        s5= new JButton("Select");
        s5.setBounds(300,375,100,30);
        s5.setBackground(button2);
        s5.setForeground(Color.WHITE);
        s5.setFont(f1);
        c.add(s5);

        s6= new JButton("Select");
        s6.setBounds(500,375,100,30);
        s6.setBackground(button2);
        s6.setForeground(Color.WHITE);
        s6.setFont(f1);
        c.add(s6);


        b1= new JButton("Account");
        b1.setBounds(380,10,100,30);
        b1.setBackground(button);
        b1.setForeground(Color.WHITE);
        b1.setFont(f1);
        c.add(b1);

        b2= new JButton("Back");
        b2.setBounds(50,420,100,30);
        b2.setForeground(Color.WHITE);
        b2.setFont(f1);
        b2.setBackground(button);
        c.add(b2);

        b3= new JButton("Settings");
        b3.setBounds(500,10,100,30);
        b3.setForeground(Color.WHITE);
        b3.setFont(f1);
        b3.setBackground(button);
        c.add(b3);

        //pictures and logos

        p1= new ImageIcon(getClass().getResource("tahmid.PNG"));
        pp1= new JLabel(p1);
        pp1.setBounds(5,-1,50,50);
        c.add(pp1);


        icon1= new ImageIcon(getClass().getResource("cornerlogo.PNG"));
        img1= new JLabel(icon1);
        img1.setBounds(630,-25,100,100);
        c.add(img1);


        img = new ImageIcon(getClass().getResource("MenuPage.png"));
        imgLabel= new JLabel(img);
        imgLabel.setSize(img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);

        icon= new ImageIcon(getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());

    }
    public static void main(String[] args) {
        MenuPage frame = new MenuPage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,500);
        frame.setTitle("Menu");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


    }
}





