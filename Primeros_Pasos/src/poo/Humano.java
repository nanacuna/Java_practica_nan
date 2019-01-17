package poo;

abstract class Humano {
	
	public Humano (String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String Description();
	
	private final String nom;
	  
	   
	
}
