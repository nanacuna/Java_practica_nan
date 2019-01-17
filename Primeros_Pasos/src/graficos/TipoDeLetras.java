package graficos;
import java.awt.GraphicsEnvironment;
import java.util.*;

public class TipoDeLetras {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		String fuente;
		boolean enlafuente = false;
		String [] letras = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		System.out.println("Introduce fuente");
		fuente = ent.next();
		
		System.out.println(fuente);
		
		
		
		for (int i=0; i<letras.length; i++) {
			if (letras[i].equalsIgnoreCase(fuente)) {
				enlafuente = true;
			}
			//System.out.println(i+1+": "+letras[i]);
		}
		if (enlafuente) 
			System.out.println("Fuente instalada");
		else
			System.out.println("No se encontro la fuente");
	}

}
