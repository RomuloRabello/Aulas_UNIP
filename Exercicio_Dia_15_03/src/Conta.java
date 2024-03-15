
public class Conta {
	
	public int num;
	public Pessoa titular;
	public Data abertura;
	public double saldo;
	
	
	public void depositar (double valor){
		
		saldo = saldo + valor;
	}
	
	public void mostrarConta() {
		System.out.println("O nome do tìtular da conta é:" + titular);
		System.out.println("A data de abertura da conta do cliente é: "+ abertura);
		System.out.println("O saldo do cliente é: "+ saldo);
	}

}
