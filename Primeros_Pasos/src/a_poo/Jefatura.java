package a_poo;

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura (String nom, double salary, int year, int month, int day) {
		super(nom, salary, year, month, day);
	}
	
	public void setIncentive (double incentive) {
		this.incentive = incentive;
	}
	
	public double getSalary() {
		double SalaryBoss = super.getSalary();
		return SalaryBoss + incentive;
	}
	
	public String tomarDecisiones (String decision) {
		return "Un miembro de la dirección a tomado la decisión de: "+decision;
	}
	
	public double est_bonus (double bonus) {
		double prima = 2000;
		
		return Trabajadores.bonus_base + bonus + prima;
	}
	private double incentive;

}
