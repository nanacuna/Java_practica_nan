package c_free_disposal;
import javax.swing.*;

public class Layer extends JPanel {
	
	private JLabel name = new JLabel("Name: ");
	private JLabel last_name = new JLabel("Last Name: ");
	private JLabel age = new JLabel("Age: ");
	private JLabel phone = new JLabel("Phone: ");
	private JTextField text_name = new JTextField();
	private JTextField text_lastName = new JTextField();
	private JTextField text_age = new JTextField();
	private JTextField text_phone = new JTextField();
	
	public Layer () {
		setLayout(new place_components());
		add(name);
		add(text_name);
		add(last_name);
		add(text_lastName);
		add(age);
		add(text_age);
		add(phone);
		add(text_phone);
	}
}
