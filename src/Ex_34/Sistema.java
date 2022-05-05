package Ex_34;

import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[2];
		char possuiContaBancaria;
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		
		for(int i=0; i<5; i++) {
			
			System.out.printf("Digite o id do cliente: ");
			id = ler.nextInt();
			
			System.out.printf("Digite o nome do cliente: ");
			nome = ler.next();
			
			System.out.printf("Digite a idade do cliente: ");
			idade = ler.nextInt();
			
			System.out.printf("Digite o email do cliente: ");
			email = ler.next();
			
			System.out.printf("Possui conta bancaria? (S/N)");
			possuiContaBancaria = ler.next().charAt(0);
			
			if (possuiContaBancaria == 'S') {
				ContaBancaria ct = new ContaBancaria();
					
				System.out.printf("Digite a agência da conta: ");
				ct.agencia = ler.next();
			
				System.out.printf("Digite a numero da conta: ");
				ct.numero = ler.next();
			
				System.out.printf("Digite o saldo da conta: ");
				ct.saldo = ler.nextDouble();
			
				conta = ct;
		}
		
		else {
			conta = null;
		}
		
		Cliente c = new Cliente(id, nome, idade, email, conta);
		
			
		listaClientes[i] = c;	
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("\n%s", listaClientes[i].exibirNomeIdade());
			System.out.printf("\n%s", listaClientes[i].exibirDadosConta());
			
			ler.close();
	}
  }
}
