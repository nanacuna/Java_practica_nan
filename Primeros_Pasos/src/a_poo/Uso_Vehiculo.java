package a_poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		/*Coche Renault = new Coche();//Instanciar una clase/ejemplar de clase
		
		//Cosas no permitidas
		/*
		//Renault.ruedas = 3;
		
		//System.out.printf("Este coche tiene %d ruedas",Renault.ruedas);
		*/
		
		//GETTER
		
		/*
		System.out.println(Renault.mostrar_largo());
		System.out.println(Renault.mostrar_ruedas());
		System.out.println(Renault.mostrar_ancho());
		System.out.println(Renault.mostrar_motor());
		System.out.println(Renault.mostrar_peso_plat());
		
		
///////////////////////////////////////////////////////////////
		
		//SETTER
		System.out.println();
		System.out.println();
		
		Coche mi_auto = new Coche();
		
		mi_auto.colores();
		
		System.out.println(mi_auto.mostrar_color());
		
		mi_auto.peso_general();
		
		System.out.println(mi_auto.mostrar_peso_total());
		
		mi_auto.aire();
		
		System.out.println(mi_auto.aires());
		
		mi_auto.asientos();
		
		System.out.println(mi_auto.asiento());
		*/
		
		Coche mi_coche1 = new Coche();
		
		mi_coche1.colores("Azul");
		
		Furgoneta mi_furgo1 = new Furgoneta(7, 580);
		
		mi_furgo1.colores("Blanco");
		
		mi_furgo1.asientos("si");
		
		mi_furgo1.aire("si");
		
		System.out.println(mi_coche1.mostrar_datos_generales()+"\n"+mi_coche1.mostrar_color());
		
		System.out.println(mi_furgo1.mostrar_datos_generales());
		
		System.out.println(mi_furgo1.getFurgo());
		
	}

}
