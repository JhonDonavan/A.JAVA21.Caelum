package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		//pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Joao Emmanuel");
		contato.setEmail("GJoaoemmanuel@gmail.com");
		contato.setEndereoco("Campo Grande - Rio de Janeiro");
		contato.setDataNascimento(Calendar.getInstance());

		//gravar na conexao
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		
		System.out.println("Contato gravado");
	}

}
