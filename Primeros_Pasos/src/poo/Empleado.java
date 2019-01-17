package poo;

import java.util.*;

@SuppressWarnings("rawtypes")
public class Empleado implements Comparable, Trabajadores{
	
	public Empleado (String nom, double sue, int year, int month, int day) {
			
			nombre = nom;
			sueldo = sue;
			GregorianCalendar calendario = new GregorianCalendar (year, month-1, day);
			
			altaContrato = calendario.getTime();
			
			Id = next_Id;
			next_Id++;
	}
	
	public double est_bonus (double bonus) {
		return Trabajadores.bonus_base + bonus;
	}
	
	public int getId () {
		return Id;
	}
		
		
	public Empleado (String nom) {
		this (nom, 30000, 2018, 12, 28);
	}
	
	public String mostrar_nom () {//getter
		return nombre;
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
	
	public int compareTo(Object mi_Obj) {
		Empleado otro_Emp = (Empleado) mi_Obj;
		
		if(this.Id < otro_Emp.Id)
			return -1;
		else if (this.Id > otro_Emp.Id)
			return 1;
		else
			return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int next_Id = 1;
	

}
