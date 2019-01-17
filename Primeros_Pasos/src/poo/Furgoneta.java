package poo;

public class Furgoneta extends Coche {
	
	private int cap_carga, plazas_ext;
	
	public Furgoneta (int plazas_ext, int cap_carga) {
		
		super(); //Llamar al constructor de la clase padre
		
		this.cap_carga = cap_carga;
		this.plazas_ext = plazas_ext;
	}
	
	public String getFurgo () {
		return "La capacidad de carga es "+cap_carga+
				" y las plazas son: "+plazas_ext;
	}

}
