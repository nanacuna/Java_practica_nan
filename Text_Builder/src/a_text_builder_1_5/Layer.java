package a_text_builder_1_5;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import java.awt.event.*;

public class Layer extends JPanel {
	private JPanel layer_menu = new JPanel();
	private JMenuBar menu_bar = new JMenuBar();
		private JMenu menu_font = new JMenu("Fonts");
			private JMenuItem font_arial = new JMenuItem("Arial");
		
		private JMenu style = new JMenu("Style");
			private JCheckBoxMenuItem bold = new JCheckBoxMenuItem("Bold", new ImageIcon ("assets/theme/bold.png"));
			private JCheckBoxMenuItem italic = new JCheckBoxMenuItem("Italic", new ImageIcon("assets/theme/italic.png"));
		private JMenu size_letter = new JMenu("Size");
			private JRadioButtonMenuItem size_1 = new JRadioButtonMenuItem("12");
			private JRadioButtonMenuItem size_2 = new JRadioButtonMenuItem("16");
			private JRadioButtonMenuItem size_3 = new JRadioButtonMenuItem("20");
			private JRadioButtonMenuItem size_4 = new JRadioButtonMenuItem("24");
	private JPopupMenu options = new JPopupMenu();
		private JMenuItem bold_emergent = new JMenuItem("Negrita");
		private JMenuItem italic_emergent = new JMenuItem("Italic");
	//-------------------------------------------------------------------------------------------------------------------
	private JTextPane text = new JTextPane();
	private Font letters;
	private ButtonGroup  group_size = new ButtonGroup();
	public Layer () {
		setLayout(new BorderLayout());
		menu_bar.add(menu_font);
			menu_font.add(font_arial);
			//-----------------------------------------------------------------------------------------------------------
		menu_bar.add(style);
			bold.addActionListener(new StyledEditorKit.BoldAction());
			italic.addActionListener(new StyledEditorKit.ItalicAction());
			style.add(bold);
			style.add(italic);
			//-----------------------------------------------------------------------------------------------------------
		menu_bar.add(size_letter);
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
			size_letter.add(size_4);
			//-----------------------------------------------------------------------------------------------------------
		layer_menu.add(menu_bar);
		add(layer_menu, BorderLayout.NORTH);
		add(text, BorderLayout.CENTER);
		//---------------------------------------------------------------------------------------------------------------
		options.add(bold_emergent);
		options.add(italic_emergent);
		bold_emergent.addActionListener(new StyledEditorKit.BoldAction());
		italic_emergent.addActionListener(new StyledEditorKit.ItalicAction());
		text.setComponentPopupMenu(options);
	}
}
