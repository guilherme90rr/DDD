package entrada_processamento_saida;
import java.util.Scanner;
public class Ex_23_W {

	public static void main(String[] args) {
		// Entrar via teclado com o sexo de determinado usu�rio
		// onde aceita somente "F" ou "M" com respota v�lida.
	
		Scanner ler = new Scanner(System.in);
		
		String sexo = "";
		
		while (!sexo.equals("M") && !sexo.equals("F")) {
			System.out.printf("Digite o seu sexo, para (Feminino) precione F para masculino precione M:");
				sexo = ler.next(); }
		
		System.out.printf("Obrigado pela informa��o!");
					ler.close();
	}
}
