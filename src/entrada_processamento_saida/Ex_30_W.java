package entrada_processamento_saida;

public class Ex_30_W {

	public static void main(String[] args) {

		int n=20, n1=1, n2=1, n3=1, n4, i=3;
		
		System.out.printf("%d\n%d\n%d", n1, n2, n3);
		while (i <= n) {
			System.out.printf("\n");
			n4 = n1 + n2 + n3;
			System.out.printf("%d", n4);
			n1 = n2;
			n2 = n3;
			n3 = n4;
			i++;
		}
	}
}
