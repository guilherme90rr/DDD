package entrada_processamento_saida;

public class Ex_28_D {

	public static void main(String[] args) {
		
		int i = 1;
		int a = 0;
		
		do {
			if(i%2==0) a += i;
			i++;
		}
		while (i <= 100);
		System.out.printf("A soma dos números interiros no intervalo de 1 a 100 foi de:");
		System.out.println(a);
		
		
	}

}
