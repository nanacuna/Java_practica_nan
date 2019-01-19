package eventos_de_raton;
import java.awt.event.*;

public class Motion_Event implements MouseMotionListener {
	public void mouseDragged (MouseEvent e) {
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("Haz arrastrado un elemento con el bot�n IZQUIERDO del mouse");
		else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("Haz arrastrado un elemento con el bot�n DERECHO del mouse");
	}
	public void mouseMoved (MouseEvent e) {
		System.out.println("El mouse se est� desplazando");
	}
}
