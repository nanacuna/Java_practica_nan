import java.util.*;

public class Video16_Condicionales {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
		System.out.println("Introduce tu edad por favor");
		
		int edad = entrada.nextInt();

		if (edad >= 18)
			System.out.println("Eres MAYOR de edad!!!");
		else
			System.out.println("Eres MENOR de edad!!!");
		
	}

}
