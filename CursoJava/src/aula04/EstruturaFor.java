package aula04;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite até que valor você quer imprimir");
		int valorfinal = input.nextInt();
		for(int contador = 1; contador <= valorfinal; contador++){
			
			System.out.println(contador);
		};

	}

}
