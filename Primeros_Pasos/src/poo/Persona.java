package poo;

public class Persona {

	public static void main(String[] args) {
		
		Humano[] lasPersonas = new Humano[2];
		
		lasPersonas[0] = new Operario ("Nancy Acu�a", 50000, 2005, 05, 16);
		
		lasPersonas[1] = new Alumno ("Gonzalo Alarc�n", "Inform�tica");
		
		for (Humano e: lasPersonas) {
			System.out.println(e.getNom()+"\n"+e.Description()+"\n\n");
		}
		
	}

}
