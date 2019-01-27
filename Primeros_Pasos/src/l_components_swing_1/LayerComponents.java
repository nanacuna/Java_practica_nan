package l_components_swing_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayerComponents extends JPanel {
	
	private JPanel layer2  = new JPanel();
	private JTextField field = new JTextField (20);
	private JLabel label_email = new JLabel("Introduzca su Email: ");
	private JLabel result = new JLabel("",  JLabel.CENTER);
	private GetKey key = new GetKey ();
	private JButton btn = new JButton(key);
	
	private InputMap entry;
	private ActionMap map;
	//-----------------------------------------
	public LayerComponents () {
		setLayout (new BorderLayout());
		add(layer2, BorderLayout.NORTH);
		layer2.setLayout(new FlowLayout());
		layer2.add(label_email);
		layer2.add (field);

		add(result, BorderLayout.CENTER);
		layer2.add (btn);
		//------------------------------------------
		entry = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		entry.put(KeyStroke.getKeyStroke("ENTER"), "OK");
		map = getActionMap();
		map.put("OK", key);
	}
	
	//Events
	private class GetKey extends AbstractAction{
		private int at;
		private boolean point;
		private String mail;
		public GetKey () {
			putValue (NAME, "OK");
			putValue (SHORT_DESCRIPTION, "Presione el boton para ingresar su mail o ENTER");
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			at = 0;
			mail = field.getText().trim();
			for (int i=0; i<mail.length(); i++) {
				if (mail.charAt(i) == '@')
					at++;
				if (mail.charAt(0)=='.' || mail.charAt(mail.length()-1)=='.')
					point = false;
				else
					point = true;
			}
			//----------------------------------------------------------------
			if ( at != 1  || point == false){
				result.setText("Email Incorrecto");
				result.setForeground(Color.RED);
			}
			else{
				result.setText("Email Correcto");
				result.setForeground(Color.GREEN);
			}
		}
	}
}
