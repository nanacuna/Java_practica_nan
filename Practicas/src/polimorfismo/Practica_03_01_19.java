package polimorfismo;

public class Practica_03_01_19 {

	public static void main(String[] args) {
		
		Persona [] p1 = new Persona[3];
		
		Alumno_ingles alu = new Alumno_ingles(10);
		
		System.out.println(alu.getMaterias());
		
		alu.setMaterias(25);
		
		System.out.println(alu.getMaterias());
		
		p1[0] = new Alumno();
		p1[1] = new Alumno_ingles(5);
		p1[2] = new Alumno_frances();


	}

}
