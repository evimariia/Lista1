package entidadades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private String nome;
	private String email;
	private Date dataNasc;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//construtor default
	public Cliente() {
		
	}

	//construtor
	public Cliente(String nome, String email, Date dataNasc) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return nome + " \nData de nascimento: " + sdf.format(dataNasc) + " \nEmail: " + email;
	}
	

}
