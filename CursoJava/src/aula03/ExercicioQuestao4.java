package aula03;

import java.util.Scanner;

public class ExercicioQuestao4 {

	public static void main(String[] args) {
       //Exerciocio 1-  Questão ]
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu código");
         String C = entrada.next();
         System.out.println("Digite a quantidade de horas trabalhadas");
         int N = entrada.nextInt();
         float salario;
         int E;
         if (N <= 50) {
        	salario = N*10;
        	
         }else {
        	 E = N-50;
        	 salario = 500+(N*20);
         }
        System.out.printf("o seu salário final será: R$ %.2f", salario);
  
		
	}

}
