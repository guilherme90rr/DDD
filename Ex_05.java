package Atividades;

import java.util.Scanner;

public class Ex_05 {

     public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
    	 
    	 
    	 double c, multiplicação;
    	 
    	 System.out.printf("Digite a temperatura em celsius: ");
    	 c = ler.nextDouble();
    	 
    	 
    	 multiplicação = (c * 1.8) + 32;
    	 
    	 System.out.printf("A temperatura em fahrenheit é: %.2f", multiplicação);
    	 
    	 

     }
}

