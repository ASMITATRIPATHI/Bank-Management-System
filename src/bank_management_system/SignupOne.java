
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class SignupOne extends JFrame {
    
    SignupOne() {
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 35));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(100, 120, 400, 30);
        add(name);
        JTextField nameText = new JTextField();
        nameText.setFont(new Font("Arial", Font.BOLD, 20));
        nameText.setBounds(300, 120, 400, 30);
        add(nameText);
        
        JLabel fatherName = new JLabel("Father's Name: ");
        fatherName.setFont(new Font("Arial", Font.BOLD, 20));
        fatherName.setBounds(100, 170, 400, 50);
        add(fatherName);
        
        JLabel dateOfBirth = new JLabel("Date of Birth: ");
        dateOfBirth.setFont(new Font("Arial", Font.BOLD, 20));
        dateOfBirth.setBounds(100, 220, 400, 50);
        add(dateOfBirth);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(100, 270, 400, 50);
        add(gender);
        
        JLabel emailID = new JLabel("Email Address: ");
        emailID.setFont(new Font("Arial", Font.BOLD, 20));
        emailID.setBounds(100, 320, 400, 50);
        add(emailID);
        
        JLabel maritalStat = new JLabel("Marital Status: ");
        maritalStat.setFont(new Font("Arial", Font.BOLD, 20));
        maritalStat.setBounds(100, 370, 400, 50);
        add(maritalStat);
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(100, 420, 400, 50);
        add(address);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(100, 470, 400, 50);
        add(city);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(100, 520, 400, 50);
        add(state);
        
        JLabel pinCode = new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Arial", Font.BOLD, 20));
        pinCode.setBounds(100, 570, 400, 50);
        add(pinCode);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
    
}
