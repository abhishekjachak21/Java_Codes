/*  import javax.swing.*;
import java.awt.event.*;

 public class myExample extends JFrame{

  JLabel l1,l2,l3,l4;
  JTextField t1,t2;
  JButton b1;

  public myExample(){};
  public myExample(String s){
    super(s);
  }
  
  public void setComponents(){
    l1=new JLabel("Addition of two numbers");
    l2=new JLabel("first number: ");
    l3=new JLabel("second number: ");
    l4=new JLabel(); //why blank

    t1=new JTextField();
    t2=new JTextField();

    b1=new JButton("ADD");

    setLayout(null);

    l1.setBounds(50, 50, 200, 20);
    l2.setBounds(50, 80, 100, 20);
    t1.setBounds(180, 80, 100, 20);
    l3.setBounds(50, 130, 100, 20);
    t2.setBounds(180, 130, 100, 20);
    b1.setBounds(80, 180, 100, 20);
    l4.setBounds(60, 220, 250, 20); // Adjusted the vertical position to 220

    b1.addActionListener(new Handler(t1, t2, l4));

    add(l1);
    add(l2);
    add(t1);
    add(l3);
    add(t2);
    add(b1);
    add(l4);
    
  }

  public static void main(String[] args){
        myExample ex=new myExample("SWING Example");
        ex.setComponents();

        ex.setSize(300,300);
        ex.setVisible(true);
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}

class Handler implements ActionListener{
     
    private JTextField t1;
    private JTextField t2;
    private JLabel l4;

   public Handler(JTextField t1, JTextField t2, JLabel l4) {
        this.t1 = t1;
        this.t2 = t2;
        this.l4 = l4;
    }
    
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int s=a+b;
        l4.setText("Addition is: "+s);
     }
 
}


 */




 //same pgm inshort
import javax.swing.*;
import java.awt.event.*;

public class myExample extends JFrame {

    public myExample(String s) {
        super(s);
        setComponents();
    }
  
    public void setComponents() {
      JLabel l1 = new JLabel("Addition of two numbers");
      JLabel l2 = new JLabel("first number: ");
      JLabel l3 = new JLabel("second number: ");
      JLabel l4 = new JLabel(); // why blank

      JTextField t1 = new JTextField();
      JTextField t2 = new JTextField();

      JButton b1 = new JButton("ADD");

      setLayout(null);

      l1.setBounds(50, 50, 200, 20);
      l2.setBounds(50, 80, 100, 20);
      t1.setBounds(180, 80, 100, 20);
      l3.setBounds(50, 130, 100, 20);
      t2.setBounds(180, 130, 100, 20);
      b1.setBounds(80, 180, 100, 20);
      l4.setBounds(60, 220, 250, 20); // Adjusted the vertical position to 220

      b1.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {

      int a = Integer.parseInt(t1.getText());
      int b = Integer.parseInt(t2.getText());
      int s = a + b;
      l4.setText("Addition is: " + s);

      }
      });

      add(l1);
      add(l2);
      add(t1);
      add(l3);
      add(t2);
      add(b1);
      add(l4);
    }

    public static void main(String[] args) {
      myExample ex = new myExample("SWING Example");
      ex.setSize(300, 300);
      ex.setVisible(true);
      ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
