
package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login () {
        
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        //For card number
        JLabel cardno = new JLabel("Card No: ");
        cardno.setBounds(120, 150, 150, 30);
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        //For pin
        JLabel pin = new JLabel("Pin: ");
        pin.setBounds(120, 220, 250, 30);
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        //Buttons
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        //Setting up the frame    
        getContentPane().setBackground(Color.white);
        
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == login){
            
        }
        else if(ae.getSource() == signup){
            
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
