import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class user1 extends JFrame {


    private JLabel L1,L2,L3,L4,L5 ,img1;
    JButton ed2,bk3;
    private Container c;
    private Font f;
    user1(){
        initComponents();
    }
public void initComponents(){
c= this.getContentPane();
c.setLayout(null);
c.setBackground(new Color(118,106,94));
 f = new Font("Sans Serif",Font.BOLD,17);

L1 = new JLabel();
L1.setText("Name        :  ADNAN HOSSAIN RATUL");
L1.setBounds(250,200,400,40);
L1.setFont(f);
L1.setForeground(Color.black);
c.add(L1);

L2 = new JLabel();
L2.setText("User ID     :  ADNAN707");
L2.setBounds(250,220,400,40);
L2.setFont(f);
L2.setForeground(Color.black);
c.add(L2);


L3 = new JLabel();
L3.setText("Phone      : 01904333186");
L3.setBounds(250,250,400,40);
L3.setFont(f);
L3.setForeground(Color.black);
c.add(L3);

L4 = new JLabel();
L4.setText("Email        : 22-48562-3");
L4.setBounds(250,280,400,40);
L4.setFont(f);
L4.setForeground(Color.black);
c.add(L4);

L5 = new JLabel();
L5.setText("Password : 160299");
L5.setBounds(250,310,400,40);
L5.setFont(f);
L5.setForeground(Color.black);
c.add(L5);



ImageIcon icon3 = new ImageIcon("adnan707.png");
img1=new JLabel(icon3);
img1.setBounds(300,70,120,119);
c.add(img1);




//L1.setOpaque(true);
bk3=new JButton("Back");
bk3.setBounds(15,420,80,30);
bk3.setBackground(new Color(167,77,37));
bk3.setForeground(Color.WHITE);
c.add(bk3);

ed2=new JButton("edit");
ed2.setBounds(630,420,80,30);
ed2.setBackground(new Color(167,77,37));
ed2.setForeground(Color.WHITE);
ed2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae){



JOptionPane.showMessageDialog(null,"this page is under construction");

    }


});
c.add(ed2);



}















    public static void main(String[] args) {
        user1 g1 = new user1(); //creating an object to have access
        g1.setVisible(true);
        g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g1.setBounds(200,50,750,500);
        g1.setTitle("coco sub");
        ImageIcon icon=new ImageIcon("CocoSub Transparent Logo.png");
        g1.setIconImage(icon.getImage());
    }
}
