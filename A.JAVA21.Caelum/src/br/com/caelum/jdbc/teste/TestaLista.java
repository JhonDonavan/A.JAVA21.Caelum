package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		for (Contato  contato  : contatos){
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail()); 
			System.out.println("Endere�o: "+ contato.getEndereoco());
			System.out.println("Data de nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}

}
