
import java.awt.event.*;
import java.awt.*;

public class MyWindow extends WindowAdapter implements MouseListener {
    private Frame myFrame;
    private Label label1;

    public MyWindow() {
        myFrame = new Frame();
        myFrame.setSize(300, 300);
        myFrame.setTitle("AWT frame program");
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.addWindowListener(this);

        label1 = new Label("");
        label1.setBounds(100, 200, 100, 30);
        myFrame.add(label1);

        myFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                myFrame.dispose();
            }
        });

        myFrame.addMouseListener(this);
    }

    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        myFrame.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label1.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label1.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label1.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label1.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label1.setText("Mouse Exited");
    }
}
