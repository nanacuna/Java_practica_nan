package a_poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Operario extends Humano {

	public Operario (String nom, double sue, int year, int month, int day) {
		
		super(nom);
			
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar (year, month-1, day);
			
		altaContrato = calendario.getTime();
		
		Id = next_Id;
		next_Id++;
			
	}
	
	public String Description() {
		return "Este operario tiene un Id = "+Id+"\nCon un sueldo = "+sueldo;
	}
		
	public double getSalary () {//getter
		return sueldo;
	 }
		
	public Date mostrar_fecha () {//getter
		return altaContrato;
	}
		
	public void subir_sueldo (double porcentaje) {//setter
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
	public void isId () {
		System.out.println(Id);
	}
	
	
	private double sueldo;
	private Date altaContrato;
	private static int next_Id = 1;
	private int Id;
		
}
