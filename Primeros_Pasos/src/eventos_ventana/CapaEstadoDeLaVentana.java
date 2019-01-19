package eventos_ventana;
import java.awt.event.*;

public class CapaEstadoDeLaVentana implements WindowStateListener{
	@Override
	public void windowStateChanged (WindowEvent e) {
		System.out.println("La ventana ha cambiado de Estado");
		System.out.println(e.getNewState());
	}
}
