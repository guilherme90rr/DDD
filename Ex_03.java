package Atividades;

import java.util.Scanner;

public class Ex_03 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 int b, h, multiplicação;
    	 
    	 System.out.printf("Digite a base do triângulo: ");
    	 b = ler.nextInt();
    	 
    	 System.out.printf("Digite a altura do triângulo: ");
    	 h = ler.nextInt();
    	 
    	 multiplicação = b * h / 2;
    	 
    	 System.out.printf("A área do triângulo é: %d", multiplicação);
    	 
    	 

     }
}
