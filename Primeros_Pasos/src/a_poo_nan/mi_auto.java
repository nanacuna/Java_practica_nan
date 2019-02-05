package a_poo_nan;

import javax.swing.*;

public class mi_auto {

	public static void main(String[] args) {
		
		Auto_nan fiat = new Auto_nan();
		
		System.out.println(fiat.mostrar_datos_generales());
		
		fiat.colores(JOptionPane.showInputDialog("Ingrese el color del auto"));
		
		//No est� permitido manipular las variables de esta forma
		/////////////////fiat.color="rosa";//////////////////////
		
		System.out.println(fiat.mostrar_co());
		
		fiat.config_asientos(JOptionPane.showInputDialog("¿El auto tiene asientos de cuero?"));
		System.out.println(fiat.mostrar_asientos());
		
		fiat.aires(JOptionPane.showInputDialog("¿El auto tiene aire acondicionado?"));
		System.out.println(fiat.mostrar_aires());
		
		System.out.println(fiat.mostrar_peso_total());
		
		System.out.println("El precio final de mi auto es U$U "+fiat.precio_auto());

	}

}
