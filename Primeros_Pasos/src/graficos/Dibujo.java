package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;

public class Dibujo extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Figuras de Nancy", 25, 25);
		g.drawString("Combinación de figuras", 25, 50);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rect = new Rectangle2D.Double(100, 200, 400, 250);
		g2.draw(rect);
		g2.draw(new Line2D.Double(100, 200, 500, 450));
		g2.draw(new Line2D.Double(500, 200, 100, 450));
		g2.draw(new Line2D.Double(300, 200, 300, 450));
		g2.draw(new Line2D.Double(100, 325, 500, 325));
		
		g2.draw(new Ellipse2D.Double(100, 200, 400, 250));
		
		double centroX = rect.getCenterX();
		double centroY = rect.getCenterY();
		double radio = 237;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);
		
	}
}
