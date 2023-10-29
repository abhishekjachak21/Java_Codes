import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionCalculator {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public AdditionCalculator() {
        JFrame frame = new JFrame("Addition Calculator");
        frame.setLayout(new GridLayout(4, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel num1Label = new JLabel("Enter Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Enter Number 2:");
        num2Field = new JTextField(10);

        resultLabel = new JLabel("Result:");

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 + num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Invalid input!");
                }
            }
        });

        frame.add(num1Label);
        frame.add(num1Field);
        frame.add(num2Label);
        frame.add(num2Field);
        frame.add(new JLabel()); // Empty label for spacing
        frame.add(addButton);
        frame.add(resultLabel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdditionCalculator();
            }
        });
    }
}
