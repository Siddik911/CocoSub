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





    }

    public static void main (String[] args) {
        subItem1 si = new subItem1();
        si.setResizable(false);
        si.setLocationRelativeTo(null);
        si.setVisible(true);
    }
}