package poo;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class Hora implements ActionListener {
	
	public void actionPerformed (ActionEvent e) {
		Date ahora = new Date();	
		System.out.println("Hora: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}

}
