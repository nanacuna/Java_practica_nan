package a_exception_2;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class Frame extends JFrame {
	public Frame() {
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds (ancho/4, alto/4, ancho/2, alto/2);
		setTitle("Agregando Imagen");
		Image im = resolucion.createImage("../Primeros_Pasos/src/graficos/panda.jpg");
		setIconImage(im);
		Layer lamina = new Layer();
		add(lamina);
		
	}
}
