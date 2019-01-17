
public class Manipulacion_cadenas_2 {

	public static void main(String[] args) {
		
		String frase= "Hoy es un estupendo día para aprender a programar en Java";
		
		int ult_frase = frase.length();
		
		String frase_resumen = frase.substring(29, ult_frase);
		
		System.out.println("La frase es " +frase_resumen);
		
	}

}
