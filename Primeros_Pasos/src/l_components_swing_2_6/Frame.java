package l_components_swing_2_6;
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
		setTitle("JSpinnerNumber2");
		Image im = resolution.createImage("imagenes/blue.png");
		setIconImage(im);
		//---------------------------------------------------
		Layer layer = new Layer();
		add(layer);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
