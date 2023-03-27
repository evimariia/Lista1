package entidades;

public class ContaB {
	private int numConta;
	private String titular;
	private double depositoInicial;
	private double saldo;
	private double taxaSaque = 5;
		
	public ContaB(String titular, double depositoInicial, int numConta) {
		this.titular = titular;
		this.depositoInicial = depositoInicial;
		this.numConta = numConta;
		this.saldo = depositoInicial;
	}

	public ContaB() {
		
	}


	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getTaxaSaque() {
		return taxaSaque;
	}

	public double getSaldo() {
		return saldo;
	}


	//public void setSaldo(double saldo) {
	//	this.saldo = saldo;
	//}
	
	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	public double deposito(double valor) {
		saldo = saldo + valor;
		return saldo;
	}
	
	public double saque(double valor) {
		saldo = saldo - valor - taxaSaque;
		return saldo;
	}
	
}
