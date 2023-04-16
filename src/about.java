import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class about extends JFrame /*implements ActionListener*/ {

    ImageIcon icon1;
    JPanel panel1,panel2;

    Color c1,c2;

    JLabel l1,l2,l3,l4;
    Font f2,f3;


    public about(){

        super("About Us");
        this.setSize(750,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1 = new Color(73, 56, 51);
        c2= new Color(128,111,102);
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

        l1= new JLabel("SIRAJUM MUNIR");
        l1.setBounds(350,50,400,30);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l1.setFont(f2);
        l1.setBackground(c2);
        l1.setForeground(Color.white);
        panel2.add(l1);

        l2= new JLabel("HASAN SIDDIKI");
        l2.setBounds(350,150,200,30);
        l2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l2.setFont(f2);
        l2.setBackground(c2);
        l2.setForeground(Color.white);
        panel2.add(l2);

        l3= new JLabel("ADNAN HOSSAIN RATUL");
        l3.setBounds(350,250,250,20);
        l3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l3.setFont(f2);
        l3.setBackground(c2);
        l3.setForeground(Color.white);
        panel2.add(l3);

        l4= new JLabel("RAFID ABRAR");
        l4.setBounds(350,350,200,20);
        l4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        l4.setFont(f2);
        l4.setBackground(c2);
        l4.setForeground(Color.white);
        panel2.add(l4);

        icon1= new ImageIcon(getClass().getResource("logo.png"));
        JLabel l3 = new JLabel(icon1);
        l3.setBounds(1, 40, 300, 320);
        panel1.add(l3);

    }

    public static void main(String[] args) {

        about ab = new about();
        ab.setResizable(false);
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);
    }
}