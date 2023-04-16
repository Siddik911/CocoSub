import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class settings extends JFrame /*implements ActionListener*/ {

    ImageIcon icon1;
    JPanel panel1,panel2;

    Color c1,c2,c3,c4;

    JLabel l1,l2,l3;
    Font f3;

    JButton b1,b2,b3;



    public settings(){

        super("Settings");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1 = new Color(73, 56, 51);
        c2= new Color(128,111,102);
        c3 = new Color(167, 77, 37);
        c4= new Color(0,191,99);
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


        l1= new JLabel("Change password");
        l1.setBounds(350,100,400,30);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l1.setFont(f3);
        l1.setBackground(c2);
        l1.setForeground(Color.white);
        panel2.add(l1);

        l2= new JLabel("Delete account");
        l2.setBounds(350,200,200,30);
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l2.setFont(f3);
        l2.setBackground(c2);
        l2.setForeground(Color.white);
        panel2.add(l2);

        /*l3= new JLabel("ADNAN HOSSAIN RATUL");
        l3.setBounds(350,250,250,20);
        l3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l3.setFont(f3);
        l3.setBackground(c2);
        l3.setForeground(Color.white);
        panel2.add(l3);

         */

        b1=new JButton("Change Password");
        b1.setBounds(350, 150, 150, 30);
        b1.setForeground(Color.WHITE);
        b1.setFont(f3);
        b1.setBackground(c4);
        b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        panel2.add(b1);

        b2=new JButton("Delete Account");
        b2.setBounds(350, 250, 150, 30);
        b2.setForeground(Color.WHITE);
        b2.setFont(f3);
        b2.setBackground(Color.RED);
        b2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b2.addActionListener(this);
        panel2.add(b2);

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

        settings st = new settings();
        st.setResizable(false);
        st.setLocationRelativeTo(null);
        st.setVisible(true);
    }
}