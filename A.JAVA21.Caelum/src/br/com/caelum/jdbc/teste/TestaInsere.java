package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("jhon donavan");
		contato.setEmail("jhondonavan@gmail.com");
		contato.setEndereoco("Jardim Primavera - Duque de caxias");
		contato.setDataNascimento(Calendar.getInstance());

		//gravar na conexao
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		
		System.out.println("Contato gravado");
	}

}
