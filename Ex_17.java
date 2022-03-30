package Atividades;

import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {
   	 Scanner ler = new Scanner(System.in);
   	 
   	 String sexo;
   	 double peso, altura, imc;
   	 
   	 System.out.printf("Digite seu sexo: ");
   	 sexo = ler.nextLine();
   	 
   	 System.out.printf("Digite o seu peso(kg): ");
   	 peso = ler.nextDouble();
   	 
   	 System.out.printf("Digite sua altura(m) : ");
   	 altura = ler.nextDouble();
   	 
   	 imc = peso / (altura * altura);
   	 
   	if (sexo.equals("feminino")){
		if(imc<19) {
			System.out.printf("Você está abaixo do peso! (feminino)");
	}else if((19 <= imc && imc <= 24)) {
		    System.out.printf("Você está no peso ideal! (feminino)");
    }else 
		    System.out.printf("Você está acima do peso! (feminino)");
   	}	    
   	else {
   	if (sexo.equals("masculino")){
   		if(imc<20) {
   	        System.out.printf("Você está abaixo do peso! (masculino)");
   		}else if((20 <= imc && imc <= 25)) {
		    System.out.printf("Você está no peso ideal! (masculino)");
    }else 
		    System.out.printf("Você está acima do peso! (masculino)");
   	        }
   	
   	    }
   	
   	 
}

} 