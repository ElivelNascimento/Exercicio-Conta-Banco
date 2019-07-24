package br.com.resource.conta.banco;

public class Conta{

	private String tipoConta;
	private int numero;
	private String titular;
	private double saldo;
	static int qtdContas = 0;

	public Conta(String ptitular) {
		this.titular = ptitular;
		qtdContas++;
		this.numero = qtdContas;
		this.saldo = 0;
	}

	public void DadosBancarios() {
		System.out.println("");
		System.out.println(" -- Dados Bancários --");
		System.out.println(" -- Tipo da conta: " + this.tipoConta);
		System.out.println(" -- Número: " + this.numero);
		System.out.println(" -- Titular : " + this.titular);
		System.out.println(" -- Saldo: " + this.saldo);
		System.out.println(" --- Fim de dados bancarios ---");
		System.out.println("");
	}

	public void Depositar(double pValor) {

		System.out.println("");
		System.out.println(" -- Realizando Depósito --");
		System.out.println(" -- Saldo Anterior: " + this.saldo);

		this.saldo += pValor; // poderia ser this.saldo = this.saldo + pValor;

		System.out.println(" - Saldo Posterior: " + this.saldo);
		System.out.println(" --- Fim do depósito --- ");
		System.out.println("");
	}

	public void Sacar(double pValor) {

		System.out.println("");
		System.out.println(" -- Realizando Saque --- ");
		System.out.println(" -- Saldo Anterior: " + this.saldo);

		if (pValor <= this.saldo) {

			this.saldo -= pValor - 10;
			System.out.println(" - Saldo Posterior: " + this.saldo + " taxa de R$10,00 de desconto.");
		} else {
			System.out.println(" - Saldo insuficiente");
		}
		System.out.println(" -- Fim do Saque -- ");
		System.out.println("");
	}

	public void Transferir(Conta dest, double valor) {

		System.out.println("");
		System.out.println(" -- Realizando Transfêrencia --- ");
		System.out.println(" -- Saldo Anterior Origem: " + this.saldo + " taxa de R$10,00 de desconto.");
		System.out.println(" -- Saldo Anterior Destino: " + dest.saldo);

		if (valor <= this.saldo) {

			this.saldo -= valor - 10;
			dest.saldo += valor;
			System.out.println(" - Saldo Posterior Origem: " + this.saldo);
			System.out.println(" - Saldo Posterior Destino: " + dest.saldo);
		} else {
			System.out.println(" - Saldo insuficiente");
		}
		System.out.println(" -- Fim do Transferência -- ");
		System.out.println("");

	}

}
