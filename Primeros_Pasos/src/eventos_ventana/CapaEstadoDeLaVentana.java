package eventos_ventana;
import java.awt.Frame;
import java.awt.event.*;

public class CapaEstadoDeLaVentana implements WindowStateListener{
	@Override
	public void windowStateChanged (WindowEvent e) {
		//System.out.println("La ventana ha cambiado de Estado");
		//System.out.println(e.getNewState());
		if (e.getNewState()==Frame.MAXIMIZED_BOTH) 
			System.out.println("La ventana está Maximizada");
		else if (e.getNewState()==Frame.NORMAL)
			System.out.println("La ventana está Normal");
		else if (e.getNewState()==Frame.ICONIFIED)
			System.out.println("La ventana está Minimizada");
	}
}
