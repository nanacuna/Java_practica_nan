package polimorfismo;

public class Alumno_ingles extends Persona {
	
	private int materias;
	
	
	
	public Alumno_ingles(int materias){
		this.materias = materias;
	}
	
	
	
	public void setMaterias(int materias) {
		this.materias = materias;
	}
	
	public int getMaterias() {
		return materias;
	}
	
	
	
	
	public void saludo () {
		System.out.println("Hello");
	}
	
	public void pregunta() {
		System.out.println("Como estas?");
	}
}
