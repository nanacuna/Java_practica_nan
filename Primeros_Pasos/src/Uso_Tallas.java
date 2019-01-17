import java.util.*;


public class Uso_Tallas {
	
	private static Scanner ent;

	//enum Talla {small, medium, big, very_big};
	
	enum Talla {
		
		small("s"), medium("m"), big("l"), very_big("xl");
		
	 	private Talla(String abbrev) {
			this.abbrev = abbrev;
		}
		
		public String getAbbrev () {
			return abbrev;
		}
		
		private String abbrev;
	}

	public static void main(String[] args) {
		
		ent = new Scanner (System.in);
		
		System.out.println("Escribe una talla: small, medium, big, very big");
		
		String Data = ent.next().toLowerCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, Data);
		
		System.out.println("Talla = "+la_talla);
		
		System.out.println("Abbreviation = "+la_talla.getAbbrev());
		
	}

}
