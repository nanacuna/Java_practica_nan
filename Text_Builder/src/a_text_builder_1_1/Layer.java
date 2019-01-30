package a_text_builder_1_1;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;

import javax.swing.event.*;
import java.awt.event.*;
public class Layer extends JPanel {
	private JPanel layer_menu = new JPanel();
	private JMenuBar my_menu = new JMenuBar();
	//-----------------------------------------------
	private JMenu source = new JMenu("Source");
	private JMenu style = new JMenu("Style");
	private JMenu size = new JMenu("Size");
	//-------------------------------------------------
	private JTextPane text = new JTextPane();
//	private EventsMenu event_courier = new EventsMenu();
	private Font letters;
	public Layer () {
		setLayout(new BorderLayout());
		my_menu.add(source);
		my_menu.add(style);
		my_menu.add(size);
		//----------------------------------
		elements_menu("Arial", "Source", "Arial", 9, 10);
		elements_menu("Courier", "Source", "Courier", 9, 10);
		elements_menu("Verdana", "Source", "Verdana", 9, 10);
		//-----------------------------------------
		elements_menu("Bold", "Style", "", Font.BOLD, 1);
		elements_menu("Italic", "Style", "", Font.ITALIC, 1);
		//-------------------------------------------
		elements_menu("12", "Size", "", 9, 12);
		elements_menu("16", "Size", "", 9, 16);
		elements_menu("20", "Size", "", 9, 20);
		elements_menu("24", "Size", "", 9, 24);
		//------------------------------------
		layer_menu.add(my_menu);
		add(layer_menu, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
	}
	public void elements_menu(String label, String menu, String type_letter, int style, int size){
		JMenuItem source_menu = new JMenuItem(label);
		if (menu == "Source")
			source.add(source_menu);
		else if (menu == "Style")
			this.style.add(source_menu);
		else
			this.size.add(source_menu);
		source_menu.addActionListener(new EventsMenu(label, type_letter, style, size));
	}
	private class EventsMenu implements ActionListener{
		String type_text, type_menu;
		int style_text, size_text;
		EventsMenu(String element, String text_2, int style_2, int size_2) {
			type_text = text_2;
			style_text = style_2;
			size_text = size_2;
			type_menu = element;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			letters = text.getFont();
			if (type_menu.equals("Arial") || type_menu.equals("Courier") || type_menu.equals("Verdana")) {
				style_text = letters.getStyle();
				size_text = letters.getSize();
			}
			else if (type_menu.equals("Italic") || type_menu.equals("Bold")) {
				if (letters.getStyle() == 1 || letters.getStyle() == 2) {
					style_text = 3;
				}
				type_text = letters.getFontName();
				size_text = letters.getSize();
			}
			else{
				type_text = letters.getFontName();
				style_text = letters.getStyle();
			}
			text.setFont(new Font(type_text, style_text, size_text));
		}
		
	}
}
