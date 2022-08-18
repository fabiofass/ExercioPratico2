package aula03;

import java.util.Scanner;

public class BancoFuctura2 {

	public static void main(String[] args) {

		// Declarar variáveis
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o seu nome:");
		String nome = input.next();
		System.out.println("Digite o número da conta:");
		String conta = input.next();
		System.out.println("Faça um depósito inicial para a conta:");
		double saldo = input.nextDouble();
		System.out.println("Digite uma senha de 4 dígitos:");
		int senha = input.nextInt();
		boolean stop = true;
		do {
			System.out.println("\nPor favor, digite uma operação :" + "\n1 - Consultar saldo" + "\n2 - Fazer depósito"
					+ "\n3 - Fazer Saque" + "\n4 - Finalizar.");

			int operacao = input.nextInt();
			switch (operacao) {
			case 1:
				System.out.println("Nome do cliente: " + nome);
				System.out.println("Número da conta: " + conta);
				System.out.printf("Saldo da conta: R$ %.2f \n", saldo);
				break;
			case 2:
				// Deposito só é confirmado, se o usuário acertar a própria senha.
				System.out.println("Por favor, digite a sua senha:");
				int senha2 = input.nextInt();
				if (senha == senha2) {
					System.out.println("Digite o valor a ser depositado:");
					double valorD = input.nextDouble();
					saldo += valorD; // saldo = saldo + valor;
					System.out.println("Depósito realizado com sucesso!");
				} else {
					System.out.println("Senha incorreta!");
				}
				break;
			case 3:
				// Saque só é confirmado, se o usuário acertar a própria senha.
				System.out.println("Por favor, digite a sua senha:");
				int senha3 = input.nextInt();
				if (senha == senha3) {
					System.out.println("Digite o valor a ser sacado:");
					double valorS = input.nextDouble();
					// Condicional para retirar saldo apenas se saldo >= valorS
					if (saldo >= valorS) {
						saldo -= valorS; // saldo = saldo - valor;
						System.out.println("Saque realizado com sucesso!");
					} else {
						System.out.println("Saldo insuficiente");
					}
				} else {
					System.out.println("Senha incorreta!");
				}
				break;
			case 4:
				System.out.println("Obrigado pela atenção!");
				stop = false;
				break;
			default:
				break;
			}

		} while (stop);

	}

}
