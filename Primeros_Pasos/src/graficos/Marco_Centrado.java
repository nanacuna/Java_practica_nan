package graficos;
import java.awt.*;
import javax.swing.*;

public class Marco_Centrado extends JFrame {
	
	int alt, anc;
	
	public Marco_Centrado () {
		//setBounds (500, 300, 450, 250);
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension midim = mipantalla.getScreenSize();
		setTitle ("Jazz");
		
		alt = midim.height;
		anc = midim.width;
		
		//setBounds (anc/4, alt/4, anc/2, alt/2);
		setSize (anc/2, alt/2);
		setLocation (anc/4, alt/4);
		
		Image miIcono = mipantalla.getImage("src/graficos/gonza.jpg");
		setIconImage (miIcono);
		
	}

}
