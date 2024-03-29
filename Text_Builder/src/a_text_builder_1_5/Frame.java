package a_text_builder_1_5;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
	public Frame () {
		Toolkit resolution = Toolkit.getDefaultToolkit();
		Dimension dim =  resolution.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds(ancho/4, alto/4, ancho/2, alto/2);
		//---------------------------------------------------
		setTitle("Atajos del Teclado");
		Image im = resolution.createImage("../Primeros_Pasos/imagenes/blue.png");
		setIconImage(im);
		//---------------------------------------------------
		Layer layer = new Layer();
		add(layer);
		layer.setBackground(SystemColor.window);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
