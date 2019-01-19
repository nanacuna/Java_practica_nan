package eventos_de_raton;
import java.awt.event.*;

public class AdaptadorDeEventosDelMouse extends MouseAdapter {
	public void mouseClicked (MouseEvent e) {
		/*System.out.println("Coordenada X: "+e.getX()+ 
						"\nCoordenanda Y: "+e.getY());*/
		//System.out.println(e.getClickCount());
	}
	public void mousePressed (MouseEvent e) {
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("Haz pulsado el botón izquierdo del mouse");
		else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK)
			System.out.println("Haz pulsado la rueda del mousse");
		else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("Haz pulsado el botón derecho del mouse");
	}
}
