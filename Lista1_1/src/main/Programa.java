package main;

import java.util.Scanner;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int op = 0;
		
		String nome;
		double preco;
		double qtdEstoque;
		
		Produto p1 = new Produto();
		
		while(op != 4) {
			System.out.println("---MENU---");
			System.out.println("1. Cadastrar produto\n2.Adicionar estoque do produto\n3.Remover estoque do produto\n4.Sair");
			 System.out.println("Digite a opção desejada: ");
			op = sc.nextInt();
			
			switch(op) {
			 case 1:
				 System.out.println("Informe os dados do produto: ");
				 System.out.println("Nome: ");
				 nome = sc.next();
				 p1.setNome(nome);
				 
				 System.out.println("Preço: ");
				 preco = sc.nextDouble();
				 p1.setPreco(preco);
				 
				 System.out.println("Quantidade em estoque: ");
				 qtdEstoque = sc.nextDouble();
				 p1.setQtdEstoque(qtdEstoque);
				 
				 System.out.println("-----Dados do produto----- ");
				 System.out.println("Nome: " + p1.getNome());
				 System.out.println("Preço: R$" + p1.getPreco());
				 System.out.println("Quantidade em estoque: " + p1.getQtdEstoque());
				 System.out.println("Valor total correspondente ao estoque: R$" + p1.totalEstoque() + "\n");

			 break;
			 
			 case 2:
				 System.out.println("Informe a quantidade que deseja adicionar ao estoque: ");
				 double qtdeAdd = sc.nextDouble();
				 p1.addEstoque(qtdeAdd);
				 
				 System.out.println("-----Dados atualizados----- ");
				 System.out.println("Nome: " + p1.getNome());
				 System.out.println("Quantidade em estoque: " + p1.getQtdEstoque());
				 System.out.println("Valor total correspondente ao estoque: R$" + p1.totalEstoque() + "\n");
			 break;
			 
			 case 3:
				 System.out.println("Informe a quantidade que deseja remover do estoque: ");
				 double qtdeDel = sc.nextDouble();
				 p1.delEstoque(qtdeDel);
				 
				 System.out.println("-----Dados atualizados----- ");
				 System.out.println("Nome: " + p1.getNome());
				 System.out.println("Preço: R$" + p1.getPreco());
				 System.out.println("Quantidade em estoque: " + p1.getQtdEstoque());
				 System.out.println("Valor total correspondente ao estoque: R$" + p1.totalEstoque() + "\n");
			 break;
			}
		}

	}

}
