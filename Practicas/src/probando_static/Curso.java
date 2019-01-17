package probando_static;

public class Curso implements Gonza{
	private static int sig_cod = 1;
	private int cod;
	
	public Curso() {
		cod = sig_cod;
		sig_cod++;
	}
	
	
	public void algoCod() {
		System.out.println("Mi cod: " + cod );
		System.out.println("Siguiente cod: " + sig_cod+"\n\n");
	}


	@Override
	public void salta() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
