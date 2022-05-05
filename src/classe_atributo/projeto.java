package classe_atributo;

import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaPessoas = new Cliente[5];
	
	for (int i=0; i<=4; i++) {
		Cliente t = new Cliente();
	
		System.out.printf("Digite o id da pessoa: ");
		t.id = ler.nextInt();
		
		System.out.printf("Digite o nome da pessoa: ");
	    t.nome = ler.next();
		    
		System.out.printf("Digite a idade da pessoa: ");
	     t.idade = ler.nextInt();
		    
		System.out.printf("Digite o email da pessoa: ");
		t.email = ler.next();
		
		listaPessoas[i] = t; 
	}		
		
	for (int i=0; i<=4; i++) {
      
		if (listaPessoas[i].idade >= 18) {
			System.out.printf("\nCliente %d criada com sucesso (%s) ! ",listaPessoas[i].id, listaPessoas[i].nome);
					
	 }
	}
	ler.close();
  }
}

