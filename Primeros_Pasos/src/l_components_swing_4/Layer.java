package l_components_swing_4;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

public class Layer extends JPanel {
	Color red = new Color (221, 83, 71);
	JPanel top_layer = new JPanel();
	JLabel label_1 = new JLabel("User");
	JLabel label_2 = new JLabel("Password");
	JTextField login = new JTextField(10);
	JPasswordField pass = new JPasswordField(10);
	JButton submit = new JButton("Submit");
	CheckPass check_pass = new CheckPass();
	JLabel information = new JLabel("The password must be between 8 and 12 characters");
	public Layer () {
		setLayout(new BorderLayout());
		top_layer.setLayout(new GridLayout(3, 2));
		add(top_layer, BorderLayout.NORTH);
		top_layer.add(label_1);
		top_layer.add(login);
		top_layer.add(label_2);
		top_layer.add(pass);
		add(submit, BorderLayout.SOUTH);
		top_layer.add(information);
		information.setForeground(red);
		pass.getDocument().addDocumentListener(check_pass);
	}
	///-------------EVENTS-----------------//
	private class CheckPass implements DocumentListener{
		private char[] passw;
		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
		@Override
		public void insertUpdate(DocumentEvent e) {
			passw = pass.getPassword();
			if (passw.length < 8 || passw.length > 12) {
				pass.setBackground(red);
			}
			else
				pass.setBackground(Color.WHITE);
		}
		@Override
		public void removeUpdate(DocumentEvent e) {
			passw = pass.getPassword();
			if (passw.length < 8 || passw.length > 12) {
				pass.setBackground(red);
			}
			else
				pass.setBackground(Color.WHITE);
		}
		
	}
}
