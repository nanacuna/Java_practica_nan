package l_components_swing_1_7;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Layer extends JPanel {
	private JLabel text = new JLabel("En un lugar de la mancha de cuyo nombre....");
	private  JCheckBox check_1 = new JCheckBox("Bold");
	private  JCheckBox check_2 = new JCheckBox("Italic");
	private Font letter = new Font("Sherif", Font.PLAIN, 24);
	private JPanel layer_text = new JPanel();
	private JPanel layer_check = new JPanel();
	private Check verify = new Check();
	public Layer () {
		setLayout(new BorderLayout());
		text.setFont(letter);
		layer_text.add(text);
		add(layer_text, BorderLayout.CENTER);
		check_1.addActionListener(verify);
		check_2.addActionListener(verify);
		layer_check.add(check_1);
		layer_check.add(check_2);
		add(layer_check, BorderLayout.NORTH);
	}
	private class Check implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
 			int type = 0;
			if (check_1.isSelected()) type += Font.BOLD;
			if (check_2.isSelected()) type += Font.ITALIC;
			text.setFont(new Font ("Sherif", type, 24));
		}
	}
}
