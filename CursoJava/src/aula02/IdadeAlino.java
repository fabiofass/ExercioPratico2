package aula02;

import java.util.Scanner;

public class IdadeAlino {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = input.nextInt();
		if (idade >= 18) {
			System.out.println("Aluno maior de idade!");
		}else if(idade >= 14 && idade <= 17) {System.out.println("Você é um adolecente!");
			
		}
		else {System.out.println("Você é uma criança!");}
		input.close();
	}
	

}
