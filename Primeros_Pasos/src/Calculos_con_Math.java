
public class Calculos_con_Math {

	public static void main(String[] args) {
		
		//double raiz=Math.sqrt(81);
		
		int base=5, expo=3;
		
		int resul = (int) Math.pow(base,expo);
		
		System.out.println("El resultado de "+base+" elevado a "+expo+" es "+resul);
		
		base=2;
		expo=2;
		
		int rpt = (int) Math.pow(base, expo);
		
		System.out.println("El resultado de "+base+" elevado a "+expo+" es "+rpt);
		
	}

}
