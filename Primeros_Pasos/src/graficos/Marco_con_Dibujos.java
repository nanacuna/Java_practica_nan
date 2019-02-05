package graficos;
import java.awt.*;
import javax.swing.*;

public class Marco_con_Dibujos extends JFrame {
	public Marco_con_Dibujos () {
		setTitle("Prueba dibujo");
		setSize (600,400);
		setLocation (300,100);
		
		LaminaConFiguras lamina = new LaminaConFiguras();
		add(lamina);
		lamina.setBackground(SystemColor.window);
	}
}
