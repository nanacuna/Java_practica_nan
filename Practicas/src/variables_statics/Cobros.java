package variables_statics;

public class Cobros {
	static int cliente = 5;
	double pesos;
	public Cobros(double pesos) {
		this.pesos = pesos;
	}
	
	public static class Nombre {
		public Nombre () {
			System.out.println("Nancy");
		}
	}
	
}
