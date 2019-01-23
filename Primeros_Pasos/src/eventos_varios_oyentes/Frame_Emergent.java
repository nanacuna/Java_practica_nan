package eventos_varios_oyentes;
import javax.swing.*;
import java.awt.event.*;

public class Frame_Emergent extends  JFrame {
	//Declaro un variable  estática para incrementar el número de ventanas
	private  static int i=0;
	//Constructor de la clase
	public Frame_Emergent (JButton button_sheet_listener) {
		//Incremento del contador
		i++;
		//Le doy titulo a las ventanas
		setTitle ("Ventana "+i);
		//Le doy tamaño a  las  ventanas
		setBounds (40*i, 40*i, 800, 450);
		//INSTANCIO LA CLASE INTERNA
		Close_All close = new Close_All ();
		//Hago que el botón recibido como parámetro desencade
		//la acción de la clase intern  ´` ¡ 
		  
		
		
		
		button_sheet_listener.addActionListener(close);
	}
	//CLASE INTERNA
	private  class Close_All implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e) {
			dispose();
		}
	}
}
