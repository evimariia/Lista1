package entidades;

public class Produto {
	String nome;
	double preco;
	double qtdEstoque;
	
	public Produto(String nome, double preco, double qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	public void addEstoque(double qtde) {
		qtdEstoque += qtde;
	}
	
	public void delEstoque(double qtde) {
		qtdEstoque -= qtde;
	}
	
	public double totalEstoque() {
		double valorTotal = qtdEstoque*preco;
		return valorTotal;
	}
}
