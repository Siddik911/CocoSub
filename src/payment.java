import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class payment extends JFrame /*implements ActionListener*/ {

    JPanel panel1,panel2;

    Color c1,c2,c3,c4;

    ImageIcon icon1,icon2;

    JLabel l1,l2,l3,l4,l5,l6,l7;

    Font f2,f3;

    JTextField t1,t2,t3,t4;

    JButton b1,b3;

    public payment() {

        super("Payment");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1 = new Color(73, 56, 51);
        c2= new Color(128,111,102);
        c3= new Color(167, 77, 37);
        c4= new Color(0,191,99);
        f2 = new Font("Sans Serif", Font.BOLD, 20);
        f3 = new Font("Sans Serif", Font.BOLD, 16);

        panel1= new JPanel();
        panel1.setSize(300,500);
        panel1.setBackground(c1);
        panel1.setLayout(null);
        this.add(panel1);

        panel2= new JPanel();
        panel2.setSize(200,500);
        panel2.setBackground(c2);
        panel2.setLayout(null);
        this.add(panel2);

        l1= new JLabel("Please Enter all the " +
                "details correctly");
        l1.setBounds(350,50,400,30);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l1.setFont(f2);
        l1.setBackground(c2);
        l1.setForeground(Color.white);
        panel2.add(l1);

        l2= new JLabel("16 digit card number");
        l2.setBounds(350,100,200,30);
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l2.setFont(f3);
        l2.setBackground(c2);
        l2.setForeground(Color.white);
        panel2.add(l2);

        l3= new JLabel("Credit amount");
        l3.setBounds(420,250,130,20);
        l3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l3.setFont(f3);
        l3.setBackground(c2);
        l3.setForeground(Color.white);
        panel2.add(l3);

        l6= new JLabel("EXP Date");
        l6.setBounds(350,200,130,20);
        l6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l6.setFont(f3);
        l6.setBackground(c2);
        l6.setForeground(Color.white);
        panel2.add(l6);

        l4= new JLabel("CVV");
        l4.setBounds(550,200,100,20);
        l4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l4.setFont(f3);
        l4.setBackground(c2);
        l4.setForeground(Color.white);
        panel2.add(l4);

        l5= new JLabel("We Accept");
        l5.setBounds(400,400,100,20);
        l5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l5.setFont(f3);
        l5.setBackground(c2);
        l5.setForeground(Color.white);
        panel2.add(l5);

        t2= new JTextField();
        t2.setBounds(350,150,300,25);
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel2.add(t2);

        t1= new JTextField();
        t1.setBounds(550,250,80,20);
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel2.add(t1);

        t3= new JTextField();
        t3.setBounds(600,200,80,20);
        t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel2.add(t3);

        t4= new JTextField();
        t4.setBounds(440,200,80,20);
        t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel2.add(t4);

        icon1= new ImageIcon(getClass().getResource("logo.png"));
        JLabel l3 = new JLabel(icon1);
        l3.setBounds(1, 40, 300, 320);
        panel1.add(l3);





        b1= new JButton("Pay Now");
        b1.setBounds(470,300,100,30);
        b1.setBackground(c4);
        b1.setForeground(Color.WHITE);
        b1.setFont(f3);
        b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        panel2.add(b1);

        b3=new JButton("Back");
        b3.setBounds(100, 400, 100, 30);
        b3.setForeground(Color.WHITE);
        b3.setFont(f3);
        b3.setBackground(c3);
        b3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b3.addActionListener(this);
        panel1.add(b3);




        icon2= new ImageIcon(getClass().getResource("payment.png"));
         l6 = new JLabel(icon2);
        l6.setBounds(500, 360, 200, 100);
        panel2.add(l6);


    }


    public static void main(String[] args) {

        payment pm = new payment();
        pm.setResizable(false);
        pm.setLocationRelativeTo(null);
        pm.setVisible(true);
    }



}