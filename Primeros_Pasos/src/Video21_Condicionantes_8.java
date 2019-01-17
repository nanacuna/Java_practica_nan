import javax.swing.*;

public class Video21_Condicionantes_8 {

	public static void main(String[] args) {
		
		int arroba=0;
		boolean	punto = false;
		int i=0;
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail");
		
		for (i=0; i<mail.length(); i++) {
			if (mail.charAt(i) == '@')
				arroba++;
			if (mail.charAt(0) == '.' || mail.charAt(mail.length()-1) == '.')
				punto = false;
			else
				punto  = true;
				
		}
		if (arroba == 1 && punto == true)
			System.out.println("El mail es CORRECTO");
		else
			System.out.println("El mail es INCORRECTO");
	}

}
