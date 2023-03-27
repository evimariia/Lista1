//Faça um programa para ler a cotação do dólar e um valor em dólares a ser comprado
//por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares,
//considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar
//uma classe ConversorMoeda para ser responsável pelos cálculos.
//Exemplo de Interação:
//Qual é o preço do dólar? 3,10
//Quantos dólares serão comprados? 200,00
//Valor a ser pago em reais = 657,20


package entidades;

//transformar em estático
public class ConversorMoeda {
	private double cotacaoDolar;
	private double valorDolar;
	private double valorPgto;
	private double IOF;
	
	
	
	public ConversorMoeda() {
	}

	public double getCotacaoDolar() {
		return cotacaoDolar;
	}
	
	public void setCotacaoDolar(double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}
	
	public double getValorDolar() {
		return valorDolar;
	}
	
	public void setValorDolar(double valorDolar) {
		this.valorDolar = valorDolar;
	}
	
	public double getValorPgto() {
		return valorPgto;
	}
	
	public double getIOF() {
		return IOF;
	}
	
	public void setIOF(double IOF) {
		this.IOF = IOF;
	}
	
	public double converterMoeda(){
		valorPgto = valorDolar * cotacaoDolar;
		valorPgto =  valorPgto + (valorPgto*IOF);
		return valorPgto;
		
	}
	
}
