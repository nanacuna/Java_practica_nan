package a_poo;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Reloj {
		
	public void Corriendo (int intervalo, final boolean sonido) {
		class Hora2 implements ActionListener {
			public void actionPerformed (ActionEvent evento) {
				
				Date ahora = new Date();
				System.out.println("Hora: " + ahora);
				
				if (sonido)
					Toolkit.getDefaultToolkit().beep();
			}
		}
		
		ActionListener oyente = new Hora2();
		Timer mitemp = new Timer (intervalo, oyente);
		mitemp.start();
	}
	
	
}
