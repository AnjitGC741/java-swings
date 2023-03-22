import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hello world");

        JButton button = new JButton("click me");
        button.setBounds(100,100,100,50);
        frame.add(button);
        JButton buttonNew = new JButton("click me again");
        buttonNew.setBounds(200,200,100,50);
        frame.add(buttonNew);
        JLabel text = new JLabel("mine first text");
        text.setBounds(300,00,100,50);
        frame.add(text);
        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}