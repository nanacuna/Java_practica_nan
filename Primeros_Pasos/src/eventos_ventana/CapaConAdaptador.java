package eventos_ventana;
import java.awt.event.*;

public class CapaConAdaptador extends WindowAdapter {
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimizada");
	}
}
