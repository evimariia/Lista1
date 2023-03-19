package aplicacao;

import java.util.Scanner;
import entidades.Alugar;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alugar[] registro = new Alugar[10];
		
		System.out.println("Digite o número de quartos que serão reservados: ");
		int n = sc.nextInt();
		
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Aluguel nº " + (i+1) + ":");
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			
			registro[quarto] = new Alugar(nome, email);
		}
		
		int j;
		System.out.println("---Lista de quartos---");
		for (j = 0; j<= (registro.length -1); j++) {			
			if(registro[j] == null) {
				System.out.println("Quarto " + j + ": LIVRE");
			} else {
				System.out.println("Quarto " + j + ": " + registro[j].imprimir());
			}
			
		}
		

	}

}
