import javax.swing.*;
import java.awt.*;
import java.awt.Font;


public class MenuPage extends JFrame /*implements ActionListener*/ {

    JLabel t1,t2,t3,t4,t5,t6;

    ImageIcon cf1,cf2,cf3,cf4;

    JButton sc,RO,OO,s1,s2,s3,s4,b1,b2,b3,b4;

    ImageIcon img,icon,icon1;



    public MenuPage() {

        super("Menu Page");
        this.setSize(750, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        //fonts
        Font f1 = new Font("Sans Serif", Font.BOLD, 12);
        Font f2 = new Font("Sans Serif", Font.BOLD, 16);
        Font f3 = new Font("Sans Serif", Font.BOLD, 20);

        //button colors
        Color button = new Color(167, 77, 37);
        Color button2 = new Color(73, 56, 51);
        Color button3= new Color(128,111,102);
        Color button4= new Color(201,163,119);
        Color button5 = new Color(0,191,99);

        //text-field
         t1 = new JLabel("SIRAJUM MUNIR  |  Credits 100");
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.setFont(f2);
        t1.setBackground(button2);
        t1.setForeground(Color.white);
        t1.setBounds(10, 20, 250, 30);
        panel.add(t1);

         t2 = new JLabel("Choose your favourite package");
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t2.setFont(f3);
        t2.setBackground(button3);
        t2.setForeground(Color.white);
        t2.setBounds(220, 100, 500, 30);
        panel.add(t2);

         t3= new JLabel("Tea Package- 299৳");
        t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t3.setFont(f1);
        t3.setBackground(button3);
        t3.setForeground(Color.white);
        t3.setBounds(40, 260, 150, 10);
        panel.add(t3);

         t4= new JLabel("Premium Coffee 699৳");
        t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t4.setFont(f1);
        t4.setBackground(button3);
        t4.setForeground(Color.white);
        t4.setBounds(210, 260, 150, 10);
        panel.add(t4);

         t5= new JLabel("Black Coffee- 499৳");
        t5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t5.setFont(f1);
        t5.setBackground(button3);
        t5.setForeground(Color.white);
        t5.setBounds(410, 260, 150, 10);
        panel.add(t5);

         t6= new JLabel("Regular Coffee- 599৳");
        t6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t6.setFont(f1);
        t6.setBackground(button3);
        t6.setForeground(Color.white);
        t6.setBounds(590, 260, 150, 10);
        panel.add(t6);


         cf1 = new ImageIcon(getClass().getResource("4.jpg"));
        JLabel c1 = new JLabel(cf1);
        c1.setBounds(40, 150, 100, 100);
        panel.add(c1);

         cf2 = new ImageIcon(getClass().getResource("5.jpg"));
        JLabel c2 = new JLabel(cf2);
        c2.setBounds(210, 150, 100, 100);
        panel.add(c2);

         cf3 = new ImageIcon(getClass().getResource("6.jpg"));
        JLabel c3 = new JLabel(cf3);
        c3.setBounds(410, 150, 100, 100);
        panel.add(c3);

         cf4 = new ImageIcon(getClass().getResource("3.jpg"));
        JLabel c4 = new JLabel(cf4);
        c4.setBounds(590, 150, 100, 100);
        panel.add(c4);

        //Buttons
         sc=new JButton("Subscriptions");
        //s1 = new JButton("Subscriptions");
        sc.setBounds(120, 375, 150, 30);
        sc.setBackground(Color.BLACK);
        sc.setForeground(Color.WHITE);
        sc.setFont(f3);
        sc.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //s1.addActionListener(this);
        panel.add(sc);

         RO=new JButton("Regular Order");

        RO.setBounds(310, 375, 150, 30);
        RO.setBackground(button4);
        RO.setForeground(Color.WHITE);
        RO.setFont(f3);
        //s2.addActionListener(this);
        RO.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(RO);

         OO=new JButton("Online Order");

        OO.setBounds(500, 375, 150, 30);
        OO.setBackground(button5);
        OO.setForeground(Color.WHITE);
        OO.setFont(f3);
        //s2.addActionListener(this);
        OO.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(OO);


         s1=new JButton("Select");
        s1.setBounds(40, 290, 100, 30);
        s1.setBackground(button2);
        s1.setForeground(Color.WHITE);
        s1.setFont(f1);
        s1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //s4.addActionListener(this);
        panel.add(s1);

         s2=new JButton("Select");
        s2 = new JButton("Select");
        s2.setBounds(210, 290, 100, 30);
        s2.setBackground(button2);
        s2.setForeground(Color.WHITE);
        s2.setFont(f1);
        s2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //s5.addActionListener(this);
        panel.add(s2);

         s3=new JButton("Select");
        s3.setBounds(410, 290, 100, 30);
        s3.setBackground(button2);
        s3.setForeground(Color.WHITE);
        s3.setFont(f1);
        s3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //s6.addActionListener(this);
        panel.add(s3);

         s4=new JButton("Select");
        s4.setBounds(590, 290, 100, 30);
        s4.setBackground(button2);
        s4.setForeground(Color.WHITE);
        s4.setFont(f1);
        s4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //s3.addActionListener(this);
        panel.add(s4);

         b1=new JButton("Account");
        b1.setBounds(300, 20, 100, 30);
        b1.setBackground(button);
        b1.setForeground(Color.WHITE);
        b1.setFont(f1);
        b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(b1);
        //b1.addActionListener(this);

         b2=new JButton("Back");
        b2.setBounds(50, 420, 100, 30);
        b2.setForeground(Color.WHITE);
        b2.setFont(f1);
        b2.setBackground(button);
        b2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b2.addActionListener(this);
        panel.add(b2);

         b3=new JButton("Settings");
        b3.setBounds(420, 20, 100, 30);
        b3.setForeground(Color.WHITE);
        b3.setFont(f1);
        b3.setBackground(button);
        b3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b3.addActionListener(this);
        panel.add(b3);

         b4= new JButton("Exit");
        b4.setBounds(540, 20, 100, 30);
        b4.setForeground(Color.WHITE);
        b4.setFont(f1);
        b4.setBackground(button);
        b4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(b4);

        icon1 = new ImageIcon(getClass().getResource("cornerlogo.PNG"));
        JLabel img1 = new JLabel(icon1);
        img1.setBounds(630, -25, 100, 100);
        panel.add(img1);

        img = new ImageIcon(getClass().getResource("MenuPage.png"));
        JLabel imgLabel = new JLabel(img);
        imgLabel.setSize(img.getIconWidth(), img.getIconHeight());
        panel.add(imgLabel);

        icon = new ImageIcon(getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());

        this.add(panel);

    }
//public void ActionPerformed (ActionEvent ae)


    public static void main(String[] args) {
        MenuPage mp = new MenuPage();
        mp.setResizable(false);
        mp.setLocationRelativeTo(null);
        mp.setVisible(true);

    }
}






