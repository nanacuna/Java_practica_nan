import java.util.*;

public class Video19_Condicionantes_4 {

	private static Scanner ent;

	public static void main(String[] args) {
		
		int aleat = (int)(Math.random()*100);
		
		ent = new Scanner (System.in);
		
		int num=0, intentos=0;
		
		while (num != aleat) {
			intentos++;
			System.out.println ("Introduce un número por favor");
			
			num = ent.nextInt();
			
			if (aleat < num)
				System.out.println("Más bajo");
			else if (aleat > num)
				System.out.println("Más alto");			
		}
		
		System.out.println("Correcto. Lo has conseguido en " +intentos +" intentos");
		
	}

}
