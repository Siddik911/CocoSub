import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WelcomePage extends JFrame {
    public WelcomePage() {
        super("CoCo Sub - Welcome");
        setSize(750, 530);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image logoImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\rafid\\OneDrive - student.mtsac.edu\\Desktop\\Rafid\\JAVA\\cocoSub\\pics\\CocoSub Color Logo.png");
        setIconImage(logoImage);
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\rafid\\OneDrive - student.mtsac.edu\\Desktop\\Rafid\\JAVA\\cocoSub\\pics\\Welcome Page.png")));

        // Exit button
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Nunito", Font.BOLD, 14));
        exitButton.setBackground(new Color(167, 77, 37));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exitButton.setBorderPainted(false);
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exitButton.setBounds(getWidth() - 100, 10, 80, 30);
        add(exitButton);

        // Help button
        JButton helpButton = new JButton("Help");
        helpButton.setFont(new Font("Nunito", Font.BOLD, 16));
        helpButton.setBackground(new Color(167, 77, 37));
        helpButton.setForeground(Color.WHITE);
        helpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        helpButton.setFocusPainted(false);
        helpButton.setBorderPainted(false);
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(WelcomePage.this,
                        "This is a welcome page. Click 'Already an user' to login or 'New User' to sign up.",
                        "Help", JOptionPane.PLAIN_MESSAGE);
            }
        });
        helpButton.setBounds(getWidth() - 190, 10, 80, 30);
        add(helpButton);

        // Already an user button
        JButton loginButton = new JButton("Already an user");
        loginButton.setFont(new Font("Nunito", Font.BOLD, 20));
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(new Color(167, 77, 37));
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(167, 77, 37), 2));
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Replace this code to redirect to login page
                JOptionPane.showMessageDialog(WelcomePage.this,
                        "This button is not yet functional.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        loginButton.setBounds(getWidth() - 560, getHeight() - 100, 170, 50);
        add(loginButton);

        // New user button
        JButton signUpButton = new JButton("New User");
        signUpButton.setFont(new Font("Nunito", Font.BOLD, 20));
        signUpButton.setBackground(new Color(167, 77, 37));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBorder(BorderFactory.createLineBorder(new Color(167, 77, 37), 2));
        signUpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signUpButton.setBorderPainted(false);
        signUpButton.setFocusPainted(false);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Replace this code to redirect to sign up page
                JOptionPane.showMessageDialog(WelcomePage.this,
                        "This button is not yet functional.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        signUpButton.setBounds(getWidth()  - 360, getHeight() - 100, 170, 50);
        add(signUpButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}