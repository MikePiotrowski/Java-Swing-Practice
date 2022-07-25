import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Button implements ActionListener {

    private int count = 0;
    private final JLabel label;

    public Button(){

        JFrame frame = new JFrame();

        JButton button = new JButton("Click Me!");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");




        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Button 1");
        frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[] args){
        new Button();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("number of clicks " + count);

    }
}
