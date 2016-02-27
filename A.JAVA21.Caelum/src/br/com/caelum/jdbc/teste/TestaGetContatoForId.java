package br.com.caelum.jdbc.teste;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaGetContatoForId {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		long id;
		
		System.out.println("Digite o Id  do contato a ser pesquisado: ");
		id = dados.nextLong();
		
		ContatoDAO dao = new ContatoDAO();
	
		List<Contato> contatos = dao.GetContatoForId(id);
		if (contatos.isEmpty()){
			System.out.println("Contato não encontrado");
		}
		else {
			for (Contato contato : contatos){
			System.out.println("Id: " + contato.getId());
			System.out.println("nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("nome: " + contato.getEndereco());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			String dataFormatada = sdf.format(contato.getDataNascimento().getTime());
			System.out.println("Data de nascimento: " + dataFormatada );
			}
		}

	}

}
