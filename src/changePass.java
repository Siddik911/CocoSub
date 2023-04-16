import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class changePass extends JFrame /*implements ActionListener*/ {

    JPanel panel1,panel2;

    ImageIcon icon1;

    Color c1,c2,c3;

    JButton b3;
    Font f3;

    JLabel l1,l2;

    JTextField t1,t2;

    public changePass(){

        super("Change Password");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1 = new Color(73, 56, 51);
        c2= new Color(128,111,102);
        c3 = new Color(167, 77, 37);
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

        t1= new JTextField();
        t1.setBounds(350,150,200,25);
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel2.add(t1);

        t2= new JTextField();
        t2.setBounds(350,250,200,25);
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        panel2.add(t2);

        l1= new JLabel("Old password");
        l1.setBounds(350,100,400,30);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l1.setFont(f3);
        l1.setBackground(c2);
        l1.setForeground(Color.white);
        panel2.add(l1);

        l2= new JLabel("New Password");
        l2.setBounds(350,200,200,30);
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l2.setFont(f3);
        l2.setBackground(c2);
        l2.setForeground(Color.white);
        panel2.add(l2);


        b3=new JButton("Back");
        b3.setBounds(100, 400, 100, 30);
        b3.setForeground(Color.WHITE);
        b3.setFont(f3);
        b3.setBackground(c3);
        b3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b3.addActionListener(this);
        panel1.add(b3);





        icon1= new ImageIcon(getClass().getResource("logo.png"));
        JLabel l3 = new JLabel(icon1);
        l3.setBounds(1, 40, 300, 320);
        panel1.add(l3);



    }

    public static void main(String[] args) {

        changePass cp = new changePass();
        cp.setResizable(false);
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }
}

