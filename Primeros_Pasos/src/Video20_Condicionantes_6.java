import javax.swing.*;

public class Video20_Condicionantes_6 {
	
	public static void main(String[] args) {
		String gen = " ";
		
		do {
			gen = JOptionPane.showInputDialog ("Introduce tu género: \nHombre\nMujer");
		
		}while(gen.equalsIgnoreCase ("Hombre")==false && gen.equalsIgnoreCase("Mujer")==false);
		
		int alt = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altra en centímetros"));
		
		int peso_ideal=0;
		
		if (gen.equalsIgnoreCase("Hombre"))
			peso_ideal=alt-110;
		else if (gen.equalsIgnoreCase("Mujer"))
			peso_ideal = alt-120;
		
		
		System.out.println("Tú peso ideal es: " +peso_ideal + " kg");
	}

}
