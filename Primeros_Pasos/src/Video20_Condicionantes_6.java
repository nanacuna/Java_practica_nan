import javax.swing.*;

public class Video20_Condicionantes_6 {
	
	public static void main(String[] args) {
		String gen = " ";
		
		do {
			gen = JOptionPane.showInputDialog ("Introduce tu g�nero: \nHombre\nMujer");
		
		}while(gen.equalsIgnoreCase ("Hombre")==false && gen.equalsIgnoreCase("Mujer")==false);
		
		int alt = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altra en cent�metros"));
		
		int peso_ideal=0;
		
		if (gen.equalsIgnoreCase("Hombre"))
			peso_ideal=alt-110;
		else if (gen.equalsIgnoreCase("Mujer"))
			peso_ideal = alt-120;
		
		
		System.out.println("T� peso ideal es: " +peso_ideal + " kg");
	}

}
