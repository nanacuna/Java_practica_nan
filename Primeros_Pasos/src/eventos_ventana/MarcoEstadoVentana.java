package eventos_ventana;
import javax.swing.*;

public class MarcoEstadoVentana extends JFrame {
	public MarcoEstadoVentana () {
		setVisible (true);
		setBounds (400, 225, 500, 350);
		//Instanciacion de forma reducida/abreviada
		addWindowStateListener(new CapaEstadoDeLaVentana());
	}
}
