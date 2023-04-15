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

        JPanel panel1= new JPanel();
        panel1.setSize(200,500);
        panel1.setBackground(c1);
        panel1.setLayout(null);
        this.add(panel1);

        JPanel panel2= new JPanel();
        panel2.setSize(200,500);
        panel2.setBackground(c2);
        panel2.setLayout(null);
        this.add(panel2);


        JLabel l1= new JLabel();


    }

    public static void main (String[] args) {
        cancelSub cb = new cancelSub();
        cb.setResizable(false);
        cb.setLocationRelativeTo(null);
        cb.setVisible(true);
    }


}