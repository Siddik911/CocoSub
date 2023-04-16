import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class addCredit extends JFrame /*implements ActionListener*/{

    JLabel l1,l2,l3,l4,l5;

    JButton b1,b2;
    Checkbox cb1,cb2,cb3,cb4;

    JTextField t1,t2,t3,t4;

    ImageIcon icon1;




    public addCredit(){
        super("Add Credit");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color c1= new Color(128,111,102,255);


        JPanel panel= new JPanel();


        panel.setLayout(null);
        panel.setBackground(c1);
        this.add(panel);

        Font f1 = new Font("Sans Serif", Font.BOLD, 20);
        Font f2 = new Font("Sans Serif", Font.BOLD, 16);
        Color c2= new Color(128,111,102);
        Color c3= new Color(192,156,116);
        Color c4= new Color(0,191,99);
        Color c5 = new Color(167, 77, 37);

         l1= new JLabel("Choose the package(s) you want to add more credits");
        l1.setBounds(120,150,550,25);
        l1.setBackground(c2);
        l1.setForeground(Color.WHITE);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l1.setFont(f1);
        panel.add(l1);

         l2= new JLabel("Package Name");
        l2.setBounds(80,200,150,30);
        l2.setOpaque(false);
        l2.setForeground(c3);
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l2.setFont(f2);
        panel.add(l2);


         l3= new JLabel("Total Credit");
        l3.setBounds(400,200,150,30);
        l3.setOpaque(false);
        l3.setForeground(c3);
        l3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l3.setFont(f2);
        panel.add(l3);

         l4= new JLabel("Price");
        l4.setBounds(600,200,150,30);
        l4.setOpaque(false);
        l4.setForeground(c3);
        l4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l4.setFont(f2);
        panel.add(l4);

         l5= new JLabel("Total Price: ৳");
        l5.setBounds(100,370,150,30);
        l5.setOpaque(false);
        l5.setForeground(c3);
        l5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l5.setFont(f2);
        panel.add(l5);

         b1= new JButton("Add Credits");
        b1.setBounds(400,370,100,30);
        b1.setBackground(c4);
        b1.setForeground(Color.WHITE);
        b1.setFont(f2);
        b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        panel.add(b1);

         b2=new JButton("Back");
        b2.setBounds(50, 420, 100, 30);
        b2.setForeground(Color.WHITE);
        b2.setFont(f2);
        b2.setBackground(c5);
        b2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b2.addActionListener(this);
        panel.add(b2);


         cb1= new Checkbox("  Subscription Name- Price");
        cb1.setBounds(80,240,220,30);
        cb1.setFont(f2);
        cb1.setForeground(Color.WHITE);
        panel.add(cb1);

         cb2= new Checkbox("  Subscription Name- Price");
        cb2.setBounds(80,270,220,30);
        cb2.setFont(f2);
        cb2.setForeground(Color.WHITE);
        panel.add(cb2);

         cb3= new Checkbox("  Subscription Name- Price");
        cb3.setBounds(80,300,220,30);
        cb3.setFont(f2);
        cb3.setForeground(Color.WHITE);
        panel.add(cb3);

         cb4= new Checkbox("  Subscription Name- Price");
        cb4.setBounds(80,330,220,30);
        cb4.setFont(f2);
        cb4.setForeground(Color.WHITE);
        panel.add(cb4);


         t1= new JTextField();
        t1.setBounds(400,240,100,20);
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(t1);

         t2= new JTextField();
        t2.setBounds(400,270,100,20);
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(t2);

         t3= new JTextField();
        t3.setBounds(400,300,100,20);
        t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(t3);

         t4= new JTextField();
        t4.setBounds(400,330,100,20);
        t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel.add(t4);


         icon1= new ImageIcon(getClass().getResource("logo1.png"));
        JLabel l6 = new JLabel(icon1);
        l6.setBounds(270, -20, 200, 200);
        panel.add(l6);



    }

    //public void ActionPerformed (ActionEvent ae)



    public static void main(String[] args) {
        addCredit ac = new addCredit();
        ac.setResizable(false);
        ac.setLocationRelativeTo(null);
        ac.setVisible(true);
    }
}

