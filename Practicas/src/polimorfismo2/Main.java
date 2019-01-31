package polimorfismo2;

public class Main {
	public static void main (String [] args) {
		Animal[] animales = new Animal[2];
		
		animales[0] = new Perro();
		animales[1] = new Gato();
		
		animales[0].emitirSonido();
		animales[1].emitirSonido();
		
		
		
	}
}
