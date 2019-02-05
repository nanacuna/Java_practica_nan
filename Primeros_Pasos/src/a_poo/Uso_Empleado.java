package a_poo;

import java.util.Arrays;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura Jefe_RRHH = new Jefatura("Rosa Juarez", 55000, 2006, 9, 25);
		
		Jefe_RRHH.setIncentive(2570);
		
		
		
		Empleado [] mis_empleados = new Empleado[6];
		
		mis_empleados [0] = new Empleado("Nancy Acuña", 85000, 1990, 12, 17);
		mis_empleados [1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		mis_empleados [2] = new Empleado("Maria Perez", 105000, 2002, 03, 15);
		mis_empleados [3] = new Empleado("Lucas Gómez");
		
		mis_empleados[4] = Jefe_RRHH; //Polimorfismo
		
		mis_empleados[5] = new Jefatura ("Juana Suárez", 95000, 2008, 5, 12);
		
		Jefatura Jefe_Finanzas = (Jefatura) mis_empleados[5];
		
		Jefe_Finanzas.setIncentive(55000);
		
		System.out.println(Jefe_Finanzas.tomarDecisiones(
				"\ndar más días de vacaciones a los empleados\n"));
		
		System.out.println("El Jefe: "+Jefe_Finanzas.mostrar_nom()+"\nTiene un bonus de: $"
		+Jefe_Finanzas.est_bonus(500)+"\n");
		
		System.out.println(mis_empleados[3].mostrar_nom()+ "\nTiene un bonus de: $"
				+mis_empleados[3].est_bonus(200)+"\n");
		
		for (Empleado e: mis_empleados) {
			e.subir_sueldo(5);
		}
		
		Arrays.sort(mis_empleados);
		
		for (Empleado e: mis_empleados) {
			System.out.println("Id: "+e.getId()+
					"\nNombre: "+e.mostrar_nom()
					+"\nSueldo: $"+e.getSalary()
					+"\nFecha de alta: "+e.mostrar_fecha()+"\n");
		}
		
	}

}