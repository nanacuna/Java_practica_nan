import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		
		//double x=10000.0;
		//System.out.printf("%.2f", x/3);
		
		String num1 = JOptionPane.showInputDialog("Introduce un número: ");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.printf("La raíz cuadrada de %.0f", num2);
		
		System.out.printf(" es %.2f", Math.sqrt(num2));
	}

}
