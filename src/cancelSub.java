import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cancelSub extends JFrame /*implements ActionListener*/ {



    public cancelSub() {

        super("Cancel Subscription");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color c1 = new Color(73, 56, 51);
        Color c2= new Color(128,111,102);
        Color c5 = new Color(167, 77, 37);
        Font f1 = new Font("Sans Serif", Font.BOLD, 24);
        Font f2 = new Font("Sans Serif", Font.BOLD, 20);
        Font f3 = new Font("Sans Serif", Font.BOLD, 16);




        JPanel panel1= new JPanel();
        panel1.setSize(300,500);
        panel1.setBackground(c1);
        panel1.setLayout(null);
        this.add(panel1);

        JPanel panel2= new JPanel();
        panel2.setSize(200,500);
        panel2.setBackground(c2);
        panel2.setLayout(null);
        this.add(panel2);

        JTextField t1 = new JTextField("Sorry to say you Good Bye!");
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.setFont(f1);
        t1.setBackground(c2);
        t1.setForeground(Color.white);
        t1.setBounds(350, 30, 350, 30);
        panel2.add(t1);

        JTextField t2 = new JTextField("Select your Cancellation Reason");
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t2.setFont(f2);
        t2.setBackground(c2);
        t2.setForeground(Color.white);
        t2.setBounds(310, 100, 350, 30);
        panel2.add(t2);



        ImageIcon icon1= new ImageIcon(getClass().getResource("logo.png"));
        JLabel l1 = new JLabel(icon1);
        l1.setBounds(1, 40, 300, 320);
        panel1.add(l1);

        JButton b1=new JButton("Back");
        b1.setBounds(100, 400, 100, 30);
        b1.setForeground(Color.WHITE);
        b1.setFont(f3);
        b1.setBackground(c5);
        b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b2.addActionListener(this);
        panel1.add(b1);





    }

    public static void main (String[] args) {
        cancelSub cb = new cancelSub();
        cb.setResizable(false);
        cb.setLocationRelativeTo(null);
        cb.setVisible(true);
    }


}