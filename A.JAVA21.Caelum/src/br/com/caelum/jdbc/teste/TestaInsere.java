package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import java.util.Scanner;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner (System.in);
		
		System.out.println("Digite o Nome do contato: \n");
		String nome = dados.nextLine().toLowerCase();
		
		System.out.println("Digite o email do contato: \n");
		String email = dados.nextLine().toLowerCase();
		
		System.out.println("Digite o endereco do contato: \n");
		String endereco = dados.nextLine().toLowerCase();
		
		Contato contato = new Contato();
		
	
		//pronto para gravar
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(Calendar.getInstance());

		//gravar na conexao
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		
		System.out.println("Contato gravado");
	}

}
