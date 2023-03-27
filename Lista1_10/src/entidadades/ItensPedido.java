package entidadades;

public class ItensPedido {
	
	private Integer qtde;
	private double preco;
	
	private Produto produto;
	
	public ItensPedido() {
		
	}
	
	public ItensPedido(Integer qtde, double preco, Produto produto) {
		this.qtde = qtde;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		produto.setPreco(preco);
		this.preco = produto.getPreco();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subtotal() {
		double subt = qtde * preco;		
		return subt;
	}
	
	@Override
	public String toString() {
		return produto.getNome() + 
				String.format("\nPreço: R$ %.2f", preco) +
				"\nQuantidade: " + qtde +
				"\nSubtotal: " + String.format("R$ %.2f", subtotal());
	}
}
