package a_text_builder_1_2;
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
		elements_menu("Arial", "Source", "Arial", 9, 10, "");
		elements_menu("Courier", "Source", "Courier", 9, 10, "");
		elements_menu("Verdana", "Source", "Verdana", 9, 10, "");
		//-----------------------------------------
		elements_menu("Bold", "Style", "", Font.BOLD, 1, "assets/theme/bold.png");
		elements_menu("Italic", "Style", "", Font.ITALIC, 1, "assets/theme/italic.png");
		//-------------------------------------------
		elements_menu("12", "Size", "", 9, 12, "");
		elements_menu("16", "Size", "", 9, 16, "");
		elements_menu("20", "Size", "", 9, 20, "");
		elements_menu("24", "Size", "", 9, 24, "");
		//------------------------------------
		layer_menu.add(my_menu);
		add(layer_menu, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
	}
	public void elements_menu(String label, String menu, String type_letter, int style1, int size_1, String icono){
		JMenuItem source_menu = new JMenuItem(label, new ImageIcon(icono));
		if (menu.equals("Source")) {
			source.add(source_menu);
			if(type_letter.equals("Arial"))
				source_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar letra", "Arial"));
			else if (type_letter.equals("Courier"))
				source_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar letra", "Courier"));
			else
				source_menu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambiar letra", "Verdana"));
		}
		else if (menu == "Style") {
			style.add(source_menu);
			if (style1 == Font.BOLD)
				source_menu.addActionListener(new StyledEditorKit.BoldAction());
			else
				source_menu.addActionListener(new StyledEditorKit.ItalicAction());
		}
		else {
			size.add(source_menu);
			source_menu.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar tamaño de letra", size_1));
		}
	}
}
