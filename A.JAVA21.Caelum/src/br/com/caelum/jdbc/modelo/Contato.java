package br.com.caelum.jdbc.modelo;

import java.util.Calendar;
//classe contato 2
public class Contato {
	private long id;
	private String nome;
	private String email;
	private String endereoco;
	private Calendar dataNascimento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getEndereoco() {
		return endereoco;
	}
	public void setEndereoco(String endereoco) {
		this.endereoco = endereoco;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}
