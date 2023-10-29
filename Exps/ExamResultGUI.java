import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamResultGUI {
    private JFrame mainFrame;
    private JTextField[] marksFields;
    private JButton submitButton;

    // Constructor for creating the main GUI
    private ExamResultGUI() {
        mainFrame = new JFrame("Exam Result Calculator");
        mainFrame.setLayout(new GridLayout(0, 2)); // Grid layout for organizing components
        // mainFrame.setLayout(new FlowLayout());;

        marksFields = new JTextField[5]; // Assuming 5 subjects
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel("Subject " + (i + 1) + " Marks:"); // Label for each subject
            marksFields[i] = new JTextField(10); // Text field for entering marks
            mainFrame.add(label);
            mainFrame.add(marksFields[i]);
        }

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplayResult(); // Action when "Submit" button is clicked
            }
        });

        mainFrame.add(submitButton);
        mainFrame.pack(); // Automatically adjust frame size
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        mainFrame.setVisible(true); // Make the frame visible
    }

    // Method to calculate and display the result
    private void calculateAndDisplayResult() {
        int totalMarks = 0;
        for (JTextField field : marksFields) {
            try {
                totalMarks += Integer.parseInt(field.getText()); // Summing up marks
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(mainFrame, "Invalid input! Please enter valid marks.");
                return;
            }
        }

        double average = totalMarks / marksFields.length; // Calculate average marks
        String result = determineResult(average); // Determine Pass or Fail

        JFrame resultFrame = new JFrame("Result");
        resultFrame.setLayout(new GridLayout(4, 2)); // Grid layout for result display
        resultFrame.add(new JLabel("Total Marks:"));
        resultFrame.add(new JLabel(Integer.toString(totalMarks)));
        resultFrame.add(new JLabel("Average:"));
        resultFrame.add(new JLabel(Double.toString(average)));
        resultFrame.add(new JLabel("Result:"));
        resultFrame.add(new JLabel(result));
        resultFrame.pack(); // Automatically adjust result frame size
        resultFrame.setVisible(true); // Make the result frame visible
    }

    // Method to determine Pass or Fail based on average marks
    private String determineResult(double average) {
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ExamResultGUI()); // Create an instance of ExamResultGUI
    }
}









/* 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamResultGUI {
    private JFrame mainFrame;
    private JTextField[] marksFields;
    private JButton submitButton;

    private ExamResultGUI() {
        mainFrame = new JFrame("Exam Result Calculator");
        mainFrame.setLayout(new GridLayout(0, 2));

        marksFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            addSubjectInput(i + 1);
        }

        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> calculateAndDisplayResult());

        mainFrame.add(submitButton);
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    private void addSubjectInput(int subjectNumber) {
        JLabel label = new JLabel("Subject " + subjectNumber + " Marks:");
        JTextField textField = new JTextField(10);
        marksFields[subjectNumber - 1] = textField;
        mainFrame.add(label);
        mainFrame.add(textField);
    }

    private void calculateAndDisplayResult() {
        int totalMarks = 0;
        for (JTextField field : marksFields) {
            try {
                totalMarks += Integer.parseInt(field.getText());
            } catch (NumberFormatException e) {
                showError("Invalid input! Please enter valid marks.");
                return;
            }
        }

        double average = (double) totalMarks / marksFields.length;
        String result = (average >= 40) ? "Pass" : "Fail";

        displayResult(totalMarks, average, result);
    }

    private void displayResult(int totalMarks, double average, String result) {
        JFrame resultFrame = new JFrame("Result");
        resultFrame.setLayout(new GridLayout(3, 2));
        resultFrame.add(new JLabel("Total Marks:"));
        resultFrame.add(new JLabel(Integer.toString(totalMarks)));
        resultFrame.add(new JLabel("Average:"));
        resultFrame.add(new JLabel(String.format("%.2f", average)));
        resultFrame.add(new JLabel("Result:"));
        resultFrame.add(new JLabel(result));
        resultFrame.pack();
        resultFrame.setVisible(true);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(mainFrame, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ExamResultGUI::new);
    }
}
 */