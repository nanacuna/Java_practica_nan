package l_components_swing_2_1;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JLabel text = new JLabel("Nadie nunca me dio tanta luz, para nadie fui tan importante");
	private JComboBox mycombo = new JComboBox();
	private JPanel layer_combo = new JPanel();
	private Change_source type = new Change_source();
	public Layer () {
		setLayout(new BorderLayout());
		text.setFont(new Font ("Arial", Font.PLAIN, 18));
		add(text, BorderLayout.CENTER);
		mycombo.setEditable(true);
		mycombo.addItem("Serif");
		mycombo.addItem("Arial");
		mycombo.addItem("Symbol");
		mycombo.addItem("Monospaced");
		mycombo.addItem("Dialog");
		mycombo.addActionListener(type);
		layer_combo.add(mycombo);
		add(layer_combo, BorderLayout.NORTH);
		
	}
	private class Change_source implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			text.setFont(new Font ((String)mycombo.getSelectedItem(), Font.PLAIN, 18));
		}
	}
}
