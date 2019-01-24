package layouts_example_calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sheet_Calculator1 extends JPanel {
	private JButton screen;
	private boolean first;
	//Sobreescribo método paint
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
	}
	//Constructor de la clase
	public Sheet_Calculator1 (){
		setLayout (new BorderLayout ());
		screen = new JButton ("0");
		screen.setEnabled(false);
		screen.setBackground(Color.WHITE);
		screen.setForeground(Color.BLACK);
		add(screen, BorderLayout.NORTH);
		add(new Sheet_Calculator2());
	}//FIN CONSTRUCTOR DE SHEET CALCULATOR 1
	private class Sheet_Calculator2 extends JPanel {
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
		}//FIN DEL PAINT COMPONENT
		public Sheet_Calculator2 () {
			setLayout (new GridLayout(4, 4));
			//Una forma de agregar botones (Es más larga)
			/*JButton uno = new JButton ("1");
			add (uno);
			JButton dos = new JButton ("2");
			add (dos);
			JButton tres = new JButton ("3");
			add (tres);
			JButton suma = new JButton ("+");
			add (suma);
			JButton cuatro = new JButton ("4");
			add (cuatro);
			JButton cinco = new JButton ("5");
			add (cinco);
			JButton seis = new JButton ("6");
			add (seis);
			JButton resta = new JButton ("-");
			add (resta);
			JButton siete = new JButton ("7");
			add (siete);
			JButton ocho = new JButton ("8");
			add (ocho);
			JButton nueve = new JButton ("9");
			add (nueve);
			JButton multi = new JButton ("*");
			add (multi);
			JButton cero = new JButton ("0");
			add (cero);
			JButton punto = new JButton (".");
			add (punto);
			JButton igual = new JButton ("=");
			add (igual);
			JButton div = new JButton ("/");
			add (div);*/
			//Instancio una clase del tipo ActionListener y la igualo
			//a la clase que implementa esa interfaz
			ActionListener insert = new Event_Calculator();
			//FORMA UN POCO MÁS SIMPLE DE AGREGAR BOTONES
			Put_Button ("7", insert);
			Put_Button ("8", insert);
			Put_Button ("9", insert);
			//Put_Button ("/");
			Put_Button ("4", insert);
			Put_Button ("5", insert);
			Put_Button ("6", insert);
			//Put_Button ("-");
			Put_Button ("1", insert);
			Put_Button ("2", insert);
			Put_Button ("3", insert);
			//Put_Button ("+");
			//Put_Button ("*");
			Put_Button ("0", insert);
			Put_Button (".", insert);
			//Put_Button ("=");
		}//FIN DEL CONSTRUCTOR DE SHEET CALCULATOR 2
		//CLASE PARA AGREGAR LOS EVENTOS DE LOS BOTONES
		private void Put_Button (String label, ActionListener listener) {
			JButton button = new JButton (label);
			button.addActionListener(listener);
			add(button);
		}// FIN CLASE PUT BUTTON
	}//FIN SHEET CALCULATOR 2
	//CLASE PARA AGREGAR LA ACCIÓN DE LOS BOTONES
	private class Event_Calculator implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			String entry = e.getActionCommand();
			if (first) {
				screen.set--¨2_-.e..e..e..e..e..BOTTOM_ALIGNMENT.-Çñ´.`.e..e..e..e..e...çççç..ç.ç..e.lse;
			}//Fin del if4
			screen.setText(screen.getText()+entry22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
		}
	}//FIN CLASE EVENT CALCULATOR
}//FIN SHEET CALCULATOR 1
