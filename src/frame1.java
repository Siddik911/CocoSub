import javax.swing.JFrame;
import javax.swing.*;
/*import javax.swing.JPasswordField;
import javax.swing.JTextField;
  import javax.swing.JPasswordField; */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frame1 extends JFrame{


    private Container c;
    private JLabel L1,L2,p1,t1,iml1,iml2;
    private Font f,f2; 
    private JTextField tf1,tf2;
    JPasswordField pf1;
    JButton log1,ex2,bk3;


    frame1(){
        initComponents();



    }
public void initComponents(){
    
    c = this.getContentPane();
    c.setLayout(null);
     c.setBackground(Color.PINK); 
    f=new Font("areal",Font.BOLD|Font.ITALIC,16);
    f2=new Font("AMASIS MT PRO BLACK",Font.BOLD | Font.ITALIC,30);

    
    t1 = new JLabel();
t1.setText(" welcome to dogXsnakes");
t1.setBounds(400,50,200,90);
t1.setFont(f);
t1.setForeground(Color.WHITE);


    L1 = new JLabel();
L1.setText("enter your email   ");
L1.setBounds(450,130,150,40);
L1.setFont(f);
L1.setForeground(Color.WHITE);
//L1.setOpaque(true);
//L1.setBackground(Color.LIGHT_GRAY);
 c.add(L1);  
 /*L2 = new JLabel();
 L2.setText("login ");
 L2.setBounds(500,50,300,40);
 L2.setFont(f2);
 L2.setForeground(Color.WHITE);
 //L1.setOpaque(true);
 //L1.setBackground(Color.LIGHT_GRAY);
  c.add(L2);*/



p1=new JLabel();
p1.setText(" enter your password: ");
p1.setBounds(450,210,250,50);
p1.setFont(f);
p1.setForeground(Color.WHITE);
c.add(p1);


tf1 = new JTextField();
    tf1.setBounds(450,170,270,40);
    tf1.setText("");
    c.add(tf1);

    tf2= new JPasswordField();
    tf2.setBounds(450,259,270,40);
    tf2.setText("");
    c.add(tf2);

/*tf1 = new JTextField();
tf1.setBounds(400,50,150,50);
c.add(tf1);

tf2= new javax.swing.JTextField();
tf2.setBounds(400,100,150,50);
c.add(tf2);*/

log1=new JButton("login");
log1.setBounds(500,310,170,30);
log1.setBackground(new Color(167,77,37));
log1.setForeground(Color.WHITE);
c.add(log1);

ex2 =new JButton("forgot password?");
ex2.setBounds(500,350,170,30);
ex2.setBackground(new Color(162,35,35));
ex2.setForeground(Color.WHITE);

ex2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae){


JOptionPane.showMessageDialog(null,"please contact at support@cocosub.com");
JOptionPane.showMessageDialog(null,"this page is under construction");

    }


});
c.add(ex2);



bk3=new JButton("Back");
bk3.setBounds(15,420,80,30);
bk3.setBackground(new Color(167,77,37));
bk3.setForeground(Color.WHITE);
c.add(bk3);

ImageIcon icon = new ImageIcon("CocoSub Transparent Logo.png");
setIconImage(icon.getImage());

ImageIcon icon2= new ImageIcon("login.png");

iml1=new JLabel(icon2,JLabel.CENTER);
iml1.setBounds(0,0,750,500);
c.add(iml1); 

ImageIcon icon3 = new ImageIcon("cocosub.png");
iml2=new JLabel(icon3);
iml2.setBounds(150,10,250,180);
c.add(iml2);




}


public static void main(String[] args) {
    
    frame1 F1 = new frame1(); //creating a object to have acces
    F1.setVisible(true);
    F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // F1.setSize(400,300);
    F1.setBounds(200,50,750,500 );
   // F1.setLocation(null);
   F1.setTitle("cocosub");
   





}



}


