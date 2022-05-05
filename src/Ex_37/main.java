package Ex_37;

public class main {
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {
		public static void main(String[] args) throws IOException{
			Scanner ler = new Scanner(System.in);
			ArrayList<Cliente> listaClientes = new ArrayList<>();

			int opcao;
			int id;
			String nome;
			int idade;
			String email;
			char possuiContaBancaria;
			String agencia = "";
			String numero = "";
			double saldo = 0;

			do {
				System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
				System.out.printf("Escolha uma opção:\n");
				System.out.printf("1 - Incluir cliente \n" + "2 - Atualizar cliente \n" + "3 - Excluir cliente \n"
						+ "4 - Exibir clientes \n" + "5 - Sair\n\n");
				System.out.printf("Digite a opção desejada: ");
				opcao = ler.nextInt();

				if (opcao == 1) {
					Cliente cliente = new Cliente();

					// DEFININDO ID DE CADA CLIENTE A PARTIR DO TAMANHO DA LISTA
					id = listaClientes.size() + 1;
					cliente.setId(id);

					System.out.printf("\nDigite o nome do cliente: ");
					nome = ler.next();
					cliente.setNome(nome);

					System.out.printf("\nDigite a idade do cliente: ");
					idade = ler.nextInt();
					cliente.setIdade(idade);

					System.out.printf("\nDigite o email do cliente: ");
					email = ler.next();
					cliente.setEmail(email);

					System.out.printf("\nO cliente possui conta bancária? Digite 'S' para sim ou 'N' para não: ");
					possuiContaBancaria = ler.next().charAt(0);

					if (possuiContaBancaria == 'S') {
						System.out.printf("Digite a sua agência: ");
						agencia = ler.next();
						System.out.printf("Digite o número da sua conta: ");
						numero = ler.next();
						System.out.printf("Digite o seu saldo: ");
						saldo = ler.nextDouble();
						ContaBancaria b = new ContaBancaria(agencia, numero, saldo);
						cliente.setContaBancaria(b);
					} else {
						cliente.setContaBancaria(null);
					}

					listaClientes.add(cliente);

					System.out.printf("Cliente incluído com sucesso!");
					System.in.read();
				} else if (opcao == 2) {
					for (Cliente a : listaClientes) {
						System.out.printf(a.exibirDadosCliente());
						if (a.getContaBancaria() != null) {
							System.out.printf("\nConta Bancaria: " + a.exibirDadosConta());
						}
						System.out.println("\n");
					}
					System.out.printf("\nDigite o id do cliente que deseja atualizar: ");
					id = ler.nextInt();

					System.out.printf("Digite o novo nome do cliente: ");
					nome = ler.next();

					System.out.printf("Digite a nova idade do cliente: ");
					idade = ler.nextInt();

					System.out.printf("Digite o novo email do cliente: ");
					email = ler.next();
					
					Cliente cliente = listaClientes.get(id - 1);
					
					cliente.setNome(nome);
					cliente.setIdade(idade);
					cliente.setEmail(email);

					if (listaClientes.get(id - 1).getContaBancaria() != null) {
						System.out.printf("Digite a nova agência: ");
						agencia = ler.next();
						System.out.printf("Digite o novo número da sua conta: ");
						numero = ler.next();
						System.out.printf("Digite o novo saldo: ");
						saldo = ler.nextDouble();
						
						ContaBancaria b = new ContaBancaria(agencia, numero, saldo);
						cliente.setContaBancaria(b);
					}
					

					System.out.printf("Cliente atualizado com sucesso!");
					System.in.read();
				} else if (opcao == 3) {				for (Cliente a : listaClientes) {
						System.out.printf(a.exibirDadosCliente());
						if (a.getContaBancaria() != null) {
							System.out.printf("\nConta Bancaria: " + a.exibirDadosConta());
						}
						System.out.println("\n");}

					System.out.printf("\nDigite o id do cliente para exclusão: ");
					id = ler.nextInt();

					listaClientes.remove(id - 1);

					System.out.printf("Cliente excluído com sucesso!");
					System.in.read();
				} else if (opcao == 4) {
					for (Cliente a : listaClientes) {
						System.out.printf(a.exibirDadosCliente());
						if (a.getContaBancaria() != null) {
							System.out.printf("\nConta Bancaria: " + a.exibirDadosConta());
						}
						System.out.println("\n");
					}
					System.in.read();
				}
			} while (opcao != 5);
			ler.close();
	}
	}


}
