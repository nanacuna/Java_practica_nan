package a_exception_6;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			Division();
		}catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}catch(NumberFormatException e) {
			System.out.println("Debes ingresar números");
//			System.out.println(e.getMessage());
			System.out.println("Se ha generado un error de este tipo: "+e.getClass());
		}
	}
	
	static void Division() {
		int number_1, number_2;
		
		number_1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the dividend"));
		number_2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the divider"));
		
		System.out.println("The result is " +number_1/number_2);
	}
}
