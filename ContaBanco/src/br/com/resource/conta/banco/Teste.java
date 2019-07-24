package br.com.resource.conta.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String aux;
		int opcao, numero, numero2;
		double valor;
		Conta conta, conta2;
		String tipoConta;
		ArrayList<Conta> listaConta = new ArrayList();

		System.out.println(" === Banco da Alegria === ");
		System.out.println("");

		do {
			System.out.println("");
			System.out.println("--- MENU ---");
			System.out.println(" [1] Criar Conta");
			System.out.println(" [2] Dados Bancários");
			System.out.println(" [3] Depósito");
			System.out.println(" [4] Saque");
			System.out.println(" [5] Transferência");
			System.out.println(" [0] Sair");

			System.out.print(" Opção: ");
			opcao = in.nextInt();
			in.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o tipo de conta (Poupança)/(Corrente) ");
				tipoConta = in.nextLine();
				System.out.println("Digite o nome do titular: ");
				aux = in.nextLine();

				conta = new Conta(aux);
				listaConta.add(conta);
				System.out.println("Conta criada com sucesso.");
				break;

			case 2:
				System.out.println("Digite o número da conta: ");
				numero = in.nextInt();

				conta = listaConta.get(numero - 1);
				conta.DadosBancarios();
				break;
			case 3:
				System.out.println("Digite o número da conta: ");
				numero = in.nextInt();
				conta = listaConta.get(numero - 1);
				System.out.println("Digite o valor depósito: ");
				valor = in.nextDouble();
				conta.Depositar(valor);
				break;
			case 4:
				System.out.println("Digite o numero da conta: ");
				numero = in.nextInt();

				conta = listaConta.get(numero - 1);

				System.out.println("Digite o valor para saque: ");
				valor = in.nextDouble();

				conta.Sacar(valor);
				break;

			case 5:
				System.out.println("Digite o numero da conta de origem: ");
				numero = in.nextInt();
				conta = listaConta.get(numero - 1);

				System.out.println("Digite o número da conta de destino: ");
				numero2 = in.nextInt();
				conta2 = listaConta.get(numero2 - 1);

				System.out.println("Digite o valor da transferência: ");
				valor = in.nextDouble();

				conta.Transferir(conta2, valor);
				break;

			default:
				if (opcao != 0)
					System.out.println("Opção Inválida");
				break;
			}

			System.out.println("");

		} while (opcao != 0);

	}

}
