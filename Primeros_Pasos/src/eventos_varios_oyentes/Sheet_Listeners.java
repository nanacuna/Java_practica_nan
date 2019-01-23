package eventos_varios_oyentes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sheet_Listeners extends JPanel {
	//Declaro una variable  del tipo JButton 
	//fuera del constructor para poder reutilizarla
	JButton close_button;
	//Agrego los métodos del componente "paint"
	public void paintComponet (Graphics g) {
		super.paintComponent(g);
	}
	//Constructor de la clase
	public Sheet_Listeners () {
		//Declaro e  instancio el botón de nuevas ventanas
		JButton new_button = new JButton ("New Window");
		//Instancio el boton de "CERRAR  TODAS LAS VENTANAS"
		close_button = new JButton ("Close All");
		//Agrego los 2 botones a la lámina
		add (new_button);
		add (close_button);
		//INSTANCIO LA CLASE INTERNA
		New_Listener listener = new New_Listener ();
		new_button.addActionListener(listener);
	}
	//////////////////////////CLASE INTERNA//////////////////////////////
	private class New_Listener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			Frame_Emergent frame = new Frame_Emergent(close_button);
			frame.setVisible(true);
		}
	}
}
