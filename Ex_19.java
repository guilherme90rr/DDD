package Atividades;

import java.util.Scanner;

public class Ex_19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double p1, p2, media;

		System.out.printf("Digite o valor da p1:");
		p1 = ler.nextDouble();

		System.out.printf("Digite o valor da p2:");
		p2 = ler.nextDouble();

		media = (p1 + (p2 * 2)) / 3;

		if (media >= 5) {
			System.out.printf("Você foi aprovado!");

		} else {
			System.out.printf("Você foi reprovado.");
		}
	}
}