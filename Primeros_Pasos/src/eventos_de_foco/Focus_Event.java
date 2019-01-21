package eventos_de_foco;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Focus_Event extends JPanel {
	JTextField cuadro1, cuadro2;
	////////////////////////////////////////////////
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		///Instancio la clase interna
		Foco foco1 = new Foco ();
		//Pongo a la escucha al cuadro 1
		cuadro1.addFocusListener (foco1);
	}
	////////////////Clase Interna/////////////////
	private class Foco implements FocusListener {
		public void focusGained (FocusEvent e) {
			
		}
		public void focusLost (FocusEvent e) {
			String mail = cuadro1.getText();
			int comp = 0;
			boolean punto = true;
			for (int i=0; i<mail.length(); i++) {
				if (mail.charAt(i) == '@')
					comp++;
				if (mail.charAt(0) == '.' || mail.charAt(mail.length()-1) == '.')
					punto = false;
			}
			if (comp == 1 && punto == true)
				System.out.println("El mail es CORRECTO");
			else
				System.out.println("El mail es INCORRECTO");
		}
	}
}



	
