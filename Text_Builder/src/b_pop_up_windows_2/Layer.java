package b_pop_up_windows_2;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JButton btn_1 = new JButton("Button 1");
	private JButton btn_2 = new JButton("Button 2");
	private JButton btn_3 = new JButton("Button 3");
	private JButton btn_4 = new JButton("Button 4");
	private ImageIcon icon = new ImageIcon("assets/theme/r.png");
	
	public Layer () {
		btn_1.addActionListener(new ActionButtons());
		btn_2.addActionListener(new ActionButtons());
		btn_3.addActionListener(new ActionButtons());
		btn_4.addActionListener(new ActionButtons());
		add(btn_1);
		add(btn_2);
		add(btn_3);
		add(btn_4);
	}
	private class ActionButtons implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn_1) {
//				JOptionPane.showMessageDialog(Layer.this, "You have pressed the button 1", "Button 1", 0);
//				JOptionPane.showInputDialog(Layer.this, "Enter name: ", "Data Entry", 1);
//				JOptionPane.showConfirmDialog(Layer.this, "Options", "Confirm", 0);
				JOptionPane.showOptionDialog(Layer.this, "Select", "Window of Options", 1, 1, icon, null, null);
			}
			else if (e.getSource() == btn_2)
				JOptionPane.showMessageDialog(Layer.this, "You have pressed the button 2", "Button 2", 1);
			else if (e.getSource() == btn_3)
				JOptionPane.showMessageDialog(Layer.this, "You have pressed the button 3", "Button 3", 2);
			else
				JOptionPane.showMessageDialog(Layer.this, "You have pressed the button 4", "Button 4", 3);
		}
	}
}
