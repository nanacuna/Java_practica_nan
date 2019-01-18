package eventos_ventana;
import java.awt.event.*;

public class CapaVentana1 implements WindowListener {
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana Activada");
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("La ventana ha sido cerrada");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando Ventana");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana Desactivada");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana Restaurada");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana Minimizada");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana Abierta");
	}
}
