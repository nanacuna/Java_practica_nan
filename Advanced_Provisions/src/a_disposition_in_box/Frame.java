package a_disposition_in_box;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
	private JLabel label_1 = new JLabel("Name:       ");
	private JLabel label_2 = new JLabel("PassWord: ");
//	private JLabel label_2 = new JLabel("PassWord: ");
	private JTextField text_1 = new JTextField(12);
	private JTextField text_2 = new JTextField(12);
//	private JTextField text_3 = new JTextField(12);
	private Box horizontal_box_1 = Box.createHorizontalBox();
	private Box horizontal_box_2 = Box.createHorizontalBox();
	private Box horizontal_box_3 = Box.createHorizontalBox();
	private Box vertical_box = Box.createVerticalBox();
	private JButton btn_1 = new JButton("Ok");
	private JButton btn_2 = new JButton("Cancel");
	public Frame () {
		Toolkit resolution = Toolkit.getDefaultToolkit();
		Dimension dim =  resolution.getScreenSize();
		int ancho, alto;
		ancho = dim.width;
		alto = dim.height;
		setBounds(ancho/4, alto/4, ancho/2, alto/2);
		//---------------------------------------------------
		setTitle("Frame in the Box");
		Image im = resolution.createImage("../Primeros_Pasos/imagenes/blue.png");
		setIconImage(im);
		//---------------------------------------------------
		text_1.setMaximumSize(text_1.getPreferredSize());
		text_2.setMaximumSize(text_2.getPreferredSize());
		horizontal_box_1.add(label_1);
		horizontal_box_2.add(label_2);
		horizontal_box_1.add(Box.createHorizontalStrut(10));
		horizontal_box_2.add(Box.createHorizontalStrut(10));
		horizontal_box_1.add(text_1);
		horizontal_box_2.add(text_2);
		horizontal_box_3.add(btn_1);
		horizontal_box_3.add(Box.createHorizontalStrut(15));
		horizontal_box_3.add(btn_2);
		vertical_box.add(horizontal_box_1);
		vertical_box.add(horizontal_box_2);
		vertical_box.add(horizontal_box_3);
		add(vertical_box, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
