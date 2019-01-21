package eventos_de_foco;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Window extends JFrame implements WindowFocusListener {
	Main_Window frame1, frame2;
	public static void main(String[] args) {
		Main_Window window = new Main_Window();
		window.Start();
	}
	public void Start () {
		frame1 = new Main_Window();
		frame2 = new Main_Window();
		////////////////////////////
		frame1.setVisible(true);;
		frame2.setVisible(true);;
		////////////////////////////
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		///////////////////////////////////////////////
		Toolkit resolucion = Toolkit.getDefaultToolkit();
		Dimension dim = resolucion.getScreenSize();
		int ancho, alto;
		ancho  = dim.width;
		alto = dim.height;
		////////////////////////////////////////////////
		frame1.setBounds(ancho/160, alto/4, ancho/2, alto/2);
		frame2.setBounds(ancho/2, alto/4, ancho/2, alto/2);
		/////////////////////////////////////////////////////
		frame1.addWindowFocusListener(this);
		frame2.addWindowFocusListener(this);
	}
	///////////////////////////////////////////////////////////
	public void windowGainedFocus (WindowEvent e) {
		if (e.getSource()==frame1)
			frame1.setTitle("Marco 1");
		else
			frame2.setTitle("Marco 2");
	}
	public void windowLostFocus (WindowEvent e) {
		/*if (e.getSource()==frame1)
			frame1.setTitle("Marco 1");
		else
			frame2.setTitle("Marco 2");*/
	}
}
