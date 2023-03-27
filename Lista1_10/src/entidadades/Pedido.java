package entidadades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entidadades.enumeradas.StatusPedido;

public class Pedido {
		
	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<ItensPedido> listaPedido = new ArrayList<>();
	
	public Pedido() {
		
	}
	
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
		
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public List<ItensPedido> getListaPedido() {
		return listaPedido;
	}

//	public void setListaPedido(List<ItensPedido> listaPedido) {
//		this.listaPedido = listaPedido;
//	}

	public void addItem(ItensPedido item) {
		listaPedido.add(item);
	}
	
	public void removeItem (ItensPedido item) {
		listaPedido.remove(item);
	}
	
	public double total() {
		double total = 0;
		
		for(ItensPedido item : listaPedido) {
			total = total + item.subtotal();
		}
		
		return total;
	}
	
//	Sobrescreve o método toString já existente no Java para retornar/imprimir o que se deseja
//	Serve para retornar informações das classes em formato de String de uma vez só
//	Se não for reescrito, o método imprime o nome da classe seguido por um arroba (@)
//	e pela representação do código de hash em hexadecimal sem sinal
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Dados do cliente-------------------\nNome: ");
		sb.append(cliente + "\n");
		sb.append("\n-----Itens do Pedido-----\n");
		for (ItensPedido item : listaPedido) {
			sb.append(item + "\n-----------------------\n");
		}
		sb.append("\nValor Total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
