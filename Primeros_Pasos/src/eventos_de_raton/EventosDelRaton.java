package eventos_de_raton;
import java.awt.event.*;

public class EventosDelRaton implements MouseListener {
	public void mouseClicked (MouseEvent e) {
		System.out.println("Haz hecho click");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("Haz entrado");
	}
	public void mouseExited (MouseEvent e) {
		System.out.println("Haz salido");
	}
	public void mousePressed (MouseEvent e) {
		System.out.println("Haz presionado el mousse");
	}
	public void mouseReleased (MouseEvent e) {
		System.out.println("Haz soltado el botón del mousse");
	}
}
