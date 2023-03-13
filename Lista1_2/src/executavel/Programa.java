package executavel;

import java.util.Scanner;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a altura do retângulo: ");
		retangulo.altura = sc.nextFloat();
		System.out.println("Insira a largura do retângulo: ");
		retangulo.largura = sc.nextFloat();
		
		System.out.println("Altura: " + retangulo.getAltura());
		System.out.println("Largura: " + retangulo.getLargura());
		System.out.println("Área: " + retangulo.getArea());
		System.out.println("Perímetro: " + retangulo.getPerimetro());
		System.out.println("Diagonal: " + retangulo.getDiagonal());
	}

}
