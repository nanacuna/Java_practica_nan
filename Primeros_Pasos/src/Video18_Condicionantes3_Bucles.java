import javax.swing.*;

public class Video18_Condicionantes3_Bucles {

	public static void main(String[] args) {
		String clave = "nancy", pass = " ";
		
		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog ("Ingresa la contrase�a por favor");
			
			if (clave.equals(pass) == false)
				System.out.println("Contrase�a incorrecta");
		}
		System.out.println("Contrase�a correcta\nAcceso permitido");
	}
}