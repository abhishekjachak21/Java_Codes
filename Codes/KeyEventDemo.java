import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo extends Applet implements KeyListener {
String msg=" Hi,How are you?";
public void init(){
addKeyListener(this);
}

<<<<<<< HEAD
<<<<<<< HEAD
public void getkeyinfo(KeyEvent e, String message){
=======
public void getkeyinfo(KeyEvent e){
>>>>>>> 799fb68 (java11sep)
=======
public void getkeyinfo(KeyEvent e, String message){
>>>>>>> 2f9fe89 (14sep)
		int keycode = e.getKeyCode();
		switch(keycode){
		case KeyEvent.VK_UP:
			msg=msg+"UP";
		case KeyEvent.VK_DOWN:
			msg=msg+"DOWN";
		case KeyEvent.VK_LEFT:
			msg=msg+"LEFT";
		case KeyEvent.VK_RIGHT:
			message=msg+"RIGHT";
		case KeyEvent.VK_F1:
			msg=msg+"F1";
			
		}
		repaint();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("key_pressed");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub	
		showStatus("key_released");
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		showStatus("key_typed");
		repaint();
	}

         public void paint(Graphics g){
         g.drawString(msg, 10, 10);
        }

}
