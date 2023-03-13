package entidades;

public class Funcionario {
	private String nome;
	private float salario_b;
	private float imposto;
	public float salario_l;
	
	public Funcionario(String nome, float salario_b, float imposto) {
		super();
		this.nome = nome;
		this.salario_b = salario_b;
		this.imposto = imposto;
	}

	public Funcionario() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario_b() {
		return salario_b;
	}

	public void setSalario_b(float salario_b) {
		this.salario_b = salario_b;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public float getSalario_l() {
		return salario_l;
	}

	public void setSalario_l() {
		salario_l = salario_b - imposto;
	}
	
	public void reajustarSalario(float reajuste) {
		float percent = reajuste/100;
		salario_l = salario_l + (salario_b * percent);
	}
	
	
}
