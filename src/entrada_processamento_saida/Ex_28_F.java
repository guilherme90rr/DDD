package entrada_processamento_saida;

public class Ex_28_F {

	public static void main(String[] args) {
		
		int a = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) a += i;
		}
		System.out.printf("A soma dos números interiros no intervalo de 1 a 100 foi de:");
		System.out.println(a);
	}

}
