package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidadades.Cliente;
import entidadades.ItensPedido;
import entidadades.Pedido;
import entidadades.Produto;
import entidadades.enumeradas.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do cliente: ");
		System.out.println("Nome: ");
		String nomeC = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento (dd/mm/aaaa): ");
		Date dataNasc = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nomeC, email, dataNasc);
		
		System.out.println("Informe os dados do pedido: ");
		System.out.println("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next().toUpperCase());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantidade de itens: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("Informe os dados do item " + i + ": ");
			System.out.println("Nome do produto: ");
			String nomeP = sc.next();
			System.out.println("Preço do produto: R$");
			Double precoP = sc.nextDouble();
			
			Produto produto = new Produto(nomeP, precoP);
			
			System.out.println("Quantidade: ");
			Integer qtde = sc.nextInt();
			
			ItensPedido ip = new ItensPedido(qtde, precoP, produto);
			
			pedido.addItem(ip);
		}
		
		System.out.println("----RESUMO DO PEDIDO----");
		System.out.println(pedido);
		
		sc.close();
		
	}

}
