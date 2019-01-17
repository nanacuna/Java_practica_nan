
public class Video26_Matrices_Bidimensionales_II {

	public static void main(String[] args) {
		int [][] mat = {
				{5,10,15,20,25},
				{30,35,40,45,50},
				{55,60,65,70,75},
				{80,85,90,95,0}
		};
		//int [][] mat1 = new int [4][5];
		//int i=0, j=0;
		
		/*for (i=0; i<4; i++) {
			System.out.printf("Posición %d:", i);
			for (j=0; j<5; j++) {
				System.out.printf("\tFila %d: ", j);
				System.out.printf("[%d]", mat[i][j]);
			}
			System.out.println();
		}*/
		
		
		for (int[] fila : mat) {
			for (int columna : fila) {
				System.out.printf("[%d]\t", columna);
			}
			System.out.println();
		}
		
	}

}
