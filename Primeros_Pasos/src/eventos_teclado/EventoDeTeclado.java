package eventos_teclado;
import java.awt.event.*;

public class EventoDeTeclado implements KeyListener {
	
	public void keyPressed (KeyEvent e) {
		//System.out.println(e.getKeyChar());
		int a = e.getKeyCode();
		System.out.println(a);
		//System.out.println(e.getExtendedKeyCode());
		//System.out.println(e.getID());
		
		System.out.println(KeyEvent.getKeyModifiersText(a));
	}
	public void keyReleased (KeyEvent e) {
		//System.out.println(e.getKeyCode());
		//System.out.println(e.getKeyChar());
	}
	public void keyTyped (KeyEvent e) {
		//System.out.println(e.getKeyLocation());
	}
}
