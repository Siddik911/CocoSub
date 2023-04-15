import javax.swing.*;
import java.awt.*;
import java.awt.Font;

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

        JLabel l4 = new JLabel("Sorry to say you Good Bye!");
        l4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l4.setFont(f1);
        l4.setBackground(c2);
        l4.setForeground(Color.white);
        l4.setBounds(350, 30, 350, 30);
        panel2.add(l4);

        JLabel l1 = new JLabel("Select your Cancellation Reason");
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l1.setFont(f2);
        l1.setBackground(c2);
        l1.setForeground(Color.white);
        l1.setBounds(310, 100, 350, 30);
        panel2.add(l1);

        JLabel l2 = new JLabel("Share your valuable Feedback");
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l2.setFont(f2);
        l2.setBackground(c2);
        l2.setForeground(Color.white);
        l2.setBounds(310, 200, 350, 30);
        panel2.add(l2);

        JTextField t1 = new JTextField();
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        t1.setBounds(310, 250, 400, 100);
        panel2.add(t1);

        String[] items = new String [] {"Too costly","Don't want anymore","Found a better option","No reason"};
        JComboBox<String> combo = new JComboBox<>(items);
        combo.setFont(f3);
        combo.setBounds(310,150,400,30);
        panel2.add(combo);

        ImageIcon icon1= new ImageIcon(getClass().getResource("logo.png"));
        JLabel l3 = new JLabel(icon1);
        l3.setBounds(1, 40, 300, 320);
        panel1.add(l3);

        JButton b1=new JButton("Back");
        b1.setBounds(100, 400, 100, 30);
        b1.setForeground(Color.WHITE);
        b1.setFont(f3);
        b1.setBackground(c5);
        b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //b2.addActionListener(this);
        panel1.add(b1);

        JButton b2=new JButton("Cancel Subscription");
        b2.setBounds(420, 400, 200, 30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.RED);
        b2.setFont(f3);
        //b2.addActionListener(this);
        panel2.add(b2);

    }

    public static void main (String[] args) {
        cancelSub cb = new cancelSub();
        cb.setResizable(false);
        cb.setLocationRelativeTo(null);
        cb.setVisible(true);
    }


}