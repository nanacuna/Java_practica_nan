package ventana_nan;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Capa extends JPanel {
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Lista: ", 20, 20);
		g.drawString("1) Rectángulo", 70, 40);
		g.drawString("2) Elipse", 20, 220);
		g.drawString("3) Círculo", 500, 140);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rect = new Rectangle2D.Double(150, 10, 300, 150);
		g2.draw(rect);
		g2.draw(new Ellipse2D.Double(20, 200, 300, 150));
		//double centroX = rect.getCenterX();
		//double centroY = rect.getCenterY();
		//Ellipse2D circulo = new Ellipse2D.Double();
		//circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		Ellipse2D circulo = new Ellipse2D.Double(400, 150, 250, 250);
		g2.draw(circulo);
	}

}
