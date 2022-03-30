package Atividades;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {
   	 Scanner ler = new Scanner(System.in);
   	 
   	 double peso, altura, imc;
   	 
   	 System.out.printf("Digite o seu peso: ");
   	 peso = ler.nextDouble();
   	 
   	 System.out.printf("Digite sua altura : ");
   	 altura = ler.nextDouble();
   	 
   	 imc = peso / (altura * altura);
   	 
   	if (imc < 20) {
        System.out.printf("Abaixo peso");
    }else if(imc < 25) {
        System.out.printf("Peso ideal");
    }
    else {
        System.out.printf("Acima do peso");
    }
}
}

   		 
   	    
   	   
   	 
   	 
   		 
   	 

   	 

   	 

   	 
   	 

    



