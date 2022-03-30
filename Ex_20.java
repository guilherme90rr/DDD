package Atividades;

import java.util.Scanner;

public class Ex_20 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double p1, p2;
		int media = 5;
		
		System.out.printf("Digite o valor da p1:");
		p1 = ler.nextDouble();
		
		p2 = ((media * 3) - p1) / 2;
		
		System.out.printf("Você precisa tirar %.1f para ser aprovado.", p2);
		
		ler.close();
	}
}