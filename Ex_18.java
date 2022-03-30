package Atividades;

import java.util.Scanner;

public class Ex_18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		
		double aceleracao, velocidadeI, tempo, velocidadef;

		
		System.out.printf("Digite a aceleração:");
		aceleracao = ler.nextDouble();

		System.out.printf("Digite a velocidade:");
		velocidadeI = ler.nextDouble();

		System.out.printf("Digite o tempo:");
		tempo = ler.nextDouble();
		
		velocidadef = velocidadeI + (aceleracao * tempo) * 3.6 ;

		if (velocidadef <= 40) {
			System.out.printf("Veículo muito lento");
		}else if (velocidadef <= 60) {
			System.out.printf("Velocidade permitida");
		}else if (velocidadef <= 80) {
			System.out.printf("Velocidade de cruzeiro");
		}else if (velocidadef <= 120) {
			System.out.printf("Veículo rápido");
		}else { 
			System.out.printf("Veículo muito rápido");
		}

	}
}