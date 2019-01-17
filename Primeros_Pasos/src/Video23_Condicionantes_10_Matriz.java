//import javax.swing.*;
import java.util.*;

public class Video23_Condicionantes_10_Matriz {

	private static Scanner ent;

	public static void main(String[] args) {
		ent = new Scanner (System.in);
		
		int[] matriz = {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		
		for (i=0; i<10; i++) {
			System.out.println("Rellene la matriz ");
			matriz[i] = ent.nextInt();
		}
		
		for (i=0; i<10; i++) {
				System.out.printf("Posición %d: [%d]\n", i, matriz[i]);
		}
		

	}

}
