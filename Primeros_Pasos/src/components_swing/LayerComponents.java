package components_swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayerComponents extends JPanel {
	private JPanel layer_2  = new JPanel();
	private JTextField text_field_email = new JTextField (20);
	private JLabel label_email = new JLabel("Introduzca su Email: ");
	private JLabel label_result = new JLabel("",  JLabel.CENTER);
	private GetKey key = new GetKey();
	private JButton btn_ok = new JButton(key);
	private InputMap entry;
	private ActionMap map;
	//-----------------------------------------
	public LayerComponents () {
		setLayout (new BorderLayout());
		
		add(label_result, BorderLayout.CENTER);
			label_result.getForeground().getColorSpace();
		
		add(layer_2, BorderLayout.NORTH);
			layer_2.setLayout(new FlowLayout());	
			layer_2.add(label_email);		
			layer_2.add (text_field_email);
			layer_2.add (btn_ok);	
		
		//------------------------------------------
		entry = getInputMap(WHEN_IN_FOCUSED_WINDOW);
		entry.put(KeyStroke.getKeyStroke("ENTER"), "accion");
		map = getActionMap();
		map.put("accion", key);
	}
	
	private class GetKey extends AbstractAction{
		private int at = 0;
		private boolean point;
		private String mail;
		
		public GetKey () {
			putValue (NAME, "OK");
			putValue (SHORT_DESCRIPTION, "Presione el botín para ingresar su mail o ENTER");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			at=0;
			mail = text_field_email.getText().trim();
			for (int i=0; i<mail.length(); i++) {
				if (mail.charAt(i) == '@')
					at++;
				
				if (mail.charAt(0)=='.' || mail.charAt(mail.length()-1)=='.')
					point = false;
				else
					point = true;
			}
			
			if ( at != 1  || point == false)
				label_result.setText("Email Incorrecto");
			else
				label_result.setText("Email Correcto");
		}
	}
}