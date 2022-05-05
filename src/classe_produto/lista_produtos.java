package classe_produto;

import java.util.Scanner;

public class lista_produtos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		produto[] listaproduto = new produto[10];

		for (int i = 0; i <= 9; i++) {
			produto p = new produto();

			System.out.printf("Digite o id do produto: ");
			p.id = ler.nextInt();

			System.out.printf("Digite a descrição do produto: ");
			p.descricao = ler.next();

			System.out.print("Digite o valor: ");
			p.valor = ler.nextInt();

			System.out.print("Digite a quantidade: ");
			p.quantidade = ler.nextInt();

			listaproduto[i] = p;
		}

		for (int i = 0; i <= 9; i++) {

			if (listaproduto[i].valor <= 100) {
				System.out.printf("\nproduto %d criada com sucesso (%s) ! ", listaproduto[i].id, listaproduto[i].descricao);
				
				

			}
		}
		ler.close();
	}
}