/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao
final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado
ou não e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para
ser aprovado (que é 60% da nota). Você deve criar uma classe Estudante para resolver
este problema.*/

package entidades;

public class Estudante {
	private String nome;
	private double n1; //30
	private double n2; //35
	private double n3; //35
	private double nf; 
	
	public Estudante(String nome, double n1, double n2, double n3, double nf) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.nf = nf;
	}

	public Estudante() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getNf() {
		return nf;
	}

	public void setNf() {
		nf = n1 + n2 + n3;
	}
		

}
