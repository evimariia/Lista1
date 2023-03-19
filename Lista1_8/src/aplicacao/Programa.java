package aplicacao;

import java.util.Scanner;
import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Define quantidade de elementos que serão inseridos na lista
		System.out.println("Quantos funcionários deseja cadastrar? ");
		int n = sc.nextInt();		

		//cria lista de funcionários
		Funcionario[] listaFunc = new Funcionario[n];
		
		//variável auxiliar para comparar com o valor inserido e evitar repetição de id
		int old_id = 0;
		int id = 1;
		
		//criação de novos funcionários e inserção na lista
		for (int i = 0; i < n; i++) {	
			
			Funcionario func = new Funcionario();
			System.out.println("Funcionário " + (i+1));
			System.out.println("ID:");
			id = sc.nextInt();
			
			//evitar repetição de id
			if (id == old_id) {
				System.out.println("Erro: não foi possível cadastrar funcionário."
						+ "\nID informado repetido.");
				System.out.println("Informe outro ID: ");
				
				System.out.println("Funcionário " + (i+1));
				System.out.println("ID:");
				id = sc.nextInt();
				func.setId(id);
				System.out.println("Nome:");
				String nome = sc.next();
				func.setNome(nome);
				System.out.println("Salário:");
				double salario = sc.nextDouble();
				func.setSalario(salario);
				
			} else {
				func.setId(id);
				System.out.println("Nome:");
				String nome = sc.next();
				func.setNome(nome);
				System.out.println("Salário:");
				double salario = sc.nextDouble();
				func.setSalario(salario);
			}
			
			old_id = id;
			id = 0;
			
			//inserção do funcionário criado na lista de funcionários
			listaFunc[i] = func;
		}
		
		//mostra a lista de funcionários cadastrados, com seus respectivos dados
		System.out.println("Lista de funcionários: ");
		for (int j = 0; j < (listaFunc.length); j++) {
			System.out.println("Funcionário " + (j+1));
			System.out.println("ID: " + listaFunc[j].getId());
			System.out.println("Nome: " + listaFunc[j].getNome());
			System.out.println("Salário: " + listaFunc[j].getSalario());
			System.out.println("-------------------");
		}
		
		System.out.println("Informe o ID do funcionário que terá o salário alterado: ");
		int idBusca = sc.nextInt();
		
		int k = 0;
		//busca pelo elemento na lista
		while ( k < (listaFunc.length)) {
			int idAtual = listaFunc[k].getId();
			
			//se o elemento não for encontrado, continua a busca
			if(idBusca != idAtual) {
				k++;
			
			//se o elemento for encontrado, atualiza o valor do salário
			} else if (idBusca == idAtual) {
				System.out.println("Informe a porcentagem de aumento: ");
				double percent = sc.nextDouble();
				listaFunc[k].aumentarSalario(percent);
				
				//mostra dados do funcionário depois do aumento
				System.out.println("DADOS ATUALIZADOS");
				System.out.println("Funcionário " + (k+1));
				System.out.println("ID: " + listaFunc[k].getId());
				System.out.println("Nome: " + listaFunc[k].getNome());
				System.out.println("Salário: " + listaFunc[k].getSalario());
				break;
				
			} //else if (k == listaFunc.length && idBusca != idAtual){
//				
//				System.out.println("Erro: funcionário não encontrado.");
//				//break;
//			}
		}

		sc.close();
	}

}
