package holaaaa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		
		JButton btn = new JButton("btn");
		add(btn);
		
		btn.addActionListener( new Mi_accion("Agustin"));
		
		
		setBounds(100,100,800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	//eventos
	class Mi_accion extends Accion{
		String nombre;
		public Mi_accion(String nombre) {
			this.nombre = nombre;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			super.actionPerformed(e);
			System.out.println(" " + nombre);
			
		}
	}
	
	
	class Accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.print("hola");
			
		}
		
	}
}
