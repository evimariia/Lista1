package aplicacao;

import java.util.Scanner;
import entidades.ContaB;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numConta;
		String titular;
		double depositoInicial;
		int op;
		int op2 = 0;
		
		ContaB conta = new ContaB();
		
		System.out.println("Informe o número da conta: ");
		numConta = sc.nextInt();
		conta.setNumConta(numConta);
		System.out.println("Informe o nome do titular: ");
		titular = sc.next();
		conta.setTitular(titular);
		System.out.println("Haverá um depósito inicial?\n1 - Sim\n2 - Não");
		op = sc.nextInt();
		
		if (op == 1) {
			System.out.println("Informe o valor do depósito inicial: ");
			depositoInicial = sc.nextDouble();
			conta.setDepositoInicial(depositoInicial);
			conta.setSaldo(depositoInicial);
		} else {
			conta.setDepositoInicial(0);
		}
		
		System.out.println("------DADOS DA CONTA------");
		System.out.println("Numero: " + conta.getNumConta());
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: R$" + conta.getSaldo());
		
		while (op2 != 4) {
			System.out.println("------MENU------");
			System.out.println("1 - Verificar saldo\n2 - Realizar depósito\n3 - Realizar saque\n4 - Sair");
			op2 = sc.nextInt();
			
			switch (op2) {
				case 1:
					System.out.println("R$" + conta.getSaldo());
					break;
				case 2:
					System.out.println("Digite o valor que deseja depositar: R$");
					double valorD = sc.nextDouble();
					conta.deposito(valorD);
					System.out.println("------DADOS DA CONTA ATUALIZADOS------");
					System.out.println("Numero: " + conta.getNumConta());
					System.out.println("Titular: " + conta.getTitular());
					System.out.println("Saldo: R$" + conta.getSaldo());
					break;
				case 3:
					System.out.println("Digite o valor que deseja sacar: R$");
					double valorS = sc.nextDouble();
					conta.saque(valorS);
					System.out.println("------DADOS DA CONTA ATUALIZADOS------");
					System.out.println("Numero: " + conta.getNumConta());
					System.out.println("Titular: " + conta.getTitular());
					System.out.println("Saldo: R$" + conta.getSaldo());
					break;
			}		
		}
		

	}

}
