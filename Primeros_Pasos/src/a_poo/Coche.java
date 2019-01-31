package a_poo;

public class Coche {
	//Propiedades que no pueden variar
	private int ruedas, largo, ancho, motor, peso_plataforma;
	
	
	//Propiedades que pueden variar
	String color;
	int peso_total;
	boolean asientos_cuero, aire_acond;
	
	
	/*Método constructor: es un método que se encarga 
	  de dar un estado inicial a nuestro objeto*/
	
	//Método constructor
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 4500;
	}
	
	
	public String mostrar_datos_generales() {
		return "La plataforma de mi auto tiene "+ruedas+" ruedas.\nMide "+largo/1000
				+ " metros con un ancho de "+ancho+" cm³ y un peso de "+
				peso_plataforma+ " kg.\nSu motor pesa "+motor+" kg.";
	}
	//Modificadores de acceso : "public"
	public String mostrar_largo() {//método GETTER
		
		return "El largo del auto es "+largo + " cm³";
	}
	
	public String mostrar_ruedas () {
		return "El auto tiene "+ruedas+" ruedas";
	}
	
	public String mostrar_ancho () {
		return "El auto mide "+ancho+" cm³ de ancho";
	}
	
	public String mostrar_motor () {
		return "El motor del auto pesa "+motor+" gramos";
	}
	
	public String mostrar_peso_plat () {
		return "La plataforma del auto pesa "+peso_plataforma+" gramos";
	}
	
	
	///////////////////////////////////////////////////////////
	
	public void colores(String color) {//método SETTER
		this.color = color;
	}
	public String mostrar_color() {
		return "El color del auto es: "+color;
	}
	
	public void peso_general () {
		peso_total = 9500;
	}
	
	public String mostrar_peso_total() {
		return "El peso total del auto es " + peso_total+" gs";
	}
	
	public void asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}
	}
	
	public String asiento () {
		if (asientos_cuero==true) {
			return "Los asientos del auto SON de cuero";
		}
		else {
			return "Los asientos del auto NO son de cuero";
		}
		
	}
	
	public void aire (String aire_acond) {
		if (aire_acond.equalsIgnoreCase("si")) {
			this.aire_acond = true;
		}
		else {
			this.aire_acond = false;
		}
	}
	
	public String aires() {
		if (aire_acond == true){
			return "El auto tiene aire acondicionado";
		}
		else {
			return "El auto NO tiene aire acondicionado";
		}
				
	}

}
