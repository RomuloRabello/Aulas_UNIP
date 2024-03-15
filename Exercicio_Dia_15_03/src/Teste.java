import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pessoa pes = new Pessoa();
		
		System.out.println("Informe seu nome: ");
		pes.nome = scan.next();
		System.out.println("Informe seu CPF: ");
		pes.cpf = scan.next();
		pes.nasc = new Data();
		System.out.println("Informe o dia do seu nascimento(somente números) ");
		pes.nasc.dia = scan.nextInt();
		System.out.println("Informe o mes do seu nascimento(somente números) ");
		pes.nasc.mes = scan.nextInt();
		System.out.println("Informe o ano do seu nascimento(somente números) ");
		pes.nasc.ano = scan.nextInt();
		pes.mostrarPessoa();
		
		Conta conta = new Conta();
		conta.titular = pes;
		conta.abertura = new Data();
		System.out.println("Informe o dia de abertura (somente números) ");
		conta.abertura.dia = scan.nextInt();
		System.out.println("Informe o mes da abertura(somente números) ");
		conta.abertura.mes = scan.nextInt();
		System.out.println("Informe o ano da abertura(somente números) ");
		conta.abertura.ano = scan.nextInt();
		System.out.println("Qual será o saldo depositado para abertura de conta? ");
		conta.saldo = scan.nextDouble();
		conta.mostrarConta();
		
		scan.close();
	}

}
