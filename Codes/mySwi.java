import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
//11 sept 2023
//all by myself
//help-> Intellipat utube channel

public class mySwi{
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame f = new JFrame("Swing Example");
        f.setVisible(true);
        f.setSize(500, 300);

        f.setLayout(new FlowLayout());
        JLabel l1=new JLabel("UserName: ");
        f.add(l1);
        JTextField t1=new JTextField(16);  
        f.add(t1);
        JLabel l2=new JLabel("Paswword: ");
        f.add(l2);
        // JTextField t2=new JTextField(15);    //getPassword() fun is not for textfield so use passwordfield
        JPasswordField t2=new JPasswordField(15);   
        f.add(t2);

        JButton b1= new JButton("Submit");
        f.add(b1);

        //suggestions by chatGPT hehe

        // Add an ActionListener to the Submit button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event here
                String username = t1.getText();
                String password = new String(t2.getPassword()); // Get the password as a string

                // Perform validation or other actions here
                // For example, you can check if the username and password are correct
                if (username.equals("being_abhi.21") && password.equals("abhi6855")) 
                    JOptionPane.showMessageDialog(f, "Login successful!");
                else 
                    JOptionPane.showMessageDialog(f, "Login failed!");
                
            }
        });

        // Set the default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}