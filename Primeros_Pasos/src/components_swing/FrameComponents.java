package components_swing;
import javax.swing.*;
import java.awt.*;

public class FrameComponents extends JFrame {
	public FrameComponents () {
		Toolkit resolution = Toolkit.getDefaultToolkit();
		Dimension dim = resolution.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds(ancho/4, alto/4, ancho/2, alto/2);
		setTitle("Probando textos");
		LayerComponents layer = new LayerComponents();
		add(layer);
		layer.setBackground(SystemColor.window);
		setVisible (true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
