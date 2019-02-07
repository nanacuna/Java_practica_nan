package variables_statics;

public class Cliente {
	int n_cliente;
	static  int numero_proximo_cliente = 2501;
	
	public Cliente () {
		n_cliente = numero_proximo_cliente;
		numero_proximo_cliente++;
	}
	
	public int getNumeroCliente () {
		return n_cliente;
	}
	
	
	
	
}