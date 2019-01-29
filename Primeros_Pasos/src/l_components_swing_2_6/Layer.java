package l_components_swing_2_6;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Layer extends JPanel {
	private JSpinner control = new JSpinner(new SpinnerModel());
	private Dimension dim = new Dimension(100, 20);
	public Layer () {
		//setLayout(new BorderLayout());
		control.setPreferredSize(dim);
		add(control);
		
	}
	private class SpinnerModel extends SpinnerNumberModel{
		public SpinnerModel() {
			super(5, 0, 10, 1);
		}
		@Override
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		@Override
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
}
