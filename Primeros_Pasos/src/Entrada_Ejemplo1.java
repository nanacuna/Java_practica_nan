import java.util.*;

public class Entrada_Ejemplo1 {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre por favor: ");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce edad: ");
		
		int edad= entrada.nextInt();
		
		System.out.println("Hola "+nombre+". El año que viene tendras "+(edad+1)+ " años.");
		
		String nom1="NANCY";
		
		System.out.println(nom1.equalsIgnoreCase(nombre));
	}

}
