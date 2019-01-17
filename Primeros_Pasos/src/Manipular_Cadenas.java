
public class Manipular_Cadenas {

	public static void main(String[] args) {
		
		String nom= "Nancy Beatriz Acuña";
		
		System.out.println("Mi nombre es "+nom);
		
		System.out.println("Mi nombre tiene "+nom.length()+" letras.");
		
		System.out.println("La primera letra de "+nom +" es "+nom.charAt(0));
		
		int ultima_letra=nom.length();
		
		System.out.println("La última letra es la "+nom.charAt(ultima_letra-1));
		
		
	}

}
