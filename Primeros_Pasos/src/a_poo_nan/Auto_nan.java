package a_poo_nan;

public class Auto_nan {
		
	private int ruedas, ancho, largo, peso_unid, motor;
	
	private String color;
	private boolean aire, asientos;
	private int peso_gen;
	
	
	public Auto_nan() {
		ruedas = 4;
		ancho = 4500;
		largo = 6500;
		motor = 3500;
		peso_unid = 500;
	}
	
	public String mostrar_datos_generales() {
		return "La plataforma de mi auto tiene "+ruedas+" ruedas.\nMide "+largo/1000
				+ " metros con un ancho de "+ancho+" cm³ y un peso de "+
				peso_unid+ " kg. Su motor pesa "+motor+" kg.";
	}
	
	public void colores(String color_auto) {
		color = color_auto;
	}
	
	public String mostrar_co() {
		return "Mi auto es de color "+color;
	}
	
	public void config_asientos(String asientos) {//SETTER
		if (asientos.equalsIgnoreCase("si")) {
			this.asientos = true;
		}
		else {
			this.asientos = false;
		}
	}
	
	public String mostrar_asientos() {//GETTER
		if (asientos) {
			return "Mi auto tiene asientos de cuero";
		}
		else {
			return "Mi auto tiene asientos de serie";
		}
	}
	
	public void aires (String aire) {
		if (aire.equalsIgnoreCase("si")) {
			this.aire = true;
		}
		else {
			this.aire = false;
		}
	}
	
	public String mostrar_aires() {
		if (aire) {
			return "Mi auto tiene aire acondicionado";
		}
		else {
			return "Mi auto no tiene aire acondicionado";
		}
	}
	
	///////////////Esto no está recomendado/////////////////
	public String mostrar_peso_total() {//SETTER + GETTER
		int peso_carroceria=500;
		
		peso_gen = peso_unid + peso_carroceria;
		
		if (asientos == true) {
			peso_gen += 50;
		}
		if (aire == true) {
			peso_gen += 20;
		}
		
		return "El peso de mi auto es "+peso_gen+ " kg";
	}
	
	public int precio_auto() {//GETTER
		int precio_final = 10000;
		
		if (asientos == true) {
			precio_final += 2000;
		}
		if (aire == true) {
			precio_final += 1500;
		}
		return precio_final;
	}
	
}
