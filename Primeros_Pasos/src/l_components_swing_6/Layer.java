package l_components_swing_6;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;

public class Layer extends JPanel {
	private JButton btn_insert = new JButton("Insert");
	private JButton btn_line_break = new JButton("Add jump");
	private JTextArea areaText = new JTextArea(8, 20);
	private JScrollPane write = new JScrollPane(areaText);
	
	public Layer () {
		//setLayout(new BorderLayout());
		btn_insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				areaText.append("No tengo ganas de pensar el contenido..............");
			}
		});
		add(btn_insert, BorderLayout.SOUTH);
		btn_line_break.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean jump = !areaText.getLineWrap();
				areaText.setLineWrap(jump);
				/*if (jump) 
					btn_line_break.setText("Remove jump");
				else
					btn_line_break.setText("Add jump");*/
				//**************Operador ternario*************//
				
				btn_line_break.setText(jump ? "Remove jump" : "Add jump");
			}
		});
		add(btn_line_break, BorderLayout.SOUTH);
		add(write, BorderLayout.CENTER);
	}
}
