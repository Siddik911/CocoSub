import javax.swing.*;
import java.awt.*;
import java.awt.Font;


public class subItem1 extends JFrame /*implements ActionListener*/ {


    public subItem1() {
        super("Tea Package");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color c1 = new Color(73, 56, 51);
        Color c2= new Color(128,111,102);
        Font f1 = new Font("Sans Serif", Font.BOLD, 20);

        JPanel panel1= new JPanel();
        panel1.setSize(750,70);
        panel1.setBackground(c1);
        panel1.setLayout(null);
        this.add(panel1);

        JPanel panel2= new JPanel();
        panel2.setSize(750,430);
        panel2.setBackground(c2);
        panel2.setLayout(null);
        this.add(panel2);

        ImageIcon img = new ImageIcon(getClass().getResource("tea.png"));
        JLabel l1= new JLabel(img);
        l1.setBounds(500,60,250,430);
        panel2.add(l1);

        JLabel t1= new JLabel("Tea Package- 299৳");
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.setFont(f1);
        t1.setBackground(c2);
        t1.setForeground(Color.white);
        t1.setBounds(40, 30, 150, 20);
        panel1.add(t1);

        JLabel t2= new JLabel("•Enjoy a refreshing cup of Tea every day.");
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t2.setFont(f1);
        t2.setBackground(c1);
        t2.setForeground(Color.white);
        t2.setBounds(10, 120, 400, 25);
        panel2.add(t2);

        JLabel t3= new JLabel("•You will get 50 credits per month.");
        t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t3.setFont(f1);
        t3.setBackground(c1);
        t3.setForeground(Color.white);
        t3.setBounds(10, 160, 400, 25);
        panel2.add(t3);

        JLabel t4= new JLabel("•Unused Credits will roll over to next month.");
        t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t4.setFont(f1);
        t4.setBackground(c1);
        t4.setForeground(Color.white);
        t4.setBounds(10, 200, 450, 25);
        panel2.add(t4);

        JLabel t5= new JLabel("•You can cancel anytime.");
        t5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t5.setFont(f1);
        t5.setBackground(c1);
        t5.setForeground(Color.white);
        t5.setBounds(10, 240, 400, 25);
        panel2.add(t5);





    }

    public static void main (String[] args) {
        subItem1 si = new subItem1();
        si.setResizable(false);
        si.setLocationRelativeTo(null);
        si.setVisible(true);
    }
}