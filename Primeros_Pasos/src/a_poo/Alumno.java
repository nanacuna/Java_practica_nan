package a_poo;

public class Alumno extends Humano {
	
	public Alumno (String nom, String Carrera) {
		super (nom);
		
		this.Carrera = Carrera;
	}
	
	public String Description(){
		return "Este alumno está estudiando la carrera de: "+Carrera;
	}
	
	private String Carrera;

}
