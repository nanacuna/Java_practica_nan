package a_text_builder_1_4;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import java.awt.event.*;

public class Layer extends JPanel {
	private ButtonGroup  group_size = new ButtonGroup();
	private JPanel layer_menu = new JPanel();
	private JMenuBar my_menu = new JMenuBar();
		private JMenu source = new JMenu("Source");
		private JMenu style = new JMenu("Style");
			private JCheckBoxMenuItem bold = new JCheckBoxMenuItem("Bold", new ImageIcon ("assets/theme/bold.png"));
			private JCheckBoxMenuItem italic = new JCheckBoxMenuItem("Italic", new ImageIcon("assets/theme/italic.png"));
		private JMenu size_letter = new JMenu("Size");
			private JRadioButtonMenuItem size_1 = new JRadioButtonMenuItem("12");
			private JRadioButtonMenuItem size_2 = new JRadioButtonMenuItem("16");
			private JRadioButtonMenuItem size_3 = new JRadioButtonMenuItem("20");
			private JRadioButtonMenuItem size_4 = new JRadioButtonMenuItem("24");
	//-----------------------------------------------
	private JTextPane text = new JTextPane();
	private Font letters;
	public Layer () {
		setLayout(new BorderLayout());
		my_menu.add(source);
			elements_menu("Arial", "Source", "Arial", "");
			elements_menu("Courier", "Source", "Courier", "");
			elements_menu("Verdana", "Source", "Verdana", "");
			//----------------------------------
		my_menu.add(style);
			bold.addActionListener(new StyledEditorKit.BoldAction());
			italic.addActionListener(new StyledEditorKit.ItalicAction());
			style.add(bold);
			style.add(italic);
			//-----------------------------------------
		my_menu.add(size_letter);
			group_size.add(size_1);
			group_size.add(size_2);
			group_size.add(size_3);
			group_size.add(size_4);
			size_1.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar tamño de letra", 12));
			size_2.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar tamño de letra", 16));
			size_3.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar tamño de letra", 20));
			size_4.addActionListener(new StyledEditorKit.FontSizeAction("Cambiar tamño de letra", 24));
			size_letter.add(size_1);
			size_letter.add(size_2);
			size_letter.add(size_3);
			size_letter.add(size_1);
			//-------------------------------------------
		layer_menu.add(my_menu);
		add(layer_menu, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
		//------------------------------------
	}
	public void elements_menu(String label, String menu, String type_letter, String icono){
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
	}
}
