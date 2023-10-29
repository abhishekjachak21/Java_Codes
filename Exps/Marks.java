// package exp3;
import java.awt.*;
import java.awt.event.*;
public class Marks extends Frame implements ActionListener {
Frame f,f2;
Label l1,l2,l3,l4,l5,l6,l7;
TextField t1,t2,t3,t4,t5;
//
Marks()
{
Button Submit;
f=new Frame("MARKS");
f2=new Frame();
f.setTitle("Marks");
l1=new Label("CS");
l1.setBounds(50,50,100,30);
l2=new Label("DC");
l2.setBounds(50, 100, 100 ,30);
l3=new Label("Java");
l3.setBounds(50, 150, 100 ,30);
l4=new Label("C++");
l4.setBounds(50, 200, 100 ,30);
l5=new Label("OOPS");
l5.setBounds(50, 250, 100 ,30);
t1=new TextField();
t1.setBounds(200, 50, 100 ,30);
t2=new TextField();
t2.setBounds(200, 100, 100 ,30);
t3=new TextField();
t3.setBounds(200, 150, 100 ,30);
t4=new TextField();
t4.setBounds(200, 200, 100 ,30);
t5=new TextField();
t5.setBounds(200, 250, 100 ,30);

Submit = new Button("Submit");
Submit.addActionListener(this);
Submit.setBounds(150,300,100,30);
//
//
//
//
//
//
//
l6=new Label();
l6.setBounds(50,350,100,30);
l7=new Label();
l7.setBounds(200,350,100,30);
this.add(l1);
this.add(l2);
this.add(l3);
this.add(l4);
this.add(l5);
this.add(l7);
this.add(l6);
this.add(t1);
this.add(t2);
this.add(t3);
this.add(t4);
this.add(t5);
this.add(Submit);
this.setSize(400,400);
this.setLayout(null);
this.setVisible(true);
this.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}

});
}
public static void main(String[] args) {
// TODO Auto-generated method stub
new Marks();
}
@Override
public void actionPerformed(ActionEvent e) {
l6=new Label();
l6.setBounds(50,50,100,30);
l7=new Label();
l7.setBounds(200,50,100,30);
Frame f1=new Frame(" ");
f1.setLayout(null);
f1.setVisible(true);
f1.setSize(400,400);
f1.add(l7);
f1.add(l6);
f1.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f1.dispose();
}
});
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int n3=Integer.parseInt(t3.getText());
int n4=Integer.parseInt(t4.getText());
int n5=Integer.parseInt(t5.getText());
int total=n1+n2+n3+n4+n5;
double sum=(double)(total)/5;l7.setText("Percentage : "+sum);
l6.setText("Total Marks : "+total);
}
}