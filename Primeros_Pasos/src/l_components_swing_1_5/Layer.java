package l_components_swing_1_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

public class Layer extends JPanel {
	private Color yellow =new Color (255, 231, 147);
	private JTextArea my_area = new JTextArea(8, 20);
	private JScrollPane bar_blade = new JScrollPane (my_area);
	private JButton btn = new JButton("OK");
	public Layer () {
		add(bar_blade);
		my_area.setBackground(yellow);
		//my_area.setLineWrap(true);
		btn.addActionListener(new Area_Text());
		add(btn);
	}
	private class Area_Text implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(my_area.getText());
		}
	}
}
