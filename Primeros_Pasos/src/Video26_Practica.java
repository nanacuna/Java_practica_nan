
public class Video26_Practica {

	public static void main(String[] args) {
		
		double acu=0;
		double interes=0.10;
		
		double [][] saldo = new double [6][5];
		int i=0, j=0;
		
		for (i=0; i<6; i++) {
			saldo[i][0] = 10000;
			acu = 10000;
			
			for (j=1; j<5; j++) {
				
				acu +=(acu*interes);
				saldo [i][j] = acu;
				
			}
			
			interes+=0.01;
		}
		
		for (i=0; i<6; i++) {
			System.out.print("Saldo: ");
			for (j=0; j<5; j++) {
				System.out.printf("\t$%.2f", saldo[i][j]);
			}
			System.out.println();
		}
		
	}

}
