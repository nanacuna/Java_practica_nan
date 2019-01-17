package graficos;
import javax.swing.*;
import java.awt.*;

public class Cristal extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Estoy aprendiendo Swing", 100, 100);
	}
}
