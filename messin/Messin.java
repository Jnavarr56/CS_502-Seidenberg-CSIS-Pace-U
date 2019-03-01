import java.awt.*;
import java.util.*;
import javax.swing.*; 

public class Messin {

    static boolean isEven(double num) {

        return num % 2 == 0 ? true : false;

    }
    public static void main(String[] args) {


        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel(Boolean.toString(isEven(3)), SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 1000));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

}

