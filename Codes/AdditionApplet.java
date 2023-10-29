import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionApplet extends Applet implements ActionListener {
    private TextField num1Field, num2Field;
    private Label resultLabel;
    private Button addButton;

    public void init() {
        num1Field = new TextField(10);
        num2Field = new TextField(10);

        resultLabel = new Label("Result: ");

        addButton = new Button("Add");
        addButton.addActionListener(this);

        add(new Label("Enter Number 1: "));
        add(num1Field);
        add(new Label("Enter Number 2: "));
        add(num2Field);
        add(addButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int sum = num1 + num2;
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input!");
            }
        }
    }
}
