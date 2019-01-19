package eventos_de_raton;
import java.awt.event.*;

public class AdaptadorDeEventosDelMouse extends MouseAdapter {
	public void mouseClicked (MouseEvent e) {
		System.out.println("Haz hecho click");
	}
}
