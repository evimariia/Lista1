package aplicacao;

import java.util.Scanner;
import entidades.Estudante;

public class Programa {

	public static void main(String[] args) {
		String nome;
		double n1;
		double n2;
		double n3;
		double nf;
		
		Scanner sc = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		
		System.out.println("Nome: ");
		nome = sc.next();
		aluno.setNome(nome);
		System.out.println("Nota 1: ");
		n1 = sc.nextDouble();
		aluno.setN1(n1);
		System.out.println("Nota 2: ");
		n2 = sc.nextDouble();
		aluno.setN2(n2);
		System.out.println("Nota 3: ");
		n3 = sc.nextDouble();
		aluno.setN3(n3);
		
		aluno.setNf();
		
		nf = aluno.getNf();
		
		if(nf>=60) {
			System.out.println("Nota final:" + nf + "\nAluno aprovado");
			
		} else {
			System.out.println("Nota final:" + nf + "\nAluno reprovado");
			double faltante = 60 - nf;
			System.out.println("Faltaram " + faltante + " pontos");
		}


	}

}
