import java.util.Scanner;

public class Video16_Condicionales1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
		System.out.println("Introduce tu edad por favor");
		
		int edad = entrada.nextInt();
		
		if (edad < 18) {
			System.out.println("Eres adolecente");
		}
		else if (edad < 40) {
			System.out.println("Eres joven");
		}
		else if (edad < 65) {
			System.out.println("Eres maduro");
		}
		else {
			System.out.println("Cuídate");
		}
	}

}
