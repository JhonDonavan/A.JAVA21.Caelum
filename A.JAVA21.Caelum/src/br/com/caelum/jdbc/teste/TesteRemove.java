package br.com.caelum.jdbc.teste;

import java.util.Scanner;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteRemove {

	public void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		
		System.out.println("Digite o Id do contato a ser removido: ");
		long remover = dados.nextLong();
		
		Contato contato = new Contato();
		contato.setId(remover);
		
		ContatoDAO dao = new ContatoDAO();
		dao.remove(contato);
		

	}

}
