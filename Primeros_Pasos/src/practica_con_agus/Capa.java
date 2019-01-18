package practica_con_agus;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Capa extends JPanel implements ActionListener {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Probando color", 50, 50);
	}
	
	//Creando Boton
	JButton boton_Azul = new JButton ("Azul");
	JButton boton_amarillo = new JButton ("Amarillo");
	JButton boton_rojo = new JButton ("Rojo");
	//Creando Constructor
	public Capa () {
		//Agrego los botones al menu
		add(boton_Azul);
		add(boton_amarillo);
		add(boton_rojo);
		
		//Declaro sobre quien realiza la accion
		boton_Azul.addActionListener(this);
		boton_amarillo.addActionListener(this);
		boton_rojo.addActionListener(this);
	}
	//Sobrescribo metodo de la interfaz ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cree un objeto del tipo Object
		//Y lo igualo a la fuente del objeto ActionEvent
		Object obj = e.getSource();
		//
		if (obj == boton_Azul)
			setBackground (Color.BLUE);
		else if (obj == boton_amarillo)
			setBackground (Color.YELLOW);
		else
			setBackground (Color.RED);
	}
}
