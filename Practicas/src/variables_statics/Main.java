package variables_statics;

public class Main {

	public static void main(String[] args) {
		/*Cobros mi_cobro = new Cobros(180);
		Cobros mi_pago = new Cobros(250);
		//System.out.println(Cobros.cliente);
		System.out.println(mi_cobro.pesos);
		System.out.println(mi_pago.pesos);
		
		Cobros.Nombre name = new Cobros.Nombre();*/
		
		Cliente [] clientes = new Cliente[10];
		
		for( int i=0; i<10; i++)
			clientes[i] = new Cliente();
		
		
		for (Cliente mis_clientes : clientes)
			System.out.println("Cliente número: "+mis_clientes.getNumeroCliente());
		
	}
}
