package ventana_nan;
import java.awt.*;
import javax.swing.*;

public class Dibujo_Marco extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Estoy intentando recordar yo solo lo que puedo hacer de swing", 300, 150);
	}
}
