import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel label = new JLabel("Welcome to Login page");
        JTextField username = new JTextField("Enter username");
        JTextField address = new JTextField("Enter address");
        JButton loginBtn = new JButton("Login");
        String[] arr = {"Apple","Orange","Grapes"};
        JComboBox  comboBox = new JComboBox(arr);
        label.setBounds(10,0,200,20);
        username.setBounds(10,20,200,50);
        address.setBounds(10,70,200,50);
        loginBtn.setBounds(10,120,200,30);
        comboBox.setBounds(10,180,200,30);
        frame.add(label);
        frame.add(username);
        frame.add(address);
        frame.add(loginBtn);
        frame.add(comboBox);
        frame.setSize(400,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}