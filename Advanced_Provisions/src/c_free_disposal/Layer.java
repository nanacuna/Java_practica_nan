package c_free_disposal;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JLabel name = new JLabel("Name: ");
	private JLabel last_name = new JLabel("Last Name: ");
	private JTextField text_name = new JTextField();
	private JTextField text_lastName = new JTextField();
	
	public Layer () {
		setLayout(null);
		name.setBounds(10, 10, 50, 50);
		last_name.setBounds(10, 40, 100, 50);
		text_name.setBounds(80, 25, 150, 20);
		text_lastName.setBounds(80, 55, 150, 20);
		add(name);
		add(last_name);
		add(text_name);
		add(text_lastName);
	}
}
