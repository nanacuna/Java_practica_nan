//import java.lang.*;

public class Video25_Matrices_Bidimensionales {

	public static void main(String[] args) {
		
		int [][] mat_bi = new int [4][5];
		int i=0, j=0;
		
		for (i=0; i<4; i++) {
			for (j=0; j<5; j++) {
				mat_bi[i][j] = (int) Math.round(Math.random()*100);
			}
		}
		
		for (i=0; i<mat_bi.length; i++) {
			System.out.printf("Posición %d:", i);
			
			for (j=0; j<mat_bi.length; j++) {
				System.out.printf("\tFila %d: ", j);
				System.out.printf("[%d]", mat_bi[i][j]);
				//System.out.print (mat_bi[i][j]);
			}
			System.out.println();
		}
		
	}

}
