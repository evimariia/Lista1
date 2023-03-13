package aplicacao;

import java.util.Scanner;
import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		String nome;
		float salarioB;
		float imposto;
		float reajuste;
		
		System.out.println("Nome: ");
		nome = sc.next();
		func.setNome(nome);
		
		System.out.println("Salário bruto: R$");
		salarioB = sc.nextFloat();
		func.setSalario_b(salarioB);
		
		System.out.println("Imposto: R$");
		imposto = sc.nextFloat();
		func.setImposto(imposto);
		
		func.setSalario_l();
		System.out.println("Empregado: " + func.getNome() + ", R$" + func.getSalario_l());
		
		System.out.println("Qual o percentual de reajuste?");
		reajuste = sc.nextFloat();
		func.reajustarSalario(reajuste);
		
		System.out.println("Dados atualizados: " + func.getNome() + ", R$" + func.getSalario_l());
	}

}
