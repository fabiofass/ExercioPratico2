package aula03;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor");
		int condicao = entrada.nextInt();
		switch (condicao) {
		case 1:
			
			System.out.println("Primeiro case foi acionado");
			break;
		case 2:
			System.out.println("Segundo case foi acionado");
			break;

		case 3:
			System.out.println("Terceiro case foi acionado");
			break;
		case 4:
			System.out.println("Quartpo case foi acionado");
			break;
		case 5:
			System.out.println("Quinto case foi acionado");
			break;
		default:
			System.out.println("Nenhum case foi acionado!");
			break;

		}
	}

}
