import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");//defining the container and giving it title
//        or frame.setTitle("Hello world");
        JButton button = new JButton("click me");
        button.setBounds(100,100,50,50);
        frame.add(button);
        frame.setSize(400,400);//size for container
        frame.setResizable(false);  //        to restrict resizing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the window when close btn is clicked
        frame.getContentPane().setBackground(Color.RED);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}