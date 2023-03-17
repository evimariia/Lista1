package entidades;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConversorMoeda convert = new ConversorMoeda();
		
		double cotacaoDolar;
		double valorDolar;
		double valorPgto;
		
		System.out.println("Qual o preço do dólar? ");
		cotacaoDolar = sc.nextDouble();
		convert.setCotacaoDolar(cotacaoDolar);
		
		System.out.println("Quantos dólares serão comprados? ");
		valorDolar = sc.nextDouble();
		convert.setValorDolar(valorDolar);
		
		convert.setIOF(0.06);
		
		valorPgto = convert.converterMoeda();
		System.out.println("Valor a ser pago: R$" + valorPgto);
	}

}
