import java.util.*;

public class Video18_Condicionales_5_Random {
	
	private static Scanner ent;
	
	public static void main(String[] args) {
		
		ent = new Scanner (System.in);
		
		int aux = (int) (Math.random()*100);
		
		int num=0, cont=0;
		
		do {
			System.out.println("Ingrese un n�mero por favor");
			
			num = ent.nextInt();
			
			if (aux < num)
				System.out.println("M�s bajo");
			else if (aux > num)
				System.out.println("M�s alto");
			
			cont++;
		}while (aux != num);
		
		System.out.println("Correcto. Lo has logrado en " +cont +" intentos");
	}

}
