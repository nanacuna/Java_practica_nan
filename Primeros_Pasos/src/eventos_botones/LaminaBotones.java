package eventos_botones;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LaminaBotones extends JPanel{
	public void paintComponent (Graphics g){
		super.paintComponent(g);
	}
	JButton boton = new JButton ("Azul");
	JButton botonam = new JButton ("Amarillo");
	JButton botonro = new JButton ("Rojo");
	JButton botonne = new JButton ("Negro");
	JButton botonpi = new JButton ("Rosa");
	JButton botoncy = new JButton ("Celeste");
	////////////////////////////////////////////////
	public LaminaBotones() {
		add(boton);
		add(botonam);
		add(botonro);
		add(botonne);
		add(botonpi);
		add(botoncy);
		///////////////////////////////////////////////////////
		ColorFondo amarillo = new ColorFondo (Color.YELLOW);
		ColorFondo azul = new ColorFondo (Color.BLUE);
		ColorFondo rojo = new ColorFondo (Color.RED);
		ColorFondo negro = new ColorFondo (Color.BLACK);
		ColorFondo rosa = new ColorFondo (Color.PINK);
		ColorFondo celeste = new ColorFondo (Color.CYAN);
		//////////////////////////////////////////////////////
		boton.addActionListener(azul);
		botonam.addActionListener(rojo);
		botonro.addActionListener(amarillo);
		botonne.addActionListener(negro);
		botonpi.addActionListener(rosa);
		botoncy.addActionListener(celeste);
	}
	private class ColorFondo implements ActionListener {
		private Color Fondo;
		///////////////////////////////////
		public ColorFondo (Color c) {
			Fondo = c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground (Fondo);
		}
	}
}
