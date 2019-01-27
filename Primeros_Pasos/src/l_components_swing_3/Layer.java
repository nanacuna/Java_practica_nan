package l_components_swing_3;
import java.awt.Color;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

public class Layer extends JPanel {
	Color letter = new Color (75, 139, 244);
	ListenerText the_event = new ListenerText();
	JTextField text = new JTextField(20);
	Document mydoc = text.getDocument();
	
	public Layer () {
		mydoc.addDocumentListener(the_event);
		add(text);
		text.setForeground(letter);
	}
	
	private class ListenerText implements DocumentListener{
		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Haz introducido texto");
		}
		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Haz borrado texto");
		}
	}
}
