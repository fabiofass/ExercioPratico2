package aula04;

import java.util.Scanner;

public class ExercicioAula4Repeticao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String nome = input.next();
		System.out.println("Entre com um Número");
		int numero = input.nextInt();
		for(int numero2 = 1; numero2 <= 2* numero; numero2++) {
			System.out.println(numero2 + " - "+ nome);
			
			
			
			
		}
		
		//System.out.println("Bananas - Qt desejada: "+ contador2+"\nMaçã  - Qt desejada:"+contador2+"\nMelão - Qt desejada:"+contador2+"\nGoiaba - Qt desejada:"+contador2+"\nMamão - Qt desejada:"+contador2);

	}

}
